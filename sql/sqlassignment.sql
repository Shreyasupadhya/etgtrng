--Show the structure of the DEPT table. Select all the data from the Dept table.
SELECT *
FROM DEPT;

--Show the structure of the EMP table. Create a query to display the name, job, hiredate and employee number.
SELECT EMPNO,ENAME, JOB, HIREDATE, EMPNO
FROM EMP;

--Display the employee name, job, monthly and annual salary with appropriate column titles.
SELECT ENAME, JOB, SAL AS MONTHLYSAL, SAL*12 AS ANNUALSAL
FROM EMP;

-- Display the name concatenated with the job, separated by a comma and space, and the name the column Employee and Title.
SELECT ENAME+', '+JOB AS 'EMPLOYEE AND TITLE'
FROM EMP;

--Display unique jobs from the emp table.
SELECT DISTINCT JOB
FROM EMP;

--Display the name and salary of employees earning more than 2850.
SELECT ENAME, SAL
FROM EMP
WHERE SAL>=2850;

--Create a query to display the employee name and department number for employee SMITH.
SELECT ENAME,DEPTNO
FROM  EMP
WHERE ENAME='SMITH';

-- Display the employee name, job and start date of employees hired between February 20, 1981 and May 1, 1981. Order the query in ascending order of start date.
SELECT ENAME, JOB, HIREDATE
FROM EMP
WHERE HIREDATE BETWEEN CAST('1981-02-20' AS DATE) AND CAST('1981-05-01' AS DATE);

-- Display the employee name and department number of all employees in departments 10 and 30 in alphabetical order by name.
SELECT ENAME,DEPTNO
FROM EMP
WHERE DEPTNO = 10 OR DEPTNO=30
ORDER BY ENAME; 

-- Display the name and hiredate of every employee who was hired in 1982.
SELECT ENAME, HIREDATE
FROM EMP
WHERE YEAR(HIREDATE)=1982;

--Display the name and title of all employees who do not have a manager.
SELECT ENAME, JOB
FROM EMP
WHERE MGR IS NULL;

--Write a query to display the current date. Label the column Date.
SELECT CAST( GETDATE() AS DATE) AS 'DATE'

--Display the employees who were hired before their managers.
SELECT E.ENAME
FROM EMP E,EMP M
WHERE M.EMPNO=E.MGR AND E.HIREDATE<M.HIREDATE;

--Determine the number of managers without listing them.
SELECT COUNT(DISTINCT MGR) AS'NUMBER OF MANAGER'
FROM EMP;

--List employee details working in departments 20,30 & 40.
SELECT ENAME,JOB,SAL,HIREDATE
FROM EMP
WHERE DEPTNO=20 OR DEPTNO=30 OR DEPTNO=40;

-- List of employees whose names start with T and end with R.
SELECT ENAME 
FROM EMP
WHERE ENAME LIKE 'T%R';

--List the name and hiredate of the employee in department 30.
SELECT ENAME,HIREDATE
FROM EMP
WHERE DEPTNO=30;

--Display the hiredate in emp table formatted as ‘mm/dd/yy’.
SELECT CONVERT(VARCHAR,HIREDATE,1) FROM EMP;

--Retrieve the analysts’ record with the hiredate formatted as ‘the 3rd of Decemeber, 1984’
SELECT *
FROM EMP
WHERE HIREDATE='1984-12-03' and job='analyst';

--List the names of all employees whose hiredate anniversary is in the month of December.
select *
from emp
where month(hiredate)=12;

-- Give SQL command to find the average annual salary per job in each department.
select distinct deptno,
        
		avg(sal*12) as annual
	  
from emp
group by  deptno
 
 -- In one query, count the number of people in department in 30 who receive a salary and the number of people who receive a commission.
 select count(deptno)
 from emp
 where sal is not null and comm is not null;

 --Compute the average, minimum and maximum salaries of those groups of employees having the job as clerk or manager.
 select avg(sal) as average,
	    min(sal) as minimum,
		max(sal) as maximum
from emp
where job='clerk' or job='manager';

--Display the department numbers of departments which have more than one clerk.
SELECT	AVG(SAL) AS 'AVERAGE', 
			MIN(SAL) AS 'MINIMUM',
			MAX(SAL) AS 'MAXIMUM'
   FROM EMP
   WHERE JOB = 'CLERK' OR JOB ='MANAGER' ;

--Display the department numbers of departments which have more than one clerk. 
SELECT DEPTNO
FROM EMP
WHERE EXISTS (SELECT COUNT(JOB) AS CLERK_COUNT 
                FROM EMP
                WHERE JOB = 'CLERK'
                GROUP BY DEPTNO)
