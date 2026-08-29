-- not worinng
-- SELECT min(e. salary) AS SecondHighestSalary
-- FROM Employee e
-- WHERE e.salary IN (
--     SELECT e1.salary
--     FROM Employee e1
--     ORDER BY e1.salary DESC
--     LIMIT 2
-- );

SELECT (
    SELECT DISTINCT e1.salary
    FROM Employee e1
    ORDER BY e1.salary DESC
    LIMIT 1 OFFSET 1
) AS SecondHighestSalary;
