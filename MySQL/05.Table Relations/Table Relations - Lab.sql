-- 1. Mountains and Peaks
CREATE TABLE mountains(
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50) NOT NULL
);

CREATE TABLE peaks(
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50) NOT NULL,
mountain_id INT,
CONSTRAINT fk_peaks_mountains
FOREIGN KEY (mountain_id)
REFERENCES mountains(id)
);

-- 2. Trip Organization
SELECT driver_id, vehicle_type,
CONCAT(first_name, ' ', last_name) AS driver_name
FROM vehicles AS v
JOIN campers AS c
ON v.driver_id = c.id;