DROP DATABASE IF exists DBDESAFIO_B;

CREATE DATABASE DBDESAFIO_B;

USE DBDESAFIO_B;

CREATE TABLE PERGUNTA(

	IDPERGUNTA INT NOT NULL,
    TEXTO VARCHAR(100) NOT NULL,
    PRIMARY KEY (IDPERGUNTA)
);

CREATE TABLE OPCAO(

IDOPCAO INT NOT NULL,
IDPERGUNTA INT NOT NULL,
TEXTO_OPCAO VARCHAR(100) NOT NULL,
PRIMARY KEY (IDOPCAO),
FOREIGN KEY (IDPERGUNTA) REFERENCES PERGUNTA(IDPERGUNTA)

);

create TABLE ALUNO(
IDALUNO INT NOT NULL,
NOME_ALUNO varchar(100) NOT NULL,
primary key(IDALUNO)

);

CREATE TABLE RESPOSTA(
IDRESPOSTA INT NOT NULL,
DTRESPOSTA DATETIME,
IDPERGUNTA INT NOT NULL,
IDALUNO INT NOT NULL,
IDOPCAO INT NOT NULL,
PRIMARY KEY (IDRESPOSTA),
FOREIGN KEY (IDPERGUNTA) REFERENCES PERGUNTA(IDPERGUNTA),
FOREIGN KEY (IDALUNO) REFERENCES ALUNO(IDALUNO),
FOREIGN KEY (IDOPCAO) REFERENCES OPCAO(IDOPCAO)
);