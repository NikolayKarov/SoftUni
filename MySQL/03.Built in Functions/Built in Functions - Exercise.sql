-- 01. Find Names of All Employees by First Name
SELECT `first_name`, `last_name`
FROM `employees`
WHERE `first_name` LIKE 'Sa%'
ORDER BY `employee_id`;

-- 02. Find Names of All Employees by Last Name
SELECT `first_name`, `last_name`
FROM `employees`
WHERE `last_name` LIKE '%ei%'
ORDER BY `employee_id`;

-- 03. Find First Names of All Employess
	SELECT `first_name`
	FROM `employees`
	WHERE `department_id` IN(3,10) AND (SELECT year(`hire_date`) BETWEEN 1995 AND 2005)
	ORDER BY `employee_id`;
    
-- 04. Find All Employees Except Engineers
SELECT `first_name`, `last_name`
FROM `employees`
WHERE `job_title` NOT LIKE '%engineer%'
ORDER BY `employee_id`;

-- 05. Find Towns with Name Length
SELECT `name`
FROM `towns`
WHERE char_length(`name`) BETWEEN 5 AND 6
ORDER BY `name`;

-- 06. Find Towns Starting With
SELECT `town_id`, `name`
FROM `towns`
WHERE `name` LIKE 'M%' OR `name` LIKE 'K%' OR `name` LIKE 'B%' OR `name` LIKE 'E%'
ORDER BY `name`; 

-- 07. Find Towns Not Starting With
SELECT `town_id`, `name`
FROM `towns`
WHERE `name`  NOT LIKE 'R%' AND `name` NOT LIKE 'B%' AND `name` NOT LIKE 'D%'
ORDER BY `name`;

-- 08. Create View Employees Hired After
CREATE VIEW `v_employees_hired_after_2000` AS
SELECT `first_name`, `last_name`
FROM `employees`
WHERE (SELECT year(`hire_date`) > 2000);

-- 09. Length of Last Name
SELECT `first_name`, `last_name`
FROM `employees`
WHERE char_length(`last_name`) = 5;

-- 10. Countries Holding 'A'
SELECT `country_name`, `iso_code`
FROM `countries`
WHERE `country_name` LIKE '%a%a%a%'
ORDER BY `iso_code`;

-- 11. Mix of Peak and River Names
SELECT peaks.peak_name, 
	   rivers.river_name,
       LOWER(concat(LEFT(peaks.peak_name, char_length(peaks.peak_name)-1),  rivers.river_name)) AS Mix
FROM peaks
     JOIN rivers ON RIGHT(peaks.peak_name, 1) = LEFT(rivers.river_name, 1)
ORDER BY Mix;

-- 12. Games From 2011 and 2012 Year
SELECT `name`, date_format(`start`, '%Y-%m-%d') FROM `games`
WHERE year (`start`) BETWEEN 2011 AND 2012
ORDER BY `start`, `name`
LIMIT 50;

-- 13. User Email Providersemail
SELECT `user_name`,
substring(`email`, locate('@', `email`) + 1) AS `email_provider`
FROM `users`
ORDER BY `email_provider`, `user_name`;

-- 14. Get Users with IP Address Like Pattern
SELECT `user_name`, `ip_address`
FROM `users`
WHERE `ip_address` LIKE '___.1%.%.___'
ORDER BY `user_name`;

-- 15. Show All Games with Duration
SELECT `name`,
(CASE
WHEN hour(`start`) BETWEEN 0 AND 11 THEN 'Morning'
WHEN hour(`start`) BETWEEN 12 AND 17 THEN 'Afternoon'
ELSE 'Evening'
END)  AS 'Part of the Day',
(CASE
WHEN `duration` < 4 THEN 'Extra Short'
WHEN `duration` < 7 THEN 'Short'
WHEN `duration` < 11 THEN 'Long'
ELSE 'Extra Long'
END) AS 'Duration'
FROM `games`;

-- 16. Orders Table
SELECT `product_name`, `ordar_date`,
date_add(`order_date`, interval 3 day) AS 'pay_due',
date_add(`order_date`, interval 1 month) AS 'deliver_due'
FROM `orders`;

