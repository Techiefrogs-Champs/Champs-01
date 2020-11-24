CREATE TABLE Personal_info(
    Fristname VARCHAR(300),
    Lastname VARCHAR(300),
    Age INT,
    Gender VARCHAR(300),
    PhnNO INT,
)
INSERT INTO Personal_info VALUES('PRIYA', 'NEKKANTI', 22, 'FEMALE', 23232536), ('HARSH', 'NEkkanti', 14, 'MALE', 0223456);
INSERT INTO Personal_info VALUES('HARSHINI', 'NEKK', 14, 'FEMALE', 23456)
INSERT INTO Personal_info VALUES('KRISHNA', 'TEJ', 22, 'MALE', 23232536)
INSERT INTO Personal_info VALUES('LAKSHMI', 'TEJASWI', 14, 'FEMALE', 23456)
INSERT INTO Personal_info VALUES('SRIDEVI', 'MULLAPUDI', 20, 'FEMALE', 23232536)
INSERT INTO Personal_info VALUES('SURAJ', 'B', 21, 'MALE', 23456)
SELECT * FROM Personal_info;

SELECT Fristname, Lastname, Age, Gender, PhnNO
INTO Boys
FROM Personal_info
WHERE Gender = 'MALE'
SELECT * FROM Boys;

DROP TABLE Boys

SELECT Fristname, Lastname, Age, Gender, PhnNO
INTO Girls
FROM Personal_info
WHERE Gender = 'FEMALE'
SELECT * FROM Girls;

EXEC sp_rename 'Girls', 'Girls_info'
SELECT * FROM Girls_info;


DROP TABLE Girls_info
 
 DELETE FROM Personal_info  WHERE Fristname = 'HARSHINI';

 
 EXEC sp_RENAME 'Girls_info.Lastname', 'LNAME','COLUMN';

 ALTER TABLE Girls_info
 DROP COLUMN PhnNO

 SELECT * FROM Girls_info
 
 ALTER TABLE Girls_info
 DROP COLUMN RollNOSS

 ALTER TABLE Girls_info
 ADD RollNOSS  INT 
 SELECT * FROM Girls_info WHERE Gender = 'FEMALE'

 INSERT INTO Girls_info(RollNOSS ) VALUES (1001),(2145),(3254)
SELECT * FROM Girls_info

 
 SELECT Age AS AGE, Gender AS G
 FROM Personal_info
 





 