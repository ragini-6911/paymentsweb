create database registration;
use registration;
create table udetails(firstname varchar(10),lastname varchar(10),phnno varchar(10),
address varchar(20),dob date,userpassword varchar(10));
select * from udetails;
insert into udetails values("Ragini","Kunisetti","1234567890","vizag","2001-08-07","12345");