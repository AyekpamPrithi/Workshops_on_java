 -- TASK Assignment 1,2,3
 -- creating database 
create database bootcamp_java;
use sgvu_dtb;

 -- creating tables
show tables;
create table student ( id int primary key, name varchar(100), mobile_no varchar(20), email_id varchar(100));
desc student;

 -- inserting records
insert into student values (1001, "Ayekpam","9362002074", "ayekpamprithi@gmail.com");
insert into student values (1002, "prithiviraj","9612653135","prithi@gmail.com");
insert into student values (1003, "Mangang", "123456789","mangang@gmail.com");

 -- Fetch the current data
select * from student;
insert into student values (1003,"mangang", "9321313132", "here@gmail.com");
create table users1 (id  int primary key auto_increment, username varchar(100), password varchar(100), balance decimal(10,2));
insert into users1 (username, password, balance) values ("Ayekpam", "23181072", 10000);
insert into users1 (username, password, balance) values ("Prithiviraj", "9362002074", 20000);
insert into users1 (username, password, balance) values ("mangang", "9612653135", 30000);

 -- fetch all the record to see the current data
select * from users1;

--  Check if "Ayekpam" exists before updating
Select * from users1 where  username = "Ayekpam";
--  If "Ayekpam" exists, update her balance
update  users1 SET balance = 40000 WHERE id = 1;



-- Fetch all records again to see the updated data
SELECT * from users1;

-- Delete Prithiviraj record from the users table
delete from  users1 where id = 1;


-- Fetch records again to verify deletion
select * from users1;

update users1 Set balance = 14000 where id= 1
