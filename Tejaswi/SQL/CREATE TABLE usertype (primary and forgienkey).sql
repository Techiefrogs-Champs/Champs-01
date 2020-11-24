CREATE TABLE usertype
(userTypename varchar(150)NOT NULL,
userTypeId INT,
PRIMARY KEY(userTypeId));
INSERT into usertype 
VALUES('manufacture',111),('distributor',112),('refurbishment',113);
SELECT * FROM usertype;

CREATE table usertable(
    UserID INT NOT NULL,
    UserName VARCHAR(50) NOT NULL,
    pasword VARCHAR(50) NOT NULL,
    confirmpassword VARCHAR(50) NOT NULL,
    Email VARCHAR(50) NOT NULL,
    Addres VARCHAR(100) NULL,
    UserTypeId int,
    PRIMARY key(UserId),
    CONSTRAINT FK_usertable FOREIGN KEY(userTypeId)
    REFERENCES usertype(userTypeId)
);
INSERT into usertable VALUES
(1,'tej','abcd1','abcd1','teja@gami.com',NULL,113),
(2,'tejaswi','abcd2','abcd2','tejaswi@gami.com',NULL,113),
(3,'teju','abcd3','abcd3','teju@gami.com',NULL,111),
(4,'tejaa','abcd4','abcd4','tejaa@gami.com',NULL,112);
SELECT * FROM usertable;
