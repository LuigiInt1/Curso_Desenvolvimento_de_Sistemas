DROP DATABASE IF EXISTS BDEXERCICIO012;

CREATE DATABASE BDEXERCICIO012;

USE BDEXERCICIO012;



CREATE table PEDIDO(
IDPEDIDO INT NOT NULL ,
NOME_CLIENTE VARCHAR (60) NOT NULL,
DATA_HORA DATETIME not null,
PRIMARY KEY (IDPEDIDO)
);

CREATE TABLE PRODUTO(
IDPRODUTO INT NOT NULL,
NOME_PRODUTO VARCHAR(60) NOT NULL,
PRECO VARCHAR(10) NOT NULL,
PRIMARY KEY (IDPRODUTO)
);

CREATE TABLE PEDIDO_PRODUTO(
IDPEDIDO INT NOT NULL,
IDPRODUTO INT NOT NULL,
PRIMARY KEY (IDPEDIDO, IDPRODUTO),
FOREIGN KEY (IDPEDIDO) REFERENCES PEDIDO(IDPEDIDO),
FOREIGN KEY (IDPRODUTO) REFERENCES PRODUTO(IDPRODUTO)
);