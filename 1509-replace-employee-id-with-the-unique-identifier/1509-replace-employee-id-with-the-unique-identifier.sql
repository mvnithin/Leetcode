# Write your MySQL query statement below
select eu.unique_id,et.name from EmployeeUNI as eu right join Employees as et on eu.id=et.id;