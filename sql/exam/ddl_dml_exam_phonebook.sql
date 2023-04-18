

-- 전화번호 저장 테이블


-- 전화번호부 테이블을 기준으로 DML 을 작성해봅시다.

-- 1. phoneInfo_basic 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
create table phoneInfo_basic (
    idx number(6)constraint PK_phoneInfo_basic_idx primary key,
    fr_name varchar2(20) not null,
    fr_phonenumber varchar2(20) not null,
    fr_email varchar2(20),
    fr_address varchar2(20),
    fr_regdate date default sysdate
);

desc pnoneinfo_basic;
insert into phoneInfo_basic
values (1, 'KING', '010-0000-0000', 'king@gmail.com', 'KOREA', default)
;

insert into phoneinfo_basic (idx, fr_name, fr_phonenumber)
values (2, 'SCOTT', '010-9999-9999')
;

select * from phoneinfo_basic;
select * from phoneinfo_basic where idx=1;
select * from phoneinfo_basic where idx=2;


-- 2. phoneinfo_univ 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
create table phoneInfo_univ (
    idx number(6) constraint PK_phoneInfo_univ_idx primary key,
    fr_u_major varchar2(20) default 'N' not null,
    fr_u_year number(1) default 1 check(fr_u_year between 1 and 4) not null,
    fr_ref number(7) constraint REF_phoneInfo_univ_fr_ref references phoneInfo_basic(idx) not null
);


-- 3. phoneinfo_com 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
create table phoneinfo_com (
    idx number(6) constraint PK_phoneInfo_com_idx primary key,
    fr_c_company varchar2(20) default 'N' not null,
    fr_ref number(6) constraint REF_phoneInfo_com_fr_ref references phoneInfo_basic(idx) not null
);