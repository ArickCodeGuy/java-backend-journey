CREATE PROCEDURE SelectAllCustomers
AS
SELECT * FROM Customer;

EXEC SelectAllCustomers;


CREATE PROCEDURE SelectCustomerCity @City nvarchar(30)
AS
SELECT * FROM Customer
WHERE city = @City;

EXEC SelectCustomerCity @City = 'London';