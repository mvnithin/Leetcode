# Write your MySQL query statement below
select (select salary  from Employee where salary<(select Max(salary) from Employee) order by salary desc limit 1)as SecondHighestSalary;