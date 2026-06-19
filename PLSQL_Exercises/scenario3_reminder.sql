USE bankdb;

SELECT
c.CustomerName,
l.LoanID,
l.DueDate,
CONCAT(
'Reminder: Dear ',
c.CustomerName,
', your loan ',
l.LoanID,
' is due on ',
l.DueDate
) AS Reminder_Message
FROM Customers c
JOIN Loans l
ON c.CustomerID = l.CustomerID
WHERE l.DueDate
BETWEEN CURDATE()
AND CURDATE() + INTERVAL 30 DAY;