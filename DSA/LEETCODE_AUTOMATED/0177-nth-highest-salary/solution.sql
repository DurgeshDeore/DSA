CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
--   RETURN (
    DECLARE M INT;
    DECLARE NthSalary INT;
    
    SET M = N-1;
        SELECT DISTINCT salary INTO NthSalary
        FROM Employee
        ORDER BY salary DESC
        LIMIT 1 OFFSET M;
        
    RETURN NthSalary;
--   );
END
