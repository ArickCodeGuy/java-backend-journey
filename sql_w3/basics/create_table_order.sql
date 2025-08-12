CREATE TABLE Order (
  id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  customerId int FOREIGN KEY REFERENCES Customer(id),
  items varchar(255)
);