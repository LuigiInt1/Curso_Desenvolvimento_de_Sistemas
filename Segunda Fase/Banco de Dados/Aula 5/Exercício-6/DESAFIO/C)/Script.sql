DROP DATABASE IF exists DBDESAFIO_C;

CREATE DATABASE DBDESAFIO_C;

USE DBDESAFIO_C;

CREATE TABLE PACIENTE(

	IDPACIENTE INT NOT NULL,
    NOME_PACIENTE VARCHAR(100) NOT NULL,
    PRIMARY KEY (IDPACIENTE)
);

CREATE TABLE MEDICO(

IDMEDICO INT NOT NULL,
NOME_MEDICO INT NOT NULL,
PRIMARY KEY (IDMEDICO)

);

create TABLE CONSULTA(
IDCONSULTA INT NOT NULL,
IDPACIENTE INT NOT NULL,
IDMEDICO INT NOT NULL,
DTCONSULTA DATETIME NOT NULL,
primary key(IDCONSULTA),
FOREIGN KEY (IDPACIENTE) REFERENCES PACIENTE (IDPACIENTE),
FOREIGN KEY (IDMEDICO) REFERENCES MEDICO (IDMEDICO)
);