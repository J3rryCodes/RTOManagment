use rtosystem;

drop table License ;
drop table VehicleRegistration;
drop table AdminIP;
drop table VehicleNumber;
drop table Complaints;


create table License(id int primary key auto_increment,fullname varchar(40),email varchar(40),phno varchar(13),address varchar(50),city varchar(20),pin varchar(10),type varchar(5),photo varchar(30),bloodgroup varchar(5),eyefitness varchar(30),idproof varchar(30),status int);
create table VehicleRegistration(id int primary key auto_increment,fullName varchar(40),phno varchar(13),email varchar(30),engineNumber varchar(30),licenseCopy varchar(30),rcbookCopy varchar(30),status int);
create table AdminIP(id int primary key,ipAddress varchar(30));
create table VehicleNumber(id int primary key auto_increment,reg_no varchar(10));
create table Complaints(id int auto_increment primary key,name varchar(30),number varchar(30),mail varchar(40),complaint varchar(500),status boolean);

insert into AdminIp values(2,'0:0:0:0:0:0:0:1');
#delete from adminip where id = 2;
#select * from license where status=0;
select * from AdminIp;

select * from License;
#update License set status=0 where id=2