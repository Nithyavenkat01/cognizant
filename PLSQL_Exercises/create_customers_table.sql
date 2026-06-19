
USE bankdb;
CREATE TABLE Customers(
    CustomerID INT PRIMARY KEY,
    CustomerName VARCHAR(50),
    Age INT,
    Balance DECIMAL(10,2),
    IsVIP BOOLEAN DEFAULT FALSE
);