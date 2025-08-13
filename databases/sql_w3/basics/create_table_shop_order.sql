CREATE TABLE ShopOrder (
  id SERIAL PRIMARY KEY,
  customerId int,
  FOREIGN KEY (customerId) REFERENCES Customer(id),
  items varchar(255)
);