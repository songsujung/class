-- 2023.04.13

-- JOIN

-- CROSS JOIN
-- 스키마를 붙이고 결과 행은 모든 경우의 수 = n * m
-- emp, dept => 14 * 4 => 56
select *
from emp, dept
;

--(위와 같은 결과)
select *
from emp cross join dept
;




--Equi Join
select *
from emp, dept
where emp.deptno=dept.deptno
;

--(위와 같은 결과)
select *
from emp inner join dept
on emp.deptno=dept.deptno
;

--(위와 같은 결과2)
select *
from emp  join dept
on emp.deptno=dept.deptno
;


--테이블에 별칭 부여하기
select e.deptno , d.deptno
from emp e, dept d
where e.deptno = d.deptno
;

--이름이 SCOTT인 사람의 부서명을 출력해봅시다. 
select deptno from emp where ename='SCOTT';
--20
select dname from dept where deptno = 20;

--Equi Join으로 해결
select e.ename, d.dname
from emp e, dept d
where e.deptno=d.deptno
      and e.ename ='SCOTT'
;




-- natural join : 동일한 이름의 컬럼이 있는 경우 둘 중 하나는 생략하고, 하나만 출력
select *
from emp natural join dept
;

--(위와 같은 결과)
select *
from emp join dept
using(deptno)
;




-- Non-Equi Join 
-- 사원별 급여 등급 표현
select e.ename, s.grade, s.losal, e.sal, s.hisal
from emp e, salgrade s
where e.sal between s.losal and hisal
;




-- SELF JOIN : 자기 자신의 테이블을 조인하는 경우.
-- 각 사원의 이름과 각 사원의 매니저 이름을 출력.
select e.ename, m.ename
from emp e, emp m
where e.mgr=m.empno
;




-- OUTER JOIN : 조건에 만족하지 않는 행도 출력을 하는 JOIN.
select e.ename, nvl(m.ename, '없음')
from emp e, emp m
where e.mgr=m.empno(+)
;




-- Outer Join - LEFT OUTER JOIN 
select *
from emp e left outer join emp m
on e.mgr=m.empno
;



-- 도서 판매 정보 출력
select * from orders;

select o.orderid, c.name, b.bookname, o.saleprice, o.orderdate
from orders o, customer c, book b
where o.custid=c.custid and o.bookid=b.bookid
;
