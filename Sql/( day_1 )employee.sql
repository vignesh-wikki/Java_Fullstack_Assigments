create table tbl_employee (EID NUMBER(5),ENAME VARCHAR2(20),ESALARY NUMBER(5));
desc tbl_employee;
insert into tbl_employee values (101,'Vignesh',1000);
insert into tbl_employee values (102,'Vicky',2000);     CREATE TABLE TBL_EMPLOYEE (
    EID NUMBER(5),
    ENAME VARCHAR2(20),
    ESALARY NUMBER(5)
);
insert into tbl_employee values (103,'Shivan',3000);
SELECT * FROM tbl_employee;
commit;
SELECT * FROM tbl_employee;
insert into tbl_employee values (101,'Vimal',6000);
commit;
select eid from tbl_employee;
select distinct eid from tbl_employee;
select * from tbl_employee;
select * from tbl_employee where eid = 101;
select * from tbl_employee where ename = 'Vignesh';
select * from tbl_employee where esalary > 4000;
select * from tbl_employee where ename != 'Vijay';
select * from tbl_employee where ename <> 'Vignesh';
update tbl_employee set esalary=7000 where eid=102;
select * from tbl_employee;
commit;
update tbl_employee set esalary=7000,ename='Ajay' where ename='Vimal';

commit;
select * from tbl_employee;
delete from tbl_employee where eid=101;
select * from tbl_employee;
select * from tbl_employee where eid in (101,102,103,104);
select * from tbl_employee where eid in (101,102,103,104);
select * from tbl_employee where eid not in (101,102,104); 