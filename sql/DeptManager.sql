

-- DEPT MANAGER

-- 1. List
select * from dept;

-- 2. search
select * from dept where deptno+10;
-- select * from dept where deptno=
select * from dept where dname='ACCOUNTING';
-- select * from dept where dname=?

-- 3. insert
insert into dept values (50, 'Test', 'Seoul');
-- insert into dept values (?, ?, ?);
rollback; -- 마지막 커밋시점으로 되돌아간다.

-- 4. 수정 update
update dept set dname = 'AAA', loc = 'BBB' where deptno = 60;
-- update dept set dname=?, loc=? where deptno=?;

-- 5. delete
delete from dept where deptno = 60;
-- delete from dept where deptno=?

rollback;
