create table emp (id number,ename varchar(20),esalary number(10));
insert all
 into emp (id,ename,esalary) values (101,'valan',2000) 
 into emp (id,ename,esalary) values (102,'raj',7000)
 into emp (id,ename,esalary) values (101,'kumar',4000) 
 into emp (id,ename,esalary) values (104,'ajith',7000) 
 into emp (id,ename,esalary) values (105,'ajay',6000) 
select * from dual;
desc emp;
select * from emp;
update emp set id=103 where id=101 and ename=kumar;
update emp set id=103 where id=101 and ename='kumar';
select * from emp;
select * from emp where esalary between 2000 and 6000;
select * from emp where esalary >=4000 and id in (101,103);
select * from emp where esalary >=4000 and id in (101,103);
select * from emp where esalary >=4000 or id in (101,103);
select * from emp where ename like 'V%';
select * from emp where ename like 'v%';
select * from emp where ename like '_a%';
select * from emp where ename not like '_a%';
select * from emp where ename not like '%a%';
select * from emp where ename like '%a%';
select * from emp where ename like '%r';
insert into emp (id,esalary) values (501,2000);
select * from emp where ename is not null;
select * from emp where ename is null;
SELECT * FROM RECYCLEBIN;
select * from emp order by id;
select * from emp order by id desc;
select * from emp order by ename;
select * from emp order by id,ename;
select * from emp order by id,ename desc;
alter table emp add doj date;
update emp set doj=sysdate where id=103;
update emp set doj='6-AUG-24' where id=101;
select * from emp;
alter table emp drop column doj;
select * from emp;
alter table emp rename column ename to name;
rename emp to employee;
