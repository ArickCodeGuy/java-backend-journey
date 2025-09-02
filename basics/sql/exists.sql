CREATE TABLE TestSupplier (
  id SERIAL PRIMARY KEY,
  s_name varchar(255),
);

CREATE TABLE TestProduct (
  id SERIAL PRIMARY KEY,
  p_name varchar(255),
  price int
  supplier_id int,
  FOREIGN KEY (supplier_id) REFERENCES TestSupplier(id)
);

-- Select all Suppliers where product's price is less then 20
SELECT * FROM TestSupplier
WHERE EXISTS (
  SELECT * FROM TestProduct
  WHERE TestProduct.customerId = TestSupplier.id AND price < 20
);
