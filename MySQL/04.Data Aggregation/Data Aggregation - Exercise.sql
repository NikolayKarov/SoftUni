-- 01. Records’ Count
SELECT count(*) FROM wizzard_deposits;

-- 02. Longest Magic Wand
SELECT max(magic_wand_size) AS 'longest_magic_wand' FROM wizzard_deposits;

-- 03. Longest Magic Wand per Deposit Groups
SELECT deposit_group, max(magic_wand_size) AS 'longest_magic_wand' FROM wizzard_deposits
GROUP BY deposit_group
ORDER BY max(magic_wand_size), deposit_group;

-- 04. Smallest Deposit Group per Magic Wand Size
SELECT deposit_group FROM wizzard_deposits 
ORDER BY  magic_wand_size DESC
LIMIT 1;

-- 05. Deposits Sum
SELECT deposit_group, sum(deposit_amount) AS `total_sum`
FROM wizzard_deposits
GROUP BY deposit_group
ORDER BY `total_sum`;

-- 06. Deposits Sum for Ollivander Family
SELECT deposit_group, sum(deposit_amount)
FROM wizzard_deposits
WHERE `magic_wand_creator` = 'Ollivander family'
GROUP BY deposit_group
ORDER BY `deposit_group`;

-- 07. Deposits Filter
SELECT 
    wd.deposit_group, SUM(wd.deposit_amount) AS 'total_sum'
FROM
    `wizzard_deposits` AS wd
WHERE
    wd.magic_wand_creator LIKE ('Ollivander family')
GROUP BY wd.deposit_group
HAVING total_sum < 150000
ORDER BY total_sum DESC;

-- 08. Deposit Charge
SELECT deposit_group, magic_wand_creator, MIN(deposit_charge) AS min_deposit_charge FROM wizzard_deposits
GROUP BY deposit_group, magic_wand_creator
ORDER BY magic_wand_creator, deposit_group;

-- 09. Age Groups
SELECT

CASE 
    WHEN age >= 0 AND age < 11 THEN '[0-10]'
    WHEN age >= 11 AND age < 21 THEN '[11-20]'
    WHEN age >= 21 AND age < 31 THEN '[21-30]'
    WHEN age >= 31 AND age < 41 THEN '[31-40]'
    WHEN age >= 41 AND age < 51 THEN '[41-50]'
    WHEN age >= 51 AND age < 61 THEN '[51-60]'
    WHEN age >= 61 THEN '[61+]'

END AS age_group, COUNT(age) AS wizard_count FROM wizzard_deposits
GROUP BY age_group
order by age_group;

-- 10. First Letter
SELECT DISTINCT LEFT(first_name, 1) AS FirstLetter
FROM wizzard_deposits
WHERE deposit_group = 'Troll Chest'
ORDER BY FirstLetter;