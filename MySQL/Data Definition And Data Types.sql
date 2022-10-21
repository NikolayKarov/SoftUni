-- 01. Create Tables

CREATE TABLE `employees` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(50) NULL,
  `last_name` VARCHAR(50) NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `categories` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `products` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `category_id` INT NOT NULL,
  PRIMARY KEY (`id`)
   );
   
-- 02. Insert Data in Tables

INSERT INTO employees (`first_name`, `last_name`) VALUES ( 'Ivan', 'Ivanov');
INSERT INTO employees (`first_name`, `last_name`) VALUES ( 'Georgi', 'Georgiev');
INSERT INTO employees (`first_name`, `last_name`) VALUES ( 'Petar', 'Petrov');

-- 03. Alter Table

ALTER TABLE employees ADD `middle_name` VARCHAR (50);

-- 04. Adding Constraints

ALTER TABLE products
ADD CONSTRAINT fk_products_categories
FOREIGN KEY (`category_id`) 
REFERENCES `categories`(`id`);

-- 05. Modifying Columns

ALTER TABLE `employees`
CHANGE COLUMN `middle_name` `middle_name` VARCHAR(100) ;