DROP database if exists user;
/
CREATE DATABASE user;
/
USE user;
/
CREATE TABLE `users` (
	`user_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`email` VARCHAR(100) NULL DEFAULT NULL,
	`password` VARCHAR(50) NULL DEFAULT NULL,
	`created_date` TIMESTAMP NULL DEFAULT NULL,
	`language` VARCHAR(100) NULL DEFAULT NULL,
	`additional_info` VARCHAR(500) NULL DEFAULT NULL,
	PRIMARY KEY (`user_id`)
);
/
CREATE TABLE `players` (
	`player_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(100) NULL DEFAULT NULL,
	`age` INT(11) NULL DEFAULT NULL,
	`gender` VARCHAR(50) NULL DEFAULT NULL,
	`user_id` BIGINT(20) NOT NULL,
	PRIMARY KEY (`player_id`),
	INDEX `FK__user` (`user_id`),
	CONSTRAINT `FK__user` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
);
