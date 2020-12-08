CREATE DATABASE Employee;
CREATE TABLE Customers(
    CustomerID INT,	
    CustomerName VARCHAR(225),	
    City VARCHAR(225),	
    PostalCode INT,	
    Country VARCHAR(225)
);

SELECT * FROM Customers;

INSERT INTO Customers VALUES(
    1,'Nagaraj','Bangalore',560037,'India'
);
INSERT INTO Customers VALUES
(2,'Ravi','Rajahmandry',533249,'India'),
(3,'Phani','Bellary',560020,'India'),
(4,'Aditya','Duddukuru',533241,'India'),
(5,'Shanmukh','Nidadavolu',533242,'India');

SELECT DISTINCT Country FROM Customers;
SELECT COUNT(DISTINCT Country) FROM Customers;

SELECT * FROM Customers WHERE CustomerID=3;
SELECT * FROM Customers WHERE CustomerID BETWEEN 2 AND 4;
SELECT * FROM Customers WHERE CustomerID<=2;

SELECT * FROM Customers WHERE City LIKE 'B%';
SELECT * FROM Customers WHERE City LIKE '%E';
SELECT * FROM Customers WHERE City LIKE '_E%';
SELECT * FROM Customers WHERE City LIKE '[BR]%';
SELECT * FROM Customers WHERE City LIKE '[^B]%';
SELECT * FROM Customers WHERE City LIKE 'B%E';

SELECT * FROM Customers ORDER BY CustomerName;
SELECT * FROM Customers ORDER BY CustomerName DESC;

ALTER TABLE Customers ADD Gender VARCHAR(10);
SELECT * FROM Customers;
ALTER TABLE Customers DROP COLUMN Gender;
ALTER TABLE Customers ALTER COLUMN City VARCHAR(20);

--SELECT
/*SELECT
FROM CUSTOMERS*/

CREATE TABLE Nj.dbo.Persons (
    ID int NOT NULL UNIQUE,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255) NOT NULL,
    Age int
);
DROP TABLE Nj.dbo.Persons;
SELECT * FROM Nj.dbo.Persons;

CREATE TABLE Students(RollNo int,StuName VARCHAR(20));
INSERT INTO Students VALUES(101,'Ramaraj'),
(102,'Bheem'),(103,'Rajamouli'),(104,'Keeravani');
SELECT * FROM Students;
DROP TABLE Students;

CREATE TABLE Marks (RollNo int,Student VARCHAR(20),
Maths INT,Chemistry INT, Physics INT,English INT);
SELECT * FROM Marks;
DROP TABLE Marks;
INSERT INTO Marks VALUES(101,'Ramaraj',81,82,83,84),
(102,'Bheem',91,92,93,94),(103,'Rajamouli',86,87,88,89),
(104,'Keeravani',80,90,84,95);

/*Left Join*/
SELECT * FROM Students LEFT JOIN Marks
ON Students.RollNo=Marks.RollNo;

/*Inner Join*/
SELECT * FROM Students INNER JOIN Marks
ON Students.RollNo=Marks.RollNo;

/*Right Join*/
SELECT * FROM Students RIGHT JOIN Marks
ON Students.RollNo=Marks.RollNo;



