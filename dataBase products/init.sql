CREATE DATABASE products;

\c products

CREATE TABLE items (
	id VARCHAR(20)  PRIMARY KEY,
	brand VARCHAR(50),
	product_line VARCHAR(20),
	name VARCHAR(50),
	size VARCHAR(10),
	base_price INT,
	tax INT,
	revenue INT, 
	stock INT
);
