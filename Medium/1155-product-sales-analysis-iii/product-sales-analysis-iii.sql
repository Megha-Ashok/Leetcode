with cte as(
  select distinct(product_id),min(year) over(partition by product_id order by year)as first_year from Sales
)
select cte.product_id,first_year,quantity,price from cte join Sales on cte.product_id=Sales.product_id where Sales.year=first_year;