CREATE TABLE Accounts (
    AccountID INT PRIMARY KEY,
    CustomerName VARCHAR(50),
    AccountType VARCHAR(20),
    Balance DECIMAL(10,2)
);

INSERT INTO Accounts VALUES
(1,'John','Savings',10000),
(2,'Mary','Savings',20000),
(3,'David','Current',15000);

DELIMITER $$

CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';
END $$

DELIMITER ;

CALL ProcessMonthlyInterest();

SELECT * FROM Accounts;