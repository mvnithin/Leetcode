# Write your MySQL query statement below
# Write your MySQL query statement below
select product_name,sum(o.unit) as unit from Products as p join Orders as o on p.product_id=o.product_id where MONTH(o.order_date)='02' and YEAR(o.order_date)='2020' group by p.product_name having sum(o.unit)>=100;