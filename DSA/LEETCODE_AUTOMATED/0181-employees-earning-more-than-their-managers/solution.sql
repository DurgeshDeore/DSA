SELECT e.name AS "Employee"
FROM Employee e
WHERE e.salary > (
    SELECT m.salary 
    FROM Employee m
    WHERE e.managerId = m.id
);
