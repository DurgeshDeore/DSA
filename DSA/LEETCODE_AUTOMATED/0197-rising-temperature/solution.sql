# Write your MySQL query statement below
SELECT t.id FROM Weather t
JOIN 
Weather p
ON DATEDIFF(t.recordDate, p.recordDate) = 1
AND t.temperature > p.temperature;

-- select * from Customers c join Orders o on c.id = o.id;
