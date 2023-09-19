CREATE DATABASE gestaodb;
USE gestaodb;

CREATE TABLE usuario (
  id int NOT NULL AUTO_INCREMENT,
  login varchar(100) NOT NULL,
  senha varchar(150) NOT NULL,
  cargo varchar(50) NOT NULL,
  nivel_acesso int DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY uc_usuario (login)
);


