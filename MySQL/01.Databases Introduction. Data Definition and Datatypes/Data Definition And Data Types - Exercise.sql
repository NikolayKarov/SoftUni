-- 01. Create Tables
CREATE TABLE `minions` (
`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR (50) NOT NULL,
`age` INT NOT NULL,
PRIMARY KEY (`id`)
);

CREATE TABLE `towns` (
`town_id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR (50) NOT NULL,
PRIMARY KEY (`town_id`)
);

-- 02. Alter Minions Table
ALTER TABLE `minions`
ADD COLUMN `town_id` INT NOT NULL AFTER `age`; 

ALTER TABLE `minions`
ADD CONSTRAINT `fk_minions_town`
FOREIGN KEY (`town_id`)
REFERENCES `towns`(`id`);

-- 03. Insert Records in Both Tables
INSERT INTO `towns` (`id`, `name`) VALUES ('1', 'Sofia');
INSERT INTO `towns` (`id`, `name`) VALUES ('2', 'Plovdiv');
INSERT INTO `towns` (`id`, `name`) VALUES ('3', 'Varna');

INSERT INTO `minions` (`id`, `name`, `age`, `town_id`) VALUES ('1', 'Kevin', '22', '1');
INSERT INTO `minions` (`id`, `name`, `age`, `town_id`) VALUES ('2', 'Bob', '15', '3');
INSERT INTO `minions` (`id`, `name`, `town_id`) VALUES ('3', 'Steward', '2');

-- 04. Truncate Table Minions
TRUNCATE TABLE `minions`;

-- 05. Drop All Tables
DROP TABLE `minions`;
DROP TABLE `towns`;

-- 06. Create Table People
CREATE TABLE `people`(
`id` INT NOT NULL PRIMARY KEY UNIQUE AUTO_INCREMENT,
`name` VARCHAR (200) NOT NULL,
`picture` BLOB,
`height` FLOAT (5,2),
`weight` FLOAT (5,2),
`gender` CHAR(1) NOT NULL ,
`birthday` DATE NOT NULL,
`biography` TEXT
);

INSERT INTO `people` (`id`, `name`, `picture`, `height`, `weight`, `gender`, `birthday`, `biography`)
VALUES ('1', 'Georgi', null , '1.88', '88', 'm', '1998.01.01', NULL);

INSERT INTO `people` (`id`, `name`, `picture`, `height`, `weight`, `gender`, `birthday`, `biography`)
VALUES ('2', 'Petar', null , '1.77', '77', 'm', '1999.01.01', NULL);

INSERT INTO `people` (`id`, `name`, `picture`, `height`, `weight`, `gender`, `birthday`, `biography`)
VALUES ('3', 'Ivan', null , '1.71', '75', 'm', '1997.02.02', NULL);

INSERT INTO `people` (`id`, `name`, `picture`, `height`, `weight`, `gender`, `birthday`, `biography`)
VALUES ('4', 'Mimi', null , '1.67', '55', 'f', '1994.12.10', NULL);

INSERT INTO `people` (`id`, `name`, `picture`, `height`, `weight`, `gender`, `birthday`, `biography`)
VALUES ('5', 'Nikolay', null , '1.77', '80', 'm', '1999.10.10', NULL);

-- 07. Create Table Users
CREATE TABLE `users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(30) NULL,
  `password` VARCHAR(26) NULL,
  `profile_picture` BLOB NULL,
  `last_login_time` DATETIME NULL,
  `is_deleted` TINYINT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);

INSERT INTO users (id, `username`, `password`, profile_picture, last_login_time, is_deleted) VALUES 
('1', 'Georgi', 'Georgi', null, null, true);

INSERT INTO users (id, `username`, `password`, profile_picture, last_login_time, is_deleted) VALUES 
('2', 'Pesho', 'Pesho', null, null, false);

INSERT INTO users (id, `username`, `password`, profile_picture, last_login_time, is_deleted) VALUES 
('3', 'Ivan', 'Ivan', null, '2021-06-11-11-59-00' , true);

INSERT INTO users (id, `username`, `password`, profile_picture, last_login_time, is_deleted) VALUES 
('4', 'Petar', 'Petar', null, '2021-06-11-13-11-20' , false);

INSERT INTO users (id, `username`, `password`, profile_picture, last_login_time, is_deleted) VALUES 
('5', 'Mimi', 'Mimi', null, '2020-01-12-18-11-49' , true);

-- 08. Change Primary Key
ALTER TABLE users
  MODIFY id INT NOT NULL;
ALTER TABLE users
  DROP PRIMARY KEY;
ALTER TABLE users
  ADD CONSTRAINT pk_users PRIMARY KEY (id,username);
  
-- 9. Set Default Value of a Field
ALTER TABLE `users`
CHANGE COLUMN `last_login_time` `last_login_time` DATETIME NULL DEFAULT CURRENT_TIMESTAMP ;

-- 10. Set Unique Field
ALTER TABLE `users`
DROP PRIMARY KEY,
ADD PRIMARY KEY (`id`),
ADD UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE;

-- 11. Movies Database
CREATE TABLE `directors`(
`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`director_name` VARCHAR(25) NOT NULL, 
`notes` VARCHAR(100)
);