GROUP BY DEPTNO;

--Which employees earn less than 30 persent of the presidents salary.
SELECT	ENAME, 
			SAL
FROM EMP
WHERE SAL < (SELECT SAL*0.3 AS SAL
             FROM EMP 
             WHERE JOB= 'PRESIDENT');

				 				 								 								 								 								 
--How many employees work in Chicago?
select	count(ename)
from emp
join
dept
on loc='chicago';

--Which employees work in Chicago?
select	ename
from emp
join
dept
on loc='chicago';

--List the employees’ names and cities in which they work. Order the list by city.
select	ename,
		loc
from emp e
join dept d
on e.DEPTNO=d.DEPTNO
order by loc; 

--Find the number or different employees and number of departments.
select	count(distinct deptno)
from emp;

--Determine the average salaries of employees.
select	top 1 ename,
		avg(sal) as average_salary
from emp
group by ename
order by average_salary;


--Determine number of departments in the company.
select count(*) as DEPTNO
from EMP

--List department number, department name, location and total commission paid and total salary of each department.
select	distinct e.deptno,
		dname,
		loc,
		sum(comm) as totalcomm,
		sum(sal) as totalofeachdept
from emp e,dept d
group by e.DEPTNO,DNAME,LOC
order by DEPTNO;

--Display the employee name, job description and the salary multiplied by 12.
SELECT	ENAME,
		JOB,
		SAL*12 AS 'ANUAL SALARY' 
FROM EMP;

--List the name, job and commission of employee who earn no commission.
SELECT	ENAME,
		JOB,
		COMM 
FROM EMP 
WHERE  COMM IS NULL ;

--List the name, job and commission of employee who earn commission.
SELECT	ENAME,
		JOB,
		COMM 
FROM EMP 
WHERE COMM IS NOT NULL ;

-- List the employee name, job description and salary where the third character of employee name is R.
SELECT	ENAME,
		JOB,
		SAL 
FROM EMP 
WHERE ENAME LIKE '__R%'; 

-- List all the information from emp that are five characters long.
SELECT	* 
FROM EMP 
WHERE ENAME LIKE '_';

--List all the information from emp that are not five characters long.
SELECT	* 
FROM EMP 
WHERE ENAME LIKE '__';

--List names that have A and followed by R.
SELECT	* 
FROM EMP 
WHERE ENAME LIKE '%AR%';


--List all the details of employee from emp table where department number is equal to 30, order the list  by their salary.
select	ename,
		sal
from emp
where deptno=30
order by sal;


--Select name and salary of employees who earn between 1250 and 1600.
select	ename,
		sal
from emp
where sal between 1250 and 1600;


--List the name and salary of employees who earn less than 1250 or more than 1600.
select sal,ename,
(case
when sal = any (select sal
from emp
where 1250>sal) then 'lessthan1250'
when sal = any (select sal
from emp
where 1600<sal) then 'morethan1600' end) as 'status-result'
from emp;


--Compute the total salary of all employees.
select sum(sal) as totalsalofallemp
from emp;

--Count the number of employees who have job titles(that is, the number of rows where JOB is not NULL).
select	count(ename)
from emp
where job is not null;



--Compute the minimum and the maximum salary in the company.
select	top 1 e.ename,
		min(sal) as minsalary
from EMP e
group by ename
order by minsalary;
select	top 1 ename,
		max(sal) as maxsalary
from EMP e
group by ename
order by maxsalary desc;



--Write a query that produces all rows from the emp table with columns in  the following order with these as heading.
select 
	ename as Employee,
	sal as Salary,
	job as Job,
	hiredate as 'Date of Hire',
	comm as Commission,
	deptno as 'Department No',
	mgr as 'MGR No'
from EMP;


--What is the earliest date on which someone was hired, and what is the latest date on which someone was hired.
select e.ename as EarliestDate , c.ename as LatestDate
from emp e , emp c
where e.empno = c.mgr and c.HIREDATE < e.HIREDATE;


--Count the number of employees working in department 10.
select count(e.deptno)
from emp e
where e.deptno>10;



--Write a query that will give you the names and jobs of all employees in New York with a commission above 10.
select ename,sal,comm
from emp e
join 
dept d
on loc='NEW YORK'
where e.comm > 10;


--Format the hiredate with the following date formats.
select datename(weekday,getdate()) 'Day Name', format(getdate(), 'MM-dd-yy') as 'Date'
select datename(weekday,getdate()) 'Day Name', format(getdate(), 'dd-mm-yy') as 'Date'
select datename(weekday,getdate()) 'Day Name', format(getdate(), 'yy-MM-dd') as 'Date'