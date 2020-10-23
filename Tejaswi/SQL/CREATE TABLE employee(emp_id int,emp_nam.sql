CREATE TABLE employee(emp_id int,emp_name varchar(335),age int,mobile_number int)
INSERT INTO employee VALUES
(1,'teja',20,345789021),
(2,'teju',21,45128973),
(3,'tejaswi',22,12345678),
(4,'lakshmi',23,42157893);

SELECT* from employee;

SELECT emp_name,age from employee;

INSERT into employee VALUES(5,'teju',24,234521578);

select distinct emp_name from employee;

select emp_id from employee ORDER BY emp_name;

SELECT age,(age+10) FROM employee;

select emp_name from employee WHERE emp_id=5;

select emp_name,emp_id from employee WHERE age > 23;

select SUM(age) from employee;

SELECT COUNT(emp_id) FROM employee;

SELECT avg(age) FROM employee;

SELECT max(age) FROM employee;

select min(emp_id)FROM employee;

select MAX(age),min(emp_name),avg(emp_id) FROM employee;

select SUM(age) FROM employee GROUP BY emp_name;

SELECT (emp_name) from employee;

SELECT upper(emp_name) FROM employee;

SELECT lower(emp_name) FROM employee;

select * from employee WHERE emp_name LIKE 'l%';

SELECT emp_id AS id from employee;

SELECT  * FROM employee WHERE emp_name IN('teju');


select * from employee;



