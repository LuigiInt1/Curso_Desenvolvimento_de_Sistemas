drop database if exists dbexercicioSA;

create database dbexercicioSA;

use dbexercicioSA;

create table usuario (
	idusuario int not null
    , nome varchar(100) not null
    , senha varchar(45)
    , primary key (idusuario)
);

create table localizacao (
	idlocalizacao int not null
    , sala varchar(45) not null
    , primary key (idlocalizacao)
);

create table professor (
	idprofessor int not null
    , cpf varchar(100) not null
    , codigo varchar(45) not null
	, nome varchar(100) not null
    , tag varchar(45)
    , idlocalizacao int
    , primary key (idusuario)
    , FOREIGN KEY (idlocalizacao) REFERENCES localizacao (idlocalizacao)
);