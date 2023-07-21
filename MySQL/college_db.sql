create database college_db;
use college_db;
create table students(
	st_id int not null auto_increment,
    st_name varchar(15),
    st_age int ,
    st_email varchar(15),
    primary key (st_id)
);

create table department(
	dept_id int not null auto_increment,
    dept_name varchar(15),
    primary key (dept_id)
);

create table course(
	c_id int not null auto_increment,
    c_name varchar(15),
    primary key (c_id)
    
);
alter table students add column dept_id int;
alter table students add foreign key (dept_id) references department(dept_id);

create table students_courses(
	st_id int,
    c_id int,
    foreign key (st_id) references students(st_id),
    foreign key (c_id) references course(c_id)
);

select * from department;
insert into department values (1,'CS');
insert into department values (2,'CS');
insert into department values (3,'SW');
insert into department values (4,'IN');
insert into department values (5,'SW');
insert into department values (6,'CS');

delete from department where dept_id in (2,5,6);
alter table students modify column st_email varchar(20);

select * from students;
insert into students values(101,'Amir',22,'amir@gmail.com',1);
insert into students values(102,'Touqeer',20,'touqeer@gmail.com',1);
insert into students values(103,'Adeel',21,'adeel@gmail.com',4);
insert into students values(104,'Ubaid',20,'ubaid@gmail.com',1);
insert into students values(105,'Eid',22,'eid@gmail.com',3);
insert into students values(106,'Adarsh',22,'adarsh@gmail.com',3);
insert into students values(107,'Inam',22,'inam@gmail.com',1);
insert into students values(108,'Saqib',22,'saqib@gmail.com',1);
insert into students values(109,'zulfqar',21,'zulfi@gmail.com',3);
insert into students values(110,'Ali',22,'ali@gmail.com',1);


select * from course;
insert into course values(1,'OOP');
insert into course values(2,'DSA');
insert into course values(3,'DBMS');
insert into course values(4,'MAPD');
insert into course values(5,'WE');

select * from students_courses;
alter table students_courses add column marks int;
-- truncate table students_courses;
insert into students_courses values(101,1);
insert into students_courses values(101,2);
insert into students_courses values(102,1);
insert into students_courses values(102,4);
insert into students_courses values(103,2);
insert into students_courses values(102,5);
insert into students_courses values(104,1);
insert into students_courses values(105,4);
insert into students_courses values(105,1);
insert into students_courses values(105,3);
insert into students_courses values(106,4);
insert into students_courses values(101,3);
insert into students_courses values(101,4);
insert into students_courses values(101,5);
insert into students_courses values(102,2);
insert into students_courses values(102,3);

-- adding marks of each student
update students_courses set marks=83 where st_id=101 and c_id=1;
update students_courses set marks=80 where st_id=101 and c_id=2;
update students_courses set marks=89 where st_id=101 and c_id=3;
update students_courses set marks=90 where st_id=101 and c_id=4;
update students_courses set marks=93 where st_id=101 and c_id=5;
update students_courses set marks=92 where st_id=102 and c_id=1;
update students_courses set marks=78 where st_id=102 and c_id=2;
update students_courses set marks=95 where st_id=102 and c_id=4;
update students_courses set marks=79 where st_id=102 and c_id=5;

update students_courses set marks=90 where st_id=103 and c_id=2;
update students_courses set marks=75 where st_id=104 and c_id=1;
update students_courses set marks=82 where st_id=105 and c_id=1;
update students_courses set marks=88 where st_id=105 and c_id=3;
update students_courses set marks=81 where st_id=105 and c_id=4;
update students_courses set marks=82 where st_id=106 and c_id=4;


-- Performing queries
--  write a sql query to retrun all the students with thier department name
select st_id ,st_name , st_email , dept_name from students s inner join department d on s.dept_id = d.dept_id;

--  write a sql query to retrun all the students with thier courses
select  s.st_id ,s.st_name , s.st_email, sc.c_id, c.c_name
from students s inner join students_courses sc on s.st_id=sc.st_id 
inner join course c on sc.c_id = c.c_id;

--  write a sql query to retrun all the students with thier courses and marks in each course
select s.st_id ,s.st_name , s.st_email, c.c_name, sc.marks from students s
inner join students_courses sc on s.st_id=sc.st_id
inner join course c on c.c_id = sc.c_id;

--  write a sql query to count curses of each student
select sc.st_id, s.st_name, count(c_id) as 'No of Courses' from  students_courses sc 
inner join students s on sc.st_id=s.st_id
group by st_id ;

--  write a sql query to sum marks of all the courses
select s.st_id, s.st_name, sum(marks) as 'Total marks' from students_courses sc 
inner join students s on s.st_id=sc.st_id
group by s.st_id;

--  write a sql query to avg marks of student
select s.st_id, s.st_name, avg(marks) as 'Average marks' from students_courses sc 
inner join students s on s.st_id=sc.st_id
group by s.st_id;
