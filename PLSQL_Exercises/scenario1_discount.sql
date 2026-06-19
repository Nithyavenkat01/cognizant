USE bankdb;

UPDATE Loans l
JOIN Customers c
ON l.CustomerID = c.CustomerID
SET l.InterestRate = l.InterestRate - 1
WHERE c.Age > 60;

SELECT * FROM Loans;