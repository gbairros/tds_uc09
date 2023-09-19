create database testedb;
use  testedb;
create table tb_usuario(
    id int auto_increment primary key,
    login varchar(100),
    senha varchar(100),
    nome varchar(50)
);