CREATE TABLE `genres`(
`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
`genre_name` VARCHAR(25) NOT NULL,
`notes` VARCHAR(100)
);

CREATE TABLE `categories`(
`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
`category_name` VARCHAR(25) NOT NULL,
`notes` VARCHAR(100)
);

CREATE TABLE `movies` (
`id`  INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
`title` VARCHAR(50) NOT NULL,
`director_id` INT NOT NULL,
`copyright_year` DATE,
`length` double(10,2),
`genre_id` INT NOT NULL,
`category_id` INT NOT NULL,
`rating` INT ,
`notes` VARCHAR(100),
CONSTRAINT fk_director_id_directors
FOREIGN KEY movies(director_id)
REFERENCES directors(id), 
CONSTRAINT fk_genres_movies
FOREIGN KEY movies(genre_id)
REFERENCES genres(id),
CONSTRAINT fk_categories_movies
FOREIGN KEY movies(category_id)
REFERENCES categories(id)
);

INSERT INTO `directors`(`id`, `director_name`, `notes`) VALUES (1, 'Georgi', NULL);
INSERT INTO `directors`(`id`, `director_name`, `notes`) VALUES (2, 'Petar', NULL);
INSERT INTO `directors`(`id`, `director_name`, `notes`) VALUES (3, 'Pesho', NULL);
INSERT INTO `directors`(`id`, `director_name`, `notes`) VALUES (4, 'Petko', NULL);
INSERT INTO `directors`(`id`, `director_name`, `notes`) VALUES (5, 'Ivan', NULL);

INSERT INTO `genres`(`id`, `genre_name`, `notes`) VALUES (1, 'Thriller', NULL);
INSERT INTO `genres`(`id`, `genre_name`, `notes`) VALUES (2, 'Mystery', NULL);
INSERT INTO `genres`(`id`, `genre_name`, `notes`) VALUES (3, 'Psycho', NULL);
INSERT INTO `genres`(`id`, `genre_name`, `notes`) VALUES (4, 'Comedy', NULL);
INSERT INTO `genres`(`id`, `genre_name`, `notes`) VALUES (5, 'Action', NULL);

INSERT INTO `categories`(`id`, `category_name`, `notes`) VALUES (1, 'Cats', NULL);
INSERT INTO `categories`(`id`, `category_name`, `notes`) VALUES (2, 'Cars', NULL);
INSERT INTO `categories`(`id`, `category_name`, `notes`) VALUES (3, 'Mars', NULL);
INSERT INTO `categories`(`id`, `category_name`, `notes`) VALUES (4, 'Crazy', NULL);
INSERT INTO `categories`(`id`, `category_name`, `notes`) VALUES (5, 'Favorites', NULL);

INSERT INTO  movies (id, title, director_id, copyright_year, `length`, genre_id, category_id, rating, notes)
VALUES (1, 'Gumball', 2, '1999-11-11', 2.24, 2,1,5,NULL);
INSERT INTO  movies (id, title, director_id, copyright_year, `length`, genre_id, category_id, rating, notes)
VALUES (2, 'Mario', 3, '1998-11-11', 2.30, 4,2,3,NULL);
INSERT INTO  movies (id, title, director_id, copyright_year, `length`, genre_id, category_id, rating, notes)
VALUES (3, 'Sports', 1, '1997-12-12', 2.14, 3,4,1,NULL);
INSERT INTO  movies (id, title, director_id, copyright_year, `length`, genre_id, category_id, rating, notes)
VALUES (4, 'Mickey', 4, '1999-7-7', 2.54, 4,2,2,NULL);
INSERT INTO  movies (id, title, director_id, copyright_year, `length`, genre_id, category_id, rating, notes)
VALUES (5, 'Mouse', 5, '1997-10-10', 2.44, 5,1,4,NULL);

