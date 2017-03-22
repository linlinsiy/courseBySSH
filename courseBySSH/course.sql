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
update student set stu_gender=true where stu_id=1;
update student set stu_birth='1994-12-03' where stu_id=1;

select * from student;

create table lesson(
	les_id int(4) zerofill primary key auto_increment,
	les_name varchar(50),
	les_time varchar(100)
);
insert into lesson(les_name,les_time) values('高等数学','一1,3;三5,6');
select * from lesson;