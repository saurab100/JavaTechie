1. 1068. Product Sales Analysis I

select s.year, s.price, p.product_name
from sales s join product p on
s.product_id = p.product_id

2. Customer Who Visited but Did Not Make Any Transactions

# Write your MySQL query statement below
select v.customer_id, count(v.visit_id) as count_no_trans
from visits v left join Transactions t on
v.visit_id = t.visit_id
where t.transaction_id is NULL
group by v.customer_id

3. Number of Unique Subjects Taught by Each Teacher
select teacher_id, count(distinct subject_id) as cnt
from teacher  group by teacher_id

4. Classes More Than 5 Students
select class from courses
group by class having count(student) >= 5