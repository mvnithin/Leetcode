# Write your MySQL query statement below
select e1.name from Employee as e1 join Employee as e2 on e1.id=e2.managerId group by e1.id,e1.name having count(e1.id)>=5;