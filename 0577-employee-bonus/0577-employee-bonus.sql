# Write your MySQL query statement below
select et.name,bt.bonus from Employee as et left join Bonus as bt on et.empId=bt.empId where bt.bonus<1000 or bt.bonus is null;