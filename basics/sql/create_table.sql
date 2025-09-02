CREATE TABLE Customer (
  id SERIAL PRIMARY KEY,
  first_name varchar(255) NOT NULL,
  last_name varchar(255),
  country_of_origin varchar(255),
  gender varchar(1) NOT NULL,
  age int NOT NULL
);
