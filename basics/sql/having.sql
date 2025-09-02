CREATE TABLE TestCustomer (
  id SERIAL PRIMARY KEY,
  first_name varchar(255),
  city varchar(255)
);

-- "The HAVING clause was added to SQL because the WHERE keyword cannot be used with aggregate functions."

-- Select all cities with 5 or more customers
SELECT COUNT(id) AS CustomerCount, city FROM TestCustomer
GROUP BY city
HAVING COUNT(id) > 5
ORDER BY city;