-- 12. Car Rental Database
CREATE TABLE `categories`(
	`id` INT(11) AUTO_INCREMENT primary key,
	`category` VARCHAR (50) NOT NULL,
	`daily_rate` INT(3),
	`weekly_rate` INT(3),
	`monthly_rate` INT(3),
	`weekend_rate` INT(3)
);
CREATE TABLE `cars`(
	`id` INT AUTO_INCREMENT PRIMARY KEY,
	`plate_number` VARCHAR(50) NOT NULL,
	`make` VARCHAR(50),
	`model` VARCHAR(50),
	`car_year` INT(4),
	`category_id` INT(11),
	`doors` INT(2),
	`picture` BLOB,
	`car_condition` VARCHAR(50),
	`available` BOOL
);
CREATE TABLE `employees`(
	`id` INT AUTO_INCREMENT PRIMARY KEY,
	`first_name` VARCHAR(50) NOT NULL,
	`last_name` VARCHAR(50) NOT NULL,
	`title` VARCHAR(50),
	`notes` TEXT
);
CREATE TABLE `customers`(
	`id` INT AUTO_INCREMENT PRIMARY KEY,
	`driver_licence_number` INT(11) NOT NULL,
	`full_name` VARCHAR(50),
	`address` VARCHAR(50),
	`city` VARCHAR(50),
	`zip_code` INT(5),
	`notes` TEXT
);
 
CREATE TABLE `rental_orders` (
	`id` INT AUTO_INCREMENT PRIMARY KEY,
	`employee_id` INT(11) NOT NULL,
	`customer_id` INT(11),
	`car_id` INT(11) NOT NULL,
	`car_condition` VARCHAR(50),
	`tank_level` INT(11),
	`kilometrage_start` INT(11),
	`kilometrage_end` INT(11),
	`total_kilometrage` INT(11),
	`start_date` DATE,
	`end_date` DATE,
	`total_days` INT(11),
	`rate_applied` INT(3),
	`tax_rate` INT(11),
	`order_status` VARCHAR(50),
	`notes` TEXT
);
INSERT INTO `cars`(`plate_number`)
VALUES ('123'),('1234'),('12345');
INSERT INTO  `categories`(`category`)
VALUES ('Classic'),('Limuzine'),('Sport');
INSERT INTO  customers(driver_licence_number)
VALUES ('2232'),('232323'),('111');
INSERT INTO  employees(first_name,last_name)
VALUES ('Ivan', 'Ivanov'),('Ivan1', 'Ivanov1'), ('Ivan2', 'Ivanov2');
INSERT INTO  rental_orders(employee_id,car_id)
VALUES (1, 1),(1, 2), (2, 3);

-- 13. Basic Insert
INSERT INTO `towns` (id, `name`)
VALUES
(1, 'Sofia'),
(2, 'Plovdiv'),
(3, 'Varna'),
(4, 'Burgas');
 
INSERT INTO `departments`(id, `name`)
VALUES
(1, 'Engineering'), 
(2, 'Sales'),
(3, 'Marketing'),
(4, 'Software Development'),
(5, 'Quality Assurance');
 
INSERT INTO `employees` (`id`, `first_name`, `middle_name`, 
`last_name`, `job_title`, `department_id`, `hire_date`, `salary`)
VALUES
(1, 'Ivan', 'Ivanov', 'Ivanov', '.NET Developer', 4, '2013-02-01', 3500.00),
(2, 'Petar', 'Petrov', 'Petrov', 'Senior Engineer', 1, '2004-03-02', 4000.00),
(3, 'Maria', 'Petrova', 'Ivanova', 'Intern', 5, '2016-08-28', 525.25),
(4, 'Georgi', 'Terziev', 'Ivanov', 'CEO', 2, '2007-12-09', 3000.00),
(5, 'Peter', 'Pan', 'Pan', 'Intern', 3, '2016-08-28', 599.88);

-- 14. Basic Select All Fields
SELECT * FROM towns;
SELECT * FROM departments;
SELECT * FROM employees;

-- 15. Basic Select All Fields and Order Them
SELECT * FROM towns
ORDER BY `name`;
SELECT * FROM departments
ORDER BY `name`;
SELECT * FROM employees
ORDER BY salary DESC;

-- 16. Basic Select Some Fields
SELECT `name` FROM towns
ORDER BY `name`;
SELECT `name` FROM departments
ORDER BY `name`;
SELECT first_name, last_name, job_title, salary FROM employees
ORDER BY salary DESC;

-- 17. Increase Employees Salary
UPDATE `employees` AS e
SET `salary` = `salary` * 1.10
WHERE department_id IN (1,2,3,4,5);
SELECT salary FROM employees;


