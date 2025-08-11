-- Starts with letter 'G'
SELECT * FROM Customer
WHERE country_of_origin='France' AND LIKE 'G%';

SELECT * FROM Customer
WHERE first_name='Tom' AND WHERE gender='M';

SELECT * FROM Customer
WHERE first_name='Tom' OR WHERE first_name='Marry';