
-- 2023.04.12
-- 함수

desc dual;
select * from dual;

-- 단일행 함수 / 집합(그룹)함수
-- 단일행 함수 : 숫자, 문자, 날짜, 변환, 기타 함수

-- 숫자 함수
-- 절대값 abs
select 10, -10, abs(-10), abs(10) from dual;

-- floor : 소수점 아래를 절사
select 2.1, 2.9, floor(2.1), floor(2.9) from dual;

-- round : 지정 위치에서 반올림 처리
--     1234.567        1235             1234.6              1240
select 1234.567, round(1234.567), round(1234.567, 1), round(1237.567, -1) from dual;

-- trunc : 특정 자리수 아래를 절사
--     1234.567        1234             1234.5              1230
select 1234.567, trunc(1234.567), trunc(1234.567, 1), trunc(1234.567, -1) from dual;

-- mod : 나머지 연산
--           1         2         0         3(원칙적으론 0으로 나누면 안됨)
select mod(1,3), mod(2,3), mod(0,3), mod(3,0) from dual;


-- 문자 함수
--lower : 문자열 모두를 소문자로 변경
select 'SCOTT', lower('SCOTT') from dual;
select dname, lower(dname) from dept;

--upper : 문자열 모두를 대문자로 변경
select 'scott', upper('scott') from dual;

--initcap : 문자열 첫문자를 대문자로 변경
select initcap('scott') from dual;

-- substr(원본, 시작위치), substr(원본, 시작위치, 반환할 문자의 개수) : 문자열을 추출
select '안녕하세요. 손흥민입니다.', 
        substr('안녕하세요. 손흥민입니다.', 5), -- 요. 손흥민입니다.
        substr('안녕하세요. 손흥민입니다.', 2, 8) -- 녕하세요. 손흥
from dual;

-- length(원본문자열) : 문자열의 개수
select length('안녕하세요.!!!!') from dual; -- 10

-- lpad, rpad : 문자열에서 특정 자리수를 지정하고 자리에 데이터가 없을 때 패턴을 입력
--                      00010              11AAA 
select '10', lpad('10', 5, '0'), rpad(11, 5 , 'A') from dual;
select deptno, lpad(deptno, 5, '0') from dept;

-- trim() : 공백 제거
select '     ABC     ',
        trim('     ABC     '), --ABC
        trim('     ABC'), --ABC
        trim('ABC     ') --ABC
from dual;

-- replace : 문자열에서 특정 문자를 다른 문자로 치환
select 'Steven King', 
        replace('Steven King', 'Steven', 'S.'), -- S. King
        replace('Steven King', 'Steven', '') -- King
from dual;


-- 날짜 함수
-- SYSDATE : 시스템 저장된 현재 날짜를 반환한다.
select sysdate from dual;

-- MONTHS_BETWEEN : 두 날짜 사이가 몇 개월인지를 반환한다
select sysdate, months_brtween('23/12/15', sysdate) from dual;

-- ADD_MONTHS : 특정 날짜에 개월 수를 더한다.
select add_months(sysdate, 8) from dual;
select add_months(sysdate, 2) from dual;
select add_months(sysdate, -2) from dual;

-- NEXT_DAY : 특정 날짜에서 최초로 도래하는 인자로 받은 요일의 날짜를 반환한다.
select next_day(sysdate, 1) from dual; --다음주

-- LAST_DAY : 해당 달의 마지막 날짜를 반환한다.
select last_day(sysdate) from dual;

-- ROUND: 인자로 받은 날짜를 특정 기준으로 반올림한다.
select round(sysdate) from dual;

-- TRUNC : 인자로 받은 날짜를 특정 기준으로 버린다.
select trunc(sysdate) from dual;


-- 변환함수
-- DATE -> CHAR
-- to_char(원본, '패턴')
select sysdate,
        to_char(sysdate, 'YYYY-MM-DD'),
        to_char(sysdate, 'YYYY.MM.DD.'),
        to_char(sysdate, 'YYYY-MM-DD DAY'), -- 2023-04-12 수요일
        to_char(sysdate, 'YYYY-MM-DD DY'), -- 2023-04-12 수
        to_char(sysdate, 'YYYY.MM.DD. HH24:MI:SS')
from dual;

-- number -> char
select 123456789,
        to_char(123456789, '000000000000'), -- 000123456789
        to_char(123456789, '000,000,000,000'), -- 000,123,456,789
        to_char(123456789, '999999999999'), --    123456789(앞 공백)
        to_char(123456789, '999,999,999,999'), --     123,456,789(앞 공백)
        to_char(123456789, 'L999,999,999,999'), -- \123,456,789
        to_char(123456789, '999,999') -- ######## 자리수가 원본보다 적으면 맞게 표현X
