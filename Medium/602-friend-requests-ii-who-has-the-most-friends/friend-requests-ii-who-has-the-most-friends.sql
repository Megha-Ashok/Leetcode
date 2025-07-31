select id,count(*) as num
from (select accepter_id as id from RequestAccepted union all select requester_id as id from RequestAccepted)as allids group by id order by num desc limit 1;  