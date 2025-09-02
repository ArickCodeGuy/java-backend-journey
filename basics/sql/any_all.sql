-- Selects list of ProductNames
-- Where OrderDetails have quantity > 10
SELECT ProductName FROM Products
WHERE ProductId = ANY (SELECT ProductId FROM OrderDetails WHERE Quantity > 10);

-- To find all products whose price is less than
-- any of the prices of products in a specific category 
SELECT ProductName, Price FROM Products
WHERE Price < ANY (
  SELECT Price FROM Procuts WHERE Category = 'Electronics'
);

-- Conclusion
-- Better use
-- WHERE EXISTS
-- https://stackoverflow.com/questions/5980474/sql-any-all-operators