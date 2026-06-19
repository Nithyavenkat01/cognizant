USE bankdb;

CREATE TABLE Loans(
    LoanID INT PRIMARY KEY,
    CustomerID INT,
    InterestRate DECIMAL(5,2),
    DueDate DATE,
    FOREIGN KEY(CustomerID)
    REFERENCES Customers(CustomerID)
);