drop database if exists course;
create database course CHARACTER SET UTF8;
use course;

drop table student;
create table student(
	stu_id int(6) zerofill primary key auto_increment,
	stu_pwd varchar(20),
	stu_name varchar(50),
	stu_gender boolean,
	stu_birth date,
	stu_class varchar(7),
	stu_pic MEDIUMBLOB
);
insert into student(stu_name,stu_pwd) values('林思远','123456');
select * from student;