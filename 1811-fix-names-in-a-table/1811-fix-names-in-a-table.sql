# Write your MySQL query statement below
# Write your MySQL query statement below
select user_id,CONCAT(UPPER(SUBSTR(name,1,1)),LOWER(SUBSTR(name,2,length(name)))) AS name from Users order by user_id;