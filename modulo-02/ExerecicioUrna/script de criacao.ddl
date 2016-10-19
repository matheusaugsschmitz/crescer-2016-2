-- Gerado por Oracle SQL Developer Data Modeler 4.1.5.907
--   em:        2016-10-18 22:35:50 BRST
--   site:      Oracle Database 11g
--   tipo:      Oracle Database 11g




CREATE TABLE Candidato
  (
    id_candidato    INTEGER NOT NULL ,
    id_cidade       INTEGER NOT NULL ,
    id_tipo_cargo   INTEGER NOT NULL ,
    id_partido      INTEGER NOT NULL ,
    numero          VARCHAR2 (6) NOT NULL ,
    nome_completo   VARCHAR2 (100) NOT NULL ,
    nome_popular    VARCHAR2 (100) NOT NULL ,
    data_nascimento DATE NOT NULL ,
    registro_tre    VARCHAR2 (30) NOT NULL ,
    foto            VARCHAR2 (100) NOT NULL
  ) ;
ALTER TABLE Candidato ADD CONSTRAINT PK_Candidatos PRIMARY KEY ( id_candidato ) ;
ALTER TABLE Candidato ADD CONSTRAINT UK_Candidatos UNIQUE ( numero ) ;


CREATE TABLE Cidade
  (
    id_cidade INTEGER NOT NULL ,
    id_estado INTEGER NOT NULL ,
    nome      VARCHAR2 (100) NOT NULL
  ) ;
ALTER TABLE Cidade ADD CONSTRAINT PK_Cidade PRIMARY KEY ( id_cidade ) ;


CREATE TABLE Eleitor
  (
    id_eleitor       INTEGER NOT NULL ,
    nome_completo    VARCHAR2 (100) NOT NULL ,
    titulo_eleitoral VARCHAR2 (10) NOT NULL ,
    rg               VARCHAR2 (10) NOT NULL ,
    data_nascimento  DATE NOT NULL ,
    zona             VARCHAR2 (3) NOT NULL ,
    secao            VARCHAR2 (4) NOT NULL ,
    voto             CHAR (1) NOT NULL
  ) ;
ALTER TABLE Eleitor ADD CONSTRAINT PK_Eleitores PRIMARY KEY ( id_eleitor ) ;


CREATE TABLE Estado
  (
    id_estado INTEGER NOT NULL ,
    nome      VARCHAR2 (50) NOT NULL ,
    sigla     VARCHAR2 (2) NOT NULL
  ) ;
ALTER TABLE Estado ADD CONSTRAINT PK_Estado PRIMARY KEY ( id_estado ) ;


CREATE TABLE Partido
  (
    id_partido INTEGER NOT NULL ,
    nome       VARCHAR2 (100) NOT NULL ,
    sigla      VARCHAR2 (5) NOT NULL
  ) ;
ALTER TABLE Partido ADD CONSTRAINT PK_Partido PRIMARY KEY ( id_partido ) ;


CREATE TABLE TipoCargo
  (
    id_tipo_cargo INTEGER NOT NULL ,
    cargo         VARCHAR2 (100) NOT NULL
  ) ;
ALTER TABLE TipoCargo ADD CONSTRAINT PK_TipoCargo PRIMARY KEY ( id_tipo_cargo ) ;


CREATE TABLE TipoVoto
  (
    id_tipo_voto INTEGER NOT NULL ,
    descricao    CHAR
    --  WARNING: CHAR size not specified
  ) ;
ALTER TABLE TipoVoto ADD CONSTRAINT PK_TipoVoto PRIMARY KEY ( id_tipo_voto ) ;


CREATE TABLE Voto
  (
    id_voto      INTEGER NOT NULL ,
    id_candidato INTEGER NOT NULL ,
    id_tipo_voto INTEGER NOT NULL ,
    data_voto    DATE NOT NULL ,
    zona         VARCHAR2 (3) NOT NULL ,
    secao        VARCHAR2 (4) NOT NULL ,
    imprimir     CHAR (1) NOT NULL
  ) ;
ALTER TABLE Voto ADD CONSTRAINT PK_Voto PRIMARY KEY ( id_voto ) ;


ALTER TABLE Candidato ADD CONSTRAINT FK_Candidato_Partido FOREIGN KEY ( id_partido ) REFERENCES Partido ( id_partido ) ;

ALTER TABLE Candidato ADD CONSTRAINT FK_Candidato_TipoCargo FOREIGN KEY ( id_tipo_cargo ) REFERENCES TipoCargo ( id_tipo_cargo ) ;

ALTER TABLE Candidato ADD CONSTRAINT FK_Candidatos_Cidade FOREIGN KEY ( id_cidade ) REFERENCES Cidade ( id_cidade ) ;

ALTER TABLE Cidade ADD CONSTRAINT FK_Cidade_Estado FOREIGN KEY ( id_estado ) REFERENCES Estado ( id_estado ) ;

ALTER TABLE Voto ADD CONSTRAINT FK_Voto_Candidatos FOREIGN KEY ( id_candidato ) REFERENCES Candidato ( id_candidato ) ;

ALTER TABLE Voto ADD CONSTRAINT FK_Voto_TipoVoto FOREIGN KEY ( id_tipo_voto ) REFERENCES TipoVoto ( id_tipo_voto ) ;


-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             8
-- CREATE INDEX                             0
-- ALTER TABLE                             15
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 1
