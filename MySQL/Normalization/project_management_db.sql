create database project_management_db;
use project_management_db;
create table project(
	project_code int not null,
    project_title varchar(11),
    project_manager varchar(11),
    project_budget int,
    
    primary key (project_code)
    
);

create table employee (
	employee_no varchar(11) not null,
    emp_name varchar(11),
    
    primary key (employee_no)
    
);


select * from employee;
create table department(
	dept_no varchar(15)  not null ,
    dept_name varchar(15),
    primary key (dept_no)
);

alter table project add column employee_no varchar(11);
alter table project add foreign key (employee_no) references employee(employee_no);


alter table project modify column employee_no varchar(11);
alter table project drop column employee_no;


alter table employee add column dept_no varchar(15);
alter table employee add foreign key (dept_no) references department(dept_no);


drop table project;
drop table employee;
drop table department;