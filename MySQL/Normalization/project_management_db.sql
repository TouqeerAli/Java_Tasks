CREATE DATABASE  IF NOT EXISTS `project_management_db`;
USE `project_management_db`;

CREATE TABLE `department` (
  `dept_no` varchar(15) NOT NULL,
  `dept_name` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`dept_no`)
);


CREATE TABLE `employee` (
  `employee_no` varchar(11) NOT NULL,
  `emp_name` varchar(11) DEFAULT NULL,
  `dept_no` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`employee_no`),
  KEY `dept_no` (`dept_no`),
 FOREIGN KEY (`dept_no`) REFERENCES `department` (`dept_no`)
);

CREATE TABLE `project` (
  `project_code` int NOT NULL,
  `project_title` varchar(11) DEFAULT NULL,
  `project_manager` varchar(11) DEFAULT NULL,
  `project_budget` int DEFAULT NULL,
  `employee_no` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`project_code`),
  KEY `employee_no` (`employee_no`),
  FOREIGN KEY (`employee_no`) REFERENCES `employee` (`employee_no`)
);

CREATE TABLE `rate` (
  `rate_id` int NOT NULL AUTO_INCREMENT,
  `hourly_rate` double DEFAULT NULL,
  `project_code` int DEFAULT NULL,
  PRIMARY KEY (`rate_id`),
  KEY `project_code` (`project_code`),
  FOREIGN KEY (`project_code`) REFERENCES `project` (`project_code`)
);

