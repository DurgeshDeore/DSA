SELECT w.id 
FROM Weather w
JOIN  Weather w1
ON w.temperature > w1.temperature 
    AND DATEDIFF(w.recordDate, w1.recordDate) = 1;
