CREATE TABLE Sony.dbo.UserType_tbl (
    UserTypeID INT IDENTITY(1,1) PRIMARY KEY,
    UserTypeName VARCHAR(50) NOT NULL
);
INSERT INTO Sony.dbo.UserType_tbl VALUES
('Manufacturer'),('Distributor'),('Refurbisher')
SELECT * FROM Sony.dbo.UserType_tbl

CREATE TABLE Sony.dbo.Users_tbl (
    UserID INT IDENTITY(100,1) PRIMARY KEY,
    UserName VARCHAR(50) NOT NULL,
    Password VARCHAR(50) NOT NULL,
    ConfirmPassword VARCHAR(50) NOT NULL,
    Email VARCHAR(100) NOT NULL,
    Address VARCHAR(500) NULL,
    UserTypeID INT FOREIGN KEY REFERENCES UserType_tbl(UserTypeID)
);
INSERT INTO Sony.dbo.Users_tbl VALUES
('Raj','abc','abc','abc@xyz.com',NULL,2),
('Phani','123','123','ffh@xyz.com',NULL,1),
('Ravi','zzz','zzz','b2w@xyz.com',NULL,3)
SELECT * FROM Sony.dbo.Users_tbl

CREATE TABLE Sony.dbo.ProductCategory_tbl (
    ProductCategoryID INT IDENTITY(1000,1) PRIMARY KEY,
    CategoryName VARCHAR(50) NOT NULL
);
INSERT INTO Sony.dbo.ProductCategory_tbl VALUES
('28Inch'),('32Inch'),('44Inch'),('55Inch')
SELECT * FROM Sony.dbo.ProductCategory_tbl;

CREATE TABLE Sony.dbo.ProductsInventory_tbl (
    ProductID INT IDENTITY(5000,1) PRIMARY KEY,
    ModelNumber INT NOT NULL,
    Specifications VARCHAR(200) NOT NULL,
    Description VARCHAR(1000) NULL,
    Price INT NOT NULL,
    AvailableQuantity INT NOT NULL,
    ProductCategoryID INT FOREIGN KEY REFERENCES ProductCategory_tbl(ProductCategoryID),
);
INSERT INTO Sony.dbo.ProductsInventory_tbl VALUES
(2000,'LED',NULL,20000,50,1002),
(2002,'LED',NULL,30000,80,1003),
(2003,'OLED',NULL,40000,20,1001)
SELECT * FROM Sony.dbo.ProductsInventory_tbl;

CREATE TABLE Sony.dbo.OrderStatus_tbl (
    OrderStatusID INT IDENTITY(500,1) PRIMARY KEY,
    OrderStatusName VARCHAR(50) NOT NULL
);
INSERT INTO Sony.dbo.OrderStatus_tbl VALUES
('Shipped'),('Pending')
SELECT * FROM Sony.dbo.OrderStatus_tbl;

CREATE TABLE Sony.dbo.Orders_tbl (
    OrderID INT IDENTITY(1,1) PRIMARY KEY,
    UserID INT FOREIGN KEY REFERENCES Users_tbl(UserID),
    ProductID INT FOREIGN KEY REFERENCES ProductsInventory_tbl(ProductID),
    NoOfQuantity INT NOT NULL,
    OrderDate DATE NOT NULL,
    OrderStatusID INT FOREIGN KEY REFERENCES OrderStatus_tbl(OrderStatusID)
);
INSERT INTO Sony.dbo.Orders_tbl VALUES
(100,5001,60,'2020-10-30',501),(101,5002,30,'2020-10-10',500),
(102,5000,40,'2020-10-15',501)
SELECT * FROM Sony.dbo.Orders_tbl;

CREATE TABLE Sony.dbo.DefectProducts_tbl (
    DefectProductID INT IDENTITY(2000,1) PRIMARY KEY,
    UserID INT FOREIGN KEY REFERENCES Users_tbl(UserID),
    ProductID INT FOREIGN KEY REFERENCES ProductsInventory_tbl(ProductID),
    OrderID INT FOREIGN KEY REFERENCES Orders_tbl(OrderID),
    ReportDate DATE NULL
);
INSERT INTO Sony.dbo.DefectProducts_tbl VALUES
(100,5000,1,'2020-10-16'),(101,5001,2,'2020-10-19'),
(102,5002,3,'2020-10-22')
SELECT * FROM Sony.dbo.DefectProducts_tbl;

CREATE TABLE Sony.dbo.DPShipments_tbl (
    DPShipmentID INT IDENTITY(300,1) PRIMARY KEY,
    DefectProductID INT FOREIGN KEY REFERENCES DefectProducts_tbl(DefectProductID),
    ShipmentDate DATE NOT NULL
);
INSERT INTO Sony.dbo.DPShipments_tbl VALUES
(2000,'2020-10-23'),(2001,'2020-10-24'),(2002,'2020-10-25')
SELECT * FROM Sony.dbo.DPShipments_tbl;

CREATE TABLE Sony.dbo.ShipmentStatus_tbl (
    ShipmentStatusID INT IDENTITY(700,1) PRIMARY KEY,
    ShipmentStatusName VARCHAR(50) NULL
);
INSERT INTO Sony.dbo.ShipmentStatus_tbl VALUES
('InProces'),('Shipped'),('Pending')
SELECT * FROM Sony.dbo.ShipmentStatus_tbl;

CREATE TABLE Sony.dbo.Shipments_tbl (
    ShipmentID INT IDENTITY(4000,1) PRIMARY KEY,
    OrderID INT FOREIGN KEY REFERENCES Orders_tbl(OrderID),
    ShipmentStatusID INT FOREIGN KEY REFERENCES ShipmentStatus_tbl(ShipmentStatusID),
    ShipmentDate DATE NOT NULL
);
INSERT INTO Sony.dbo.Shipments_tbl VALUES
(1,701,'2020-10-15'),(2,702,'2020-10-18'),(3,700,'2020-10-25')
SELECT * FROM Sony.dbo.Shipments_tbl;


