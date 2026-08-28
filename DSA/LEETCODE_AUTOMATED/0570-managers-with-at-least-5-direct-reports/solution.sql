-- use self join or nested query
-- SELECT m.name 
-- FROM Employee e
-- INNER JOIN Employee m
-- ON e.managerId = m.id
-- HAVING count(e.id) >= 5;

SELECT e.name 
FROM Employee e
WHERE e.id IN (
    SELECT m.managerId 
    FROM Employee m
    GROUP BY m.managerId
    HAVING count(m.managerId) >= 5
);
