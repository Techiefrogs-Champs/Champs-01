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

SELECT emp_id from employee ORDER BY emp_name;
SELECT * FROM employee ORDER BY emp_name DESC;
SELECT * FROM employee ORDER BY emp_name ASC;
SELECT * FROM employee ORDER BY emp_name,AGE;
SELECT * FROM employee ORDER BY emp_name DESC,mobile_number ASC;
SELECT * FROM employee ORDER BY mobile_number ASC;

SELECT count(emp_id) FROM employee GROUP BY emp_name;

SELECT COUNT(emp_ID) FROM employee GROUP BY mobile_number
ORDER BY COUNT(emp_name) DESC;

SELECT emp_name, age, mobile_number FROM employee
WHERE mobile_number IS NULL;
SELECT emp_name, age, mobile_number FROM employee
WHERE mobile_number IS NOT NULL

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

SELECT TOP 2* FROM employee;

SELECT * from employee WHERE emp_name LIKE 'l%';
SELECT * from employee WHERE emp_name LIKE '%';
SELECT * from employee WHERE emp_name LIKE '%ja%';
SELECT * from employee WHERE emp_name LIKE '_e%';
SELECT * from employee WHERE emp_name LIKE 't___%';
SELECT * from employee WHERE emp_name LIKE 'l%i';
SELECT * from employee WHERE emp_name NOT LIKE 't%';
SELECT * from employee WHERE emp_name LIKE 'l%';

SELECT * FROM employee WHERE emp_name='teja' AND age=20;
SELECT * FROM employee WHERE emp_name='lakshmi' OR emp_name='tejaswi';
SELECT * FROM employee WHERE NOT mobile_number=42157893;







SELECT emp_id AS id from employee;

SELECT  * FROM employee WHERE emp_name IN('teju');


select * from employee;