from dual;

select ename, sal, to_char(sal*1300, 'L999,999,999') as wonSAL
from emp;

-- char -> Date
-- to_date('문자열', '패턴')
select *
from emp
where hiredate = to_date('1981-02-20', 'YYYY-MM-DD')
--to_date('02198120', 'YYYYMMDD')
;

insert into emp values(9999, 'SON', 'MANAGER', 7782, to_date('2023-04-12', 'YYYY-MM-DD'), 4000, null, 10);
select * from emp;
rollback; -- 마지막 commit 시점으로 복귀

-- char -> number
-- to_number('문자열', '패턴') => 숫자 타입
select '20000' - '10000'
from dual;

select '20,000' - '10,000' -- 이 형식은 오류. 아래와 같이 입력해줘야함
from dual;

select to_number('20,000', '999,999,999') - to_number('10,000','99,999')
from dual;


-- decode 함수 => = 비교 연산 후 결과를 출력하는 함수. switch~case와 유사
select ename, deptno,
        decode(deptno,
                10, 'ACCOUNTING',
                20, 'RESEARCH',
                30, 'SALES',
                40, 'OPERATIONS'
        ) as dname 
from emp
order by deptno -- 값에 맞게 출력이 됐는지 확인하기 위함
;



--8. 직급에 따라 급여를 인상하도록 하자. 
--직급이 'ANAlYST'인 사원은 5%, 'SALESMAN'인 사원은 10%,'MANAGER'인 사원은 15%, 'CLERK'인 사원은 20%인 인상한다.
--직급이 'PRESIDENT'인 경우는 그대로 출력
select empno, ename, job, sal,
        decode( job,
            'ANAlYST', sal*1.05,
            'SALESMAN', sal*1.1,
            'MANAGER', sal*1.15,
            'CLERK', sal*1.2
            ) SalUp
from emp;

-- 위랑 아래 같은거지만 위는 president가 null값 나오기때문에 아래 걸로 사용
select ename, job, sal,
nvl(decode (job,
             'ANALYST', sal*1.05, 
            'SALESMAN', sal*1.1,
                'MANAGER', sal*1.15, 
                'CLERK', sal*1.2 
                ), sal) as Salup
from emp;


-- CASE 함수 => = 비교 연산 후 결과를 출력하는 함수. if else if else와 유사
select ename, deptno,
        decode(deptno,
                10, 'ACCOUNTING',
                20, 'RESEARCH',
                30, 'SALES',
                40, 'OPERATIONS'
        ) as dname,
        case when deptno=10 then 'ACCOUNTING'
            when deptno=20 then 'RESEARCH'
            when deptno=30 then 'SALES'
            else 'OPERATIONS'
        end as dname2
from emp
order by deptno
;


-- 그룹함수, 집합함수, 집계함수, 다중행 함수
-- 하나의 행이 아닌 다중행을 그룹으로 묶어서 처리
-- sum, avg, count, max, min

-- 급여 총액을 구해보자
select sum(sal), to_char(sum(Sal), 'L999,999')
from emp;

-- 커미션의 총합
select sum(comm), count(comm), avg(comm)
from emp;
select comm from emp where comm is not null;

-- 평균 급여를 구해보자
select avg(sal), trunc(avg(sal)), round(avg(sal),2)
from emp;

-- 최대 급여 max(), 최소 급여 min()
select max(sal), min(sal)
from emp;

-- count () => row 개수
-- 전체 사원의 수
select count(*)
from emp;

-- 10번 부서의 사원 수
select count(*) from emp where deptno=10;

-- 부서의 개수
select count(*) from dept;

-- 직업의 종류가 몇 개인지 즉, 중복되지 않은 직업의 개수를 카운트 해봅시다
select distinct job 
from emp
order by job
;
select count(distinct job)
from emp;

select * from emp order by deptno;

-- group by => 행 단위로 그룹핑
select deptno, 
        count(*) as "사원의수", 
        sum(sal) as "총급여액", 
        trunc(avg(sal)) as "평균급여액",
        max(sal) as "최고급여액",
        min(sal) as "최소급여액",
        count(comm) as "커미션을받는사원수"
from emp 
group by deptno
-- 그룹의 평균 급여가 2000 이상인
--having avg(Sal)>=2000 -- 그룹핑된 데이터의 집합함수 결과를 조건식으로 만들 때
-- 총 급여액이 10000 넘어가는 그룹
having sum(sal) > 10000
order by deptno
;

select job, count(*), trunc(avg(sal)), sum(sal), max(sal), min(sal), max(sal)-min(sal)
from emp 
group by job
;