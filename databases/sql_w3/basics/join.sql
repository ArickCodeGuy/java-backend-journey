-- Let's get all orders but join names to orders
SELECT ShopOrder.id, ShopOrder.items, Customer.first_name, Customer.last_name
FROM ShopOrder
INNER JOIN Customer ON ShopOrder.customerId=Customer.id;

-- List of all customers and their orders
SELECT Customer.id, Customer.first_name, ShopOrder.items
FROM Customer
LEFT JOIN ShopOrder ON Customer.id=ShopOrder.customerId
ORDER BY Customer.id;

-- List of all people who have made at least one order
SELECT DISTINCT ShopOrder.customerId, Customer.first_name
FROM ShopOrder
LEFT JOIN Customer ON ShopOrder.customerId=Customer.id;

-- List of all orders that are assigned to customers
SELECT ShopOrder.id, Customer.first_name
FROM Customer
RIGHT JOIN ShopOrder ON Customer.id=ShopOrder.customerId;

-- Left join -> all results on search table
-- Right join -> all results on joined table