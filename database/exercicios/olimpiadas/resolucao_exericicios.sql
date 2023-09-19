--LOAD DATA
SET GLOBAL local_infile = true;
exit;

mysql --local-infile=1 -u root -p

LOAD DATA LOCAL INFILE '/path/file.csv' INTO TABLE `db_olimpiadas`.`tb_altethes` CHARACTER SET UTF8 FIELDS TERMINATED BY ',' ECLOSED BY '"' LINES TERMINATED BY '\r\n' IGNORE 1 LINES;


SELECT @@character_set_database, @@collation_database;

SELECT table_schema, table_name, table_collation
FROM information_schema.tables WHERE table_schema = 'db_olimpiadas';


--Questão 1
SELECT name, 'athletes'  as tipo FROM db_olimpiadas.tb_athletes where discipline = 'Handball'  UNION
SELECT name, 'coaches' as tipo FROM db_olimpiadas.tb_coaches where discipline = 'Handball';

--Questão 2, 3, 4 e 5
Não é possível responder, pois não existe relacionamento e integridade referencial entre as tabelas
