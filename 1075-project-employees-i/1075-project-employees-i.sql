# Write your MySQL query statement below
select Project.project_id, ROUND(AVG(Employee.experience_years), 2) AS average_years
from Project 
join Employee
where Project.employee_id = Employee.employee_id
group by Project.project_id
ORDER BY average_years;