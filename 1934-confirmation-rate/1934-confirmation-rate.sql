# Write your MySQL query statement below
with confirmation_count as (
select s.user_id , count(c.user_id) as tot_request, 
sum(case when c.action = 'confirmed' then 1 else 0 end) as confimed_request
from Signups s left join
Confirmations c on 
s.user_id = c.user_id
group by s.user_id
)

select user_id, ifnull(round(confimed_request / tot_request, 2),0) as confirmation_rate
from confirmation_count;