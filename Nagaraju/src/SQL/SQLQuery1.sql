USE [master]
GO
/****** Object:  Database [Sony]    Script Date: 22-01-2021 19:05:50 ******/
CREATE DATABASE [Sony]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Sony', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\Sony.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'Sony_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\Sony_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [Sony] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Sony].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Sony] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Sony] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Sony] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Sony] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Sony] SET ARITHABORT OFF 
GO
ALTER DATABASE [Sony] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [Sony] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Sony] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Sony] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Sony] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Sony] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Sony] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Sony] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Sony] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Sony] SET  ENABLE_BROKER 
GO
ALTER DATABASE [Sony] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Sony] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Sony] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Sony] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Sony] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Sony] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Sony] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Sony] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [Sony] SET  MULTI_USER 
GO
ALTER DATABASE [Sony] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Sony] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Sony] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Sony] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [Sony] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [Sony] SET QUERY_STORE = OFF
GO
USE [Sony]
GO
/****** Object:  Table [dbo].[DefectProducts_table]    Script Date: 22-01-2021 19:05:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DefectProducts_table](
	[DefectProductID] [int] IDENTITY(2000,1) NOT NULL,
	[UserID] [int] NULL,
	[ProductID] [int] NULL,
	[OrderID] [int] NULL,
	[ReportDate] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[DefectProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DPShipments_table]    Script Date: 22-01-2021 19:05:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DPShipments_table](
	[DPShipmentID] [int] IDENTITY(300,1) NOT NULL,
	[DefectProductID] [int] NULL,
	[ShipmentDate] [date] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[DPShipmentID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Orders_table]    Script Date: 22-01-2021 19:05:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders_table](
	[OrderID] [int] IDENTITY(1,1) NOT NULL,
	[UserID] [int] NULL,
	[ProductID] [int] NULL,
	[NoOfQuantity] [int] NOT NULL,
	[OrderDate] [date] NOT NULL,
	[OrderStatusID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[OrderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderStatus_table]    Script Date: 22-01-2021 19:05:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderStatus_table](
	[OrderStatusID] [int] IDENTITY(500,1) NOT NULL,
	[OrderStatusName] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[OrderStatusID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ProductCategory_table]    Script Date: 22-01-2021 19:05:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ProductCategory_table](
	[ProductCategoryID] [int] IDENTITY(1000,1) NOT NULL,
	[CategoryName] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ProductCategoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ProductsInventory_table]    Script Date: 22-01-2021 19:05:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ProductsInventory_table](
	[ProductID] [int] IDENTITY(5000,1) NOT NULL,
	[ModelNumber] [int] NOT NULL,
	[Specifications] [varchar](200) NOT NULL,
	[Description] [varchar](1000) NULL,
	[Price] [int] NOT NULL,
	[AvailableQuantity] [int] NOT NULL,
	[ProductCategoryID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Shipments_table]    Script Date: 22-01-2021 19:05:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Shipments_table](
	[ShipmentID] [int] IDENTITY(4000,1) NOT NULL,
	[OrderID] [int] NULL,
	[ShipmentStatusID] [int] NULL,
	[ShipmentDate] [date] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ShipmentID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ShipmentStatus_table]    Script Date: 22-01-2021 19:05:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ShipmentStatus_table](
	[ShipmentStatusID] [int] IDENTITY(700,1) NOT NULL,
	[ShipmentStatusName] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[ShipmentStatusID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Users_table]    Script Date: 22-01-2021 19:05:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Users_table](
	[UserID] [int] IDENTITY(100,1) NOT NULL,
	[UserName] [varchar](50) NOT NULL,
	[Password] [varchar](50) NOT NULL,
	[ConfirmPassword] [varchar](50) NOT NULL,
	[Email] [varchar](100) NOT NULL,
	[Address] [varchar](500) NULL,
	[UserTypeID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[UserID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[UsersType_table]    Script Date: 22-01-2021 19:05:51 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[UsersType_table](
	[UserTypeID] [int] IDENTITY(1,1) NOT NULL,
	[UserTypeName] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[UserTypeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[DefectProducts_table] ON 
GO
INSERT [dbo].[DefectProducts_table] ([DefectProductID], [UserID], [ProductID], [OrderID], [ReportDate]) VALUES (2004, 100, 5001, 1, CAST(N'2020-11-13' AS Date))
GO
INSERT [dbo].[DefectProducts_table] ([DefectProductID], [UserID], [ProductID], [OrderID], [ReportDate]) VALUES (2005, 103, 5002, 2, CAST(N'2020-10-16' AS Date))
GO
SET IDENTITY_INSERT [dbo].[DefectProducts_table] OFF
GO
SET IDENTITY_INSERT [dbo].[DPShipments_table] ON 
GO
INSERT [dbo].[DPShipments_table] ([DPShipmentID], [DefectProductID], [ShipmentDate]) VALUES (301, 2004, CAST(N'2020-11-30' AS Date))
GO
INSERT [dbo].[DPShipments_table] ([DPShipmentID], [DefectProductID], [ShipmentDate]) VALUES (302, 2005, CAST(N'2020-11-05' AS Date))
GO
SET IDENTITY_INSERT [dbo].[DPShipments_table] OFF
GO
SET IDENTITY_INSERT [dbo].[Orders_table] ON 
GO
INSERT [dbo].[Orders_table] ([OrderID], [UserID], [ProductID], [NoOfQuantity], [OrderDate], [OrderStatusID]) VALUES (1, 100, 5001, 60, CAST(N'2020-10-30' AS Date), 501)
GO
INSERT [dbo].[Orders_table] ([OrderID], [UserID], [ProductID], [NoOfQuantity], [OrderDate], [OrderStatusID]) VALUES (2, 103, 5002, 30, CAST(N'2020-10-10' AS Date), 500)
GO
SET IDENTITY_INSERT [dbo].[Orders_table] OFF
GO
SET IDENTITY_INSERT [dbo].[OrderStatus_table] ON 
GO
INSERT [dbo].[OrderStatus_table] ([OrderStatusID], [OrderStatusName]) VALUES (500, N'Shipped')
GO
INSERT [dbo].[OrderStatus_table] ([OrderStatusID], [OrderStatusName]) VALUES (501, N'Pending')
GO
SET IDENTITY_INSERT [dbo].[OrderStatus_table] OFF
GO
SET IDENTITY_INSERT [dbo].[ProductCategory_table] ON 
GO
INSERT [dbo].[ProductCategory_table] ([ProductCategoryID], [CategoryName]) VALUES (1000, N'28Inch')
GO
INSERT [dbo].[ProductCategory_table] ([ProductCategoryID], [CategoryName]) VALUES (1001, N'32Inch')
GO
INSERT [dbo].[ProductCategory_table] ([ProductCategoryID], [CategoryName]) VALUES (1002, N'44Inch')
GO
INSERT [dbo].[ProductCategory_table] ([ProductCategoryID], [CategoryName]) VALUES (1003, N'55Inch')
GO
INSERT [dbo].[ProductCategory_table] ([ProductCategoryID], [CategoryName]) VALUES (1004, N'43Inch')
GO
SET IDENTITY_INSERT [dbo].[ProductCategory_table] OFF
GO
SET IDENTITY_INSERT [dbo].[ProductsInventory_table] ON 
GO
INSERT [dbo].[ProductsInventory_table] ([ProductID], [ModelNumber], [Specifications], [Description], [Price], [AvailableQuantity], [ProductCategoryID]) VALUES (5000, 2004, N'OLCD', NULL, 45000, 35, 1000)
GO
INSERT [dbo].[ProductsInventory_table] ([ProductID], [ModelNumber], [Specifications], [Description], [Price], [AvailableQuantity], [ProductCategoryID]) VALUES (5001, 2000, N'LED', NULL, 20000, 50, 1002)
GO
INSERT [dbo].[ProductsInventory_table] ([ProductID], [ModelNumber], [Specifications], [Description], [Price], [AvailableQuantity], [ProductCategoryID]) VALUES (5002, 2002, N'LED', NULL, 30000, 80, 1003)
GO
INSERT [dbo].[ProductsInventory_table] ([ProductID], [ModelNumber], [Specifications], [Description], [Price], [AvailableQuantity], [ProductCategoryID]) VALUES (5003, 2003, N'OLED', NULL, 40000, 20, 1001)
GO
SET IDENTITY_INSERT [dbo].[ProductsInventory_table] OFF
GO
SET IDENTITY_INSERT [dbo].[Shipments_table] ON 
GO
INSERT [dbo].[Shipments_table] ([ShipmentID], [OrderID], [ShipmentStatusID], [ShipmentDate]) VALUES (4002, 2, 701, CAST(N'2020-11-03' AS Date))
GO
INSERT [dbo].[Shipments_table] ([ShipmentID], [OrderID], [ShipmentStatusID], [ShipmentDate]) VALUES (4003, 1, 702, CAST(N'2020-11-25' AS Date))
GO
SET IDENTITY_INSERT [dbo].[Shipments_table] OFF
GO
SET IDENTITY_INSERT [dbo].[ShipmentStatus_table] ON 
GO
INSERT [dbo].[ShipmentStatus_table] ([ShipmentStatusID], [ShipmentStatusName]) VALUES (700, N'IN_PROCESS')
GO
INSERT [dbo].[ShipmentStatus_table] ([ShipmentStatusID], [ShipmentStatusName]) VALUES (701, N'PENDING')
GO
INSERT [dbo].[ShipmentStatus_table] ([ShipmentStatusID], [ShipmentStatusName]) VALUES (702, N'SHIPPED')
GO
SET IDENTITY_INSERT [dbo].[ShipmentStatus_table] OFF
GO
SET IDENTITY_INSERT [dbo].[Users_table] ON 
GO
INSERT [dbo].[Users_table] ([UserID], [UserName], [Password], [ConfirmPassword], [Email], [Address], [UserTypeID]) VALUES (100, N'PRIYA', N'Xyz123', N'Xyz123', N'abc@xyz.com', NULL, 2)
GO
INSERT [dbo].[Users_table] ([UserID], [UserName], [Password], [ConfirmPassword], [Email], [Address], [UserTypeID]) VALUES (101, N'SOWMYA', N'123ABC', N'123ABC', N'ffh@xyz.com', NULL, 1)
GO
INSERT [dbo].[Users_table] ([UserID], [UserName], [Password], [ConfirmPassword], [Email], [Address], [UserTypeID]) VALUES (102, N'SRIDEVI', N'zzz456', N'zzz456', N'b2w@xyz.com', NULL, 3)
GO
INSERT [dbo].[Users_table] ([UserID], [UserName], [Password], [ConfirmPassword], [Email], [Address], [UserTypeID]) VALUES (103, N'HARSHINI', N'014RRR', N'014RRR', N'WYX@XYZ.com', NULL, 2)
GO
SET IDENTITY_INSERT [dbo].[Users_table] OFF
GO
SET IDENTITY_INSERT [dbo].[UsersType_table] ON 
GO
INSERT [dbo].[UsersType_table] ([UserTypeID], [UserTypeName]) VALUES (1, N'Manufacturer')
GO
INSERT [dbo].[UsersType_table] ([UserTypeID], [UserTypeName]) VALUES (2, N'Distributor')
GO
INSERT [dbo].[UsersType_table] ([UserTypeID], [UserTypeName]) VALUES (3, N'Refurbisher')
GO
SET IDENTITY_INSERT [dbo].[UsersType_table] OFF
GO
ALTER TABLE [dbo].[DefectProducts_table]  WITH CHECK ADD FOREIGN KEY([OrderID])
REFERENCES [dbo].[Orders_table] ([OrderID])
GO
ALTER TABLE [dbo].[DefectProducts_table]  WITH CHECK ADD FOREIGN KEY([ProductID])
REFERENCES [dbo].[ProductsInventory_table] ([ProductID])
GO
ALTER TABLE [dbo].[DefectProducts_table]  WITH CHECK ADD FOREIGN KEY([UserID])
REFERENCES [dbo].[Users_table] ([UserID])
GO
ALTER TABLE [dbo].[DPShipments_table]  WITH CHECK ADD FOREIGN KEY([DefectProductID])
REFERENCES [dbo].[DefectProducts_table] ([DefectProductID])
GO
ALTER TABLE [dbo].[Orders_table]  WITH CHECK ADD FOREIGN KEY([OrderStatusID])
REFERENCES [dbo].[OrderStatus_table] ([OrderStatusID])
GO
ALTER TABLE [dbo].[Orders_table]  WITH CHECK ADD FOREIGN KEY([ProductID])
REFERENCES [dbo].[ProductsInventory_table] ([ProductID])
GO
ALTER TABLE [dbo].[Orders_table]  WITH CHECK ADD FOREIGN KEY([UserID])
REFERENCES [dbo].[Users_table] ([UserID])
GO
ALTER TABLE [dbo].[ProductsInventory_table]  WITH CHECK ADD FOREIGN KEY([ProductCategoryID])
REFERENCES [dbo].[ProductCategory_table] ([ProductCategoryID])
GO
ALTER TABLE [dbo].[Shipments_table]  WITH CHECK ADD FOREIGN KEY([OrderID])
REFERENCES [dbo].[Orders_table] ([OrderID])
GO
ALTER TABLE [dbo].[Shipments_table]  WITH CHECK ADD FOREIGN KEY([ShipmentStatusID])
REFERENCES [dbo].[ShipmentStatus_table] ([ShipmentStatusID])
GO
ALTER TABLE [dbo].[Users_table]  WITH CHECK ADD FOREIGN KEY([UserTypeID])
REFERENCES [dbo].[UsersType_table] ([UserTypeID])
GO
USE [master]
GO
ALTER DATABASE [Sony] SET  READ_WRITE 
GO
