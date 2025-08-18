CREATE TABLE TestCustomer (
  id SERIAL PRIMARY KEY,
  city varchar(255)
);

CREATE TABLE TestSupplier (
  id SERIAL PRIMARY KEY,
  city varchar(255)
);

-- Select all distinct cities from customers and suppliers
SELECT city FROM TestCustomer
UNION
SELECT city FROM TestSupplier
ORDER BY city;