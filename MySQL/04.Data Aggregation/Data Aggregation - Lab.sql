-- 1. Departments Info
SELECT department_id, count(id)
FROM employees
GROUP BY department_id;

-- 2. Average Salary 
SELECT department_id, round(avg(salary),2)
FROM employees
GROUP BY department_id;

-- 3. Minimum Salary
SELECT department_id, min(salary) AS 'Min Salary'
FROM employees
GROUP BY department_id
HAVING min(salary) > 800;

-- 4. Appetizers Count
SELECT count(*) FROM products
WHERE price > 8
GROUP BY category_id
HAVING category_id = 2;

-- 5. Menu Prices
SELECT category_id, round(avg(price),2) AS 'Average Price', round(min(price), 2) AS 'Cheapest Product', round(max(price),2) AS 'Most Expensive Product'
FROM products
GROUP BY category_id;


