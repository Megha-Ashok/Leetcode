select * from (
  select "Low Salary" as category,count(*) as accounts_count
  from Accounts where income<20000
  union
  select "Average Salary",count(*) as accounts_count
  from Accounts where income between 20000 and 50000
   union
  select "High Salary",count(*) as high_salary
  from Accounts where income>50000
) as account;


