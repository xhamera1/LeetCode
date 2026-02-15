-- Write your PostgreSQL query statement below


SELECT e.name as Employee FROM Employee e
INNER JOIN Employee em ON e.managerId=em.id
WHERE e.salary > em.salary;