# Write your MySQL query statement below
select dt.name as Department,et.name as Employee,et.salary as Salary from Employee as et join Department as dt on et.departmentId=dt.id where(select count(distinct salary) from Employee as e2 where e2.departmentId=et.departmentId and e2.salary>=et.salary)<=3  order by dt.name,et.salary desc;