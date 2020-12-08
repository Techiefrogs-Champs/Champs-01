DROP DATABASE Sony;
CREATE DATABASE Sony;

CREATE TABLE Sony.dbo.UsersType_table (
    UserTypeID INT IDENTITY(1,1) PRIMARY KEY,
    UserTypeName VARCHAR(50) NOT NULL
);

INSERT INTO Sony.dbo.UsersType_table VALUES
('Manufacturer'),('Distributor'),('Refurbisher')
SELECT * FROM Sony.dbo.UsersType_table;

CREATE TABLE Sony.dbo.Users_table (
    UserID INT IDENTITY(100,1) PRIMARY KEY,
    UserName VARCHAR(50) NOT NULL,
    Password VARCHAR(50) NOT NULL,
    ConfirmPassword VARCHAR(50) NOT NULL,
    Email VARCHAR(100) NOT NULL,
    Address VARCHAR(500) NULL,
    UserTypeID INT FOREIGN KEY REFERENCES UsersType_table(UserTypeID)
);
INSERT INTO Sony.dbo.Users_table VALUES
('PRIYA','Xyz123','Xyz123','abc@xyz.com',NULL,2),
('SOWMYA','123ABC','123ABC','ffh@xyz.com',NULL,1),
('SRIDEVI','zzz456','zzz456','b2w@xyz.com',NULL,3),
('HARSHINI','014RRR','014RRR','WYX@XYZ.com',NULL,2)
SELECT * FROM Sony.dbo.Users_table;

CREATE TABLE Sony.dbo.ProductCategory_table (
    ProductCategoryID INT IDENTITY(1000,1) PRIMARY KEY,
    CategoryName VARCHAR(50) NOT NULL
);
INSERT INTO Sony.dbo.ProductCategory_table VALUES
('28Inch'),('32Inch'),('44Inch'),('55Inch'),('43Inch')
SELECT * FROM Sony.dbo.ProductCategory_table;

CREATE TABLE Sony.dbo.ProductsInventory_table (
    ProductID INT IDENTITY(5000,1) PRIMARY KEY,
    ModelNumber INT NOT NULL,
    Specifications VARCHAR(200) NOT NULL,
    Description VARCHAR(1000) NULL,
    Price INT NOT NULL,
    AvailableQuantity INT NOT NULL,
    ProductCategoryID INT FOREIGN KEY REFERENCES ProductCategory_table(ProductCategoryID),
);
INSERT INTO Sony.dbo.ProductsInventory_table VALUES
(2004,'OLCD',NULL,45000,35,1000),
(2000,'LED',NULL,20000,50,1002),
(2002,'LED',NULL,30000,80,1003),
(2003,'OLED',NULL,40000,20,1001)
SELECT * FROM Sony.dbo.ProductsInventory_table;

CREATE TABLE Sony.dbo.OrderStatus_table (
    OrderStatusID INT IDENTITY(500,1) PRIMARY KEY,
    OrderStatusName VARCHAR(50) NOT NULL
);
INSERT INTO Sony.dbo.OrderStatus_table VALUES
('Shipped'),('Pending')
SELECT * FROM Sony.dbo.OrderStatus_table;

CREATE TABLE Sony.dbo.Orders_table (
    OrderID INT IDENTITY(1,1) PRIMARY KEY,
    UserID INT FOREIGN KEY REFERENCES Users_table(UserID),
    ProductID INT FOREIGN KEY REFERENCES ProductsInventory_table(ProductID),
    NoOfQuantity INT NOT NULL,
    OrderDate DATE NOT NULL,
    OrderStatusID INT FOREIGN KEY REFERENCES OrderStatus_table(OrderStatusID)
);
INSERT INTO Sony.dbo.Orders_table VALUES
(100,5001,60,'2020-10-30',501),(103,5002,30,'2020-10-10',500)
SELECT * FROM Sony.dbo.Orders_table;



CREATE TABLE Sony.dbo.DefectProducts_table (
    DefectProductID INT IDENTITY(2000,1) PRIMARY KEY,
    UserID INT FOREIGN KEY REFERENCES Users_table(UserID),
    ProductID INT FOREIGN KEY REFERENCES ProductsInventory_table(ProductID),
    OrderID INT FOREIGN KEY REFERENCES Orders_table(OrderID),
    ReportDate DATE NULL
);
INSERT INTO Sony.dbo.DefectProducts_table VALUES
(100,5001,1,'2020-11-13'),(103,5002,2,'2020-10-16')
SELECT * FROM Sony.dbo.DefectProducts_table;

CREATE TABLE Sony.dbo.DPShipments_table (
    DPShipmentID INT IDENTITY(300,1) PRIMARY KEY,
    DefectProductID INT FOREIGN KEY REFERENCES DefectProducts_table(DefectProductID),
    ShipmentDate DATE NOT NULL
);

INSERT INTO Sony.dbo.DPShipments_table VALUES
(2004,'2020-11-30'),(2005,'2020-11-05')
SELECT * FROM  Sony.dbo.DPShipments_table;

CREATE TABLE Sony.dbo.ShipmentStatus_table (
    ShipmentStatusID INT IDENTITY(700,1) PRIMARY KEY,
    ShipmentStatusName VARCHAR(50) NULL
);

INSERT INTO Sony.dbo.ShipmentStatus_table VALUES
('IN_PROCESS'),('PENDING'),('SHIPPED')

SELECT * FROM Sony.dbo.ShipmentStatus_table;

CREATE TABLE Sony.dbo.Shipments_table (
    ShipmentID INT IDENTITY(4000,1) PRIMARY KEY,
    OrderID INT FOREIGN KEY REFERENCES Orders_table(OrderID),
    ShipmentStatusID INT FOREIGN KEY REFERENCES ShipmentStatus_table(ShipmentStatusID),
    ShipmentDate DATE NOT NULL
);

INSERT INTO Sony.dbo.Shipments_table VALUES
(2,701,'2020-11-3'),(1,702,'2020-11-25')

SELECT * FROM Sony.dbo.Shipments_table; 