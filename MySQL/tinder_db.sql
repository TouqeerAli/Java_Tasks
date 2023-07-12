create database tinder_db;
use tinder_db;
create table user(
	id int(11) not null auto_increment,
    first_name varchar(15) ,
    last_name varchar(15),
    email varchar(15),
    birth date,
    sex varchar(11),
    discription varchar(500),
    primary key (id)
);

alter table user rename column id to user_id;
select * from user;

alter table user rename to users;



create table picture(
	pic_id int not null auto_increment,
    image_path varchar(20),
    user_id int,
    primary key (pic_id),
    foreign key (user_id) references users(user_id)
    
);
select * from picture;

create table intrest(
	intrest_id int,
    intrestsIDS json,
    user_id int,
    primary key (intrest_id),
    foreign key (user_id) references users(user_id)
    
);
alter table intrest modify intrestsIDS varchar(11);
select * from intrest;

alter table intrest modify intrest_id int not null auto_increment;

create table people (
	people_id int,
    minAge int,
    maxAge int,
    sex varchar(11),
    user_id int,
    primary key (people_id),
    foreign key (user_id) references users(user_id)
    
);

alter table people modify people_id int not null auto_increment;
create table likes(
	like_id int not null auto_increment,
	sender_user_id int,
    reciever_user_id int,
    primary key (like_id),
    foreign key (sender_user_id) references users(user_id),
    foreign key (reciever_user_id) references users(user_id)
);

