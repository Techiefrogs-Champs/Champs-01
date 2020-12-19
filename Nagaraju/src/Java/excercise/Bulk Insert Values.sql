--Bulk Insert Values
CREATE TABLE Nj.dbo.CSVTest
(ID INT,
FirstName VARCHAR(40),
LastName VARCHAR(40),
BirthDate SMALLDATETIME);

DROP TABLE CSVTests;

BULK
INSERT CSVTest
FROM 'C:\Users\nraj8\Desktop\CSVTest.csv'
WITH
(
FORMAT='CSV'
);
