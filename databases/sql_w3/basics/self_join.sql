-- Select all pairs (with dupes) where age is same
SELECT A.first_name as CustomerName1, B.first_name as CustomerName2, A.age
FROM Customer A, Customer B
WHERE A.age == A.age AND A.id <> B.id
GROUP BY A.age;