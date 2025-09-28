-- Question: Write a SQL query to retrieve the transaction ID, amount, and transaction type for all transactions that are of type "Debit" and have an amount greater than 10,000 but less than 50,000.
SELECT transaction_id,
amount,
transaction_type
FROM transaction
where transaction_type = "Debit"
and amount  > 10000
and amount < 50000

-- Problem Name: Retrieve Customer Details for Savings Accounts
select first_name, contact, balance
from customer as c
join account as a
on c.customer_id = a.customer_id
join account_type_table as at on a.account_type_id = at.account_type_id
where at.account_type_name like 'Sa%'
order by first_name

-- query to find the emp whose basic pay is > 5000
select emp_id, emp_name, basic_salary, net_pay
from emp_info as ei
join salay_info as si 
on ei.emp_category = si.emp_category
join emp_roll as er on ei.emp_id = er.emp_id
where si.basic_salary > 5000;


-- select emp who join after 1 july 2001 and having experince > 5
select emp_id as Employee ID, emp_name as Employee Name
from Employee_Info
where year_of_experience > 5 and joining_date > '2001-07-01';

-- select the courseid, course_name and day and date whose day = wed
select course_id as Course ID, course_name as Course Name, schedule_date as Day, start_time as Start Time
from Course as c
join Section as sec
on c.course_id = sec.course_id
join Schedule as s 
on s.schedule_id = sec.schedule_id
where s.day = 'wednesday';

