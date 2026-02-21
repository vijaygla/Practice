-- Write a SQL query to find the second highest salary from the Employee table.
SELECT MAX(salary) 
FROM employees 
WHERE salary < (SELECT MAX(salary) FROM employees);

select distinct salary from Employee
order by salary desc
limit 1 offset 1;

-- To get 1 row starting from offset 2 (i.e., 3rd highest salary)
SELECT DISTINCT salary 
FROM Employee
ORDER BY salary DESC
LIMIT 2, 1;

-- Write a SQL query to get the nth highest salary from the Employee table.
set n = n-1; -- for my sql
select distinct salary from Employee
order by salary desc
limit 1 offset n;

-- Give rank to each salary in the Employee table without using the DENSE_RANK() function.
select name, sleephours,
    rank() over (order by sleephours) as rank from Employee


-- To categorize employees based on their sleep hours.
select name, sleephours,
    case
        when sleephours < 7 then 'Short Sleeper'
        when sleephours = 7 then 'Average Sleeper'
        when sleephours > 7 then 'Long Sleeper'
    end as SleepCategory
from Employee;


-- Create a view to show employees with salary greater than 50000.
CREATE VIEW high_salary_employees AS
SELECT first_name, salary 
FROM employees
WHERE salary > 50000;
SELECT * FROM high_salary_employees;

-- Write a SQL query to find duplicate names in the students table.
SELECT name, COUNT(*) 
FROM students 
GROUP BY name 
HAVING COUNT(*) > 1;


-- Write a SQL query to find all employees who do not have a manager.
SELECT first_name 
FROM employees 
WHERE manager_id IS NULL;

