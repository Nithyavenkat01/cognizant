DELIMITER $$

CREATE PROCEDURE TransferFunds(
    IN sourceAccount INT,
    IN targetAccount INT,
    IN amount DECIMAL(10,2)
)
BEGIN

    DECLARE sourceBalance DECIMAL(10,2);

    SELECT Balance
    INTO sourceBalance
    FROM Accounts
    WHERE AccountID = sourceAccount;

    IF sourceBalance >= amount THEN

        UPDATE Accounts
        SET Balance = Balance - amount
        WHERE AccountID = sourceAccount;

        UPDATE Accounts
        SET Balance = Balance + amount
        WHERE AccountID = targetAccount;

        SELECT 'Transfer Successful' AS Message;

    ELSE

        SELECT 'Insufficient Balance' AS Message;

    END IF;

END $$

DELIMITER ;




CALL TransferFunds(1,2,1000);

SELECT * FROM Accounts;