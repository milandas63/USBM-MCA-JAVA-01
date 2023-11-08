DROP DATABASE IF EXISTS usbm_mca;
CREATE DATABASE IF NOT EXISTS usbm_mca;
USE usbm_mca;

################
###  course  ###
################
SELECT "course";
DROP TABLE IF EXISTS course;
CREATE TABLE IF NOT EXISTS course(
	course_id		INT(6)			NOT NULL AUTO_INCREMENT,
	course_name		VARCHAR(50)		NOT NULL UNIQUE,
	course_abbr		VARCHAR(10)		NOT NULL UNIQUE,
	course_fee		DOUBLE(12,2)	DEFAULT 0.00,
	PRIMARY KEY(course_id)
);
INSERT INTO course VALUES
	(1, 'Master in Computer Application', 'MCA', 350000.00),
	(2, 'Master in Political Science', 'POL', 200000.00),
	(3, 'Master in Business Administration', 'MBA', 320000.00),
	(4, 'Master in English', 'ENG', 180000.00);


####################
###  department  ###
####################
SELECT "department";
DROP TABLE IF EXISTS department;
CREATE TABLE IF NOT EXISTS department(
	dept_id			INT(6)			NOT NULL AUTO_INCREMENT,
	dept_name		VARCHAR(50)		NOT NULL UNIQUE,
	dept_abbr		VARCHAR(10)		NOT NULL UNIQUE,
	PRIMARY KEY(dept_id)
);
INSERT INTO department VALUES
	(1, 'Computer Science', 'CS'),
	(2, 'Political Science', 'PS'),
	(3, 'Business Administration', 'BA'),
	(4, 'English Department', 'EN');


######################
###  student_info  ###
######################
SELECT "student_info";
DROP TABLE IF EXISTS student_info;
CREATE TABLE IF NOT EXISTS student_info(
	id          INT(6)              NOT NULL AUTO_INCREMENT,
	name        VARCHAR(50)         NOT NULL UNIQUE,
	father      VARCHAR(50)         DEFAULT NULL,
	gender      ENUM('F','M','O')   NOT NULL,
	dob         DATE,
	course_id   INT(6)				NOT NULL REFERENCES course(course_id),
	dept_id     INT(6)              NOT NULL REFERENCES department(dept_id),
	PRIMARY KEY(id)
);
INSERT INTO student_info(name, father, gender, dob, course_id, dept_id) VALUES
	('Narendra Modi','Modi','M','1952-02-15', 1, 1),
	('Arun Jetley','Mukesh Jetley','M','1934-02-11', 1, 1),
	('Rajeev Gandhi','Gandhi','M','1959-11-25', 2, 2),
	('Indira Gandhi','Jawaharlal Nehru','F','1945-06-27',2, 2),
	('Rahul Gandhi','Rajeev Gandhi','M','1966-08-08',3, 3),
	('Naveen Patnaik','Biju Patnaik','M','1955-11-29', 4, 4);


SELECT s.id, s.name, s.father, s.gender, s.dob, c.course_name, d.dept_name FROM student_info AS s
LEFT JOIN course AS c ON s.course_id=c.course_id
LEFT JOIN department AS d ON s.dept_id=d.dept_id;

SELECT s.id, s.name, s.father, s.gender, s.dob, c.course_name, d.dept_name FROM student_info AS s LEFT JOIN course AS c ON s.course_id=c.course_id LEFT JOIN department AS d ON s.dept_id=d.dept_id WHERE s.dept_id>?
