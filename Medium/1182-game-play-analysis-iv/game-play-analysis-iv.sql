with cte1 as(
 select count(distinct player_id) as total from Activity
),
cte as(
  select player_id,min(event_date) over(partition by player_id order by event_date) as initial,lead(event_date) over(partition by player_id order by event_date) as next_date from Activity
),
cte2 as(
select count(*)as count1 from cte,cte1 where datediff(next_date,initial)=1
)
select round(count1/total,2) as fraction from cte2,cte1;