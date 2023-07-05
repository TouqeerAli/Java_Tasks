create database shopping_website_db;
show databases;
-- Product Table
create table products(
id int,
pr_name varchar(11),
price int,
category varchar(11)
);

insert into products values(101, 'Laptop', 50000, 'Electronic');
insert into products values(102, 'Eco T-Shirt', 700, 'Clothing');
insert into products values(103, 'Eco Jeans', 900, 'Clothing');
insert into products values(104, 'Moisturizer', 550, 'Skincare');
insert into products values(105, 'Dish Soap', 50, 'Cleaning');

select * from products;

-- User Table
create table user_info(
	id int,
    username varchar(11),
    email varchar(20),
    phone_no int
);
insert into user_info value(1,'Amir','amir@gmail.com',123456789);
insert into user_info values(2,'Inam','inam@gmail.com',123456789);
insert into user_info values(3,'Unaid','ubaid@gmail.com',123456789);
insert into user_info values(4,'Rafey','rafey@gmail.com',123456789);
insert into user_info values(5,'Haseeb','haseeb@gmail.com',123456789);

select * from user_info;

-- Order Table
create table orders(
	order_id int,
    u_id int,
    order_date date,
    total_amount int,
    shipping_method varchar(11),
    payment_info int
);

insert into orders values(1, 2, '2023-7-5',2000,'tcs',1000);
insert into orders values(2,3,'2023-6-25',24000,'tcs',2000);
insert into orders values(3,1,'2023-6-23',40000,'tcs',30000);
insert into orders values(4,4,'2023-6-25',24000,'tcs',10000);
insert into orders values(5,5,'2023-4-25',24000,'tcs',2000);

select * from orders;


-- order items table
create table user_items(
	order_item_id int,
    order_id int,
	pr_id int,
    quantity int,
    price int
);

insert into user_items values(1,2,101,2,50000);
insert into user_items values(2,3,102,3,700);
insert into user_items values(3,1,103,5,900);
insert into user_items values(4,4,104,3,550);
insert into user_items values(5,5,105,2,50);

select * from user_items;

-- categories table 
create table categories(
	category_id int,
    category_name varchar(11)
);

insert into categories values(1,'Electronic');
insert into categories values(2,'Clothing');
insert into categories values(3,'Skincare');
insert into categories values(4,'Cleaning');

select * from categories;

-- cart table
create table cart(
	u_id int,
    pr_id int,
    quantity int

);

insert into cart values(1,101,2);
insert into cart values(2,102,4);
insert into cart values(3,103,2);
insert into cart values(4,104,5);
insert into cart values(5,105,2);

select * from cart;

drop table cart;
drop table categories;

update orders set shipping_method='leopard'
 where u_id=3;
 
alter table products rename column id to pr_id;
alter table user_info rename column id to u_id;