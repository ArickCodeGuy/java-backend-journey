CREATE TABLE Customer (
  id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  first_name varchar(255) NOT NULL,
  last_name varchar(255),
  country_of_origin varchar(255),
  gender varchar(1) NOT NULL
);
