-- Write your PostgreSQL query statement below


SELECT e.name as Employee FROM Employee e
WHERE e.salary > (
    SELECT em.salary FROM Employee em
    WHERE e.managerId = em.id
);