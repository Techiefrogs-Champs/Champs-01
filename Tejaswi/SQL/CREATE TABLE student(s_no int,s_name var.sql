CREATE TABLE student(s_no int,s_name varchar(450),s_address VARCHAR(450),s_marks int)
INSERT into student VALUES(1,'abc','afajjdsj',40),
(2,'aaa','hijiji',50),(3,'bbb','hhh',60)
SELECT * FROM student

ALTER table student add age int;
select *from student

UPDATE student set age =20 where s_no=1;
UPDATE student set age =30 where s_no=2;
UPDATE student set age =40 where s_no=3;
select * from student;

delete from student where age= 20 ;






