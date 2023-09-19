CREATE TABLE `db_olimpiadas`.`tb_athletes` (
  `name` VARCHAR(100),
  `country` VARCHAR(50),
  `discipline` VARCHAR(50)
);

 
CREATE TABLE `db_olimpiadas`.`tb_coaches` (
  `name` VARCHAR(100),
  `country` VARCHAR(50),
  `discipline` VARCHAR(50),
  `event` VARCHAR(50)
);
  
CREATE TABLE `db_olimpiadas`.`tb_entries_gender` (
  `discipline` VARCHAR(50),
  `female` INT,
  `male` INT,
  `total` INT
);
 

CREATE TABLE `db_olimpiadas`.`tb_medals` (
  `rank` INT,
  `team` VARCHAR(50),
  `gold` INT,
  `silver` INT, 
  `bronze` INT,
  `total` INT,
  `rank_by_total` INT
);
  
  
CREATE TABLE `db_olimpiadas`.`tb_teams` (
  `name` VARCHAR(100) NOT NULL,
  `discipline` VARCHAR(45) NOT NULL,
  `country` VARCHAR(50) NOT NULL,
  `event` VARCHAR(50) NOT NULL
); 
