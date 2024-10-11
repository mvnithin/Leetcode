# Write your MySQL query statement below
select st.user_id,
case 
    when count(ct.user_id)=0 then 0 
    else round(sum(case when ct.action='confirmed' then 1 else 0 end)/count(ct.action),2)end as confirmation_rate from Signups as st left join Confirmations as ct on st.user_id=ct.user_id group by user_id;