with cte as(
select price,units,(units*price)as unit,Prices.product_id from Prices cross join UnitsSold where purchase_date>=start_date and purchase_date<=end_date and Prices.product_id=UnitsSold.product_id
)
select Prices.product_id,case when round(sum(unit)/sum(units),2)  is null then 0  else round(sum(unit)/sum(units),2)  end as average_price
from Prices left join cte on cte.product_id=Prices.product_id
group by product_id;