-- Gerado por Oracle SQL Developer Data Modeler 4.1.5.907
--   em:        2016-10-13 14:45:14 BRT
--   site:      SQL Server 2012
--   tipo:      SQL Server 2012




CREATE
  TABLE Empregado
  (
    id_empregado INTEGER NOT NULL IDENTITY NOT FOR REPLICATION ,
    nome         VARCHAR (100) NOT NULL
  )
  ON "default"
GO
ALTER TABLE Empregado ADD CONSTRAINT PK_Empregado PRIMARY KEY CLUSTERED (
id_empregado)
WITH
  (
    ALLOW_PAGE_LOCKS = ON ,
    ALLOW_ROW_LOCKS  = ON
  )
  ON "default"
GO

CREATE
  TABLE EmpregadoProjeto
  (
    id_empregado_projeto INTEGER NOT NULL ,
    id_empregado         INTEGER NOT NULL ,
    id_projeto           INTEGER NOT NULL ,
    participacao_perc    DECIMAL (3,2) NOT NULL
  )
  ON "default"
GO
ALTER TABLE EmpregadoProjeto ADD CONSTRAINT PK_EmpregadoProjeto PRIMARY KEY
CLUSTERED (id_empregado_projeto)
WITH
  (
    ALLOW_PAGE_LOCKS = ON ,
    ALLOW_ROW_LOCKS  = ON
  )
  ON "default"
GO
ALTER TABLE EmpregadoProjeto ADD CONSTRAINT UK_ProjetoEmpregado UNIQUE
NONCLUSTERED (id_empregado, id_projeto)
ON "default"
GO

CREATE
  TABLE Projeto
  (
    id_projeto        INTEGER NOT NULL IDENTITY NOT FOR REPLICATION ,
    id_responsavel    INTEGER NOT NULL ,
    descricao         INTEGER NOT NULL ,
    data_inico        DATE NOT NULL ,
    data_fim_previsto DATE NOT NULL ,
    data_fim_real     DATE ,
    valor_previsto    DECIMAL (18,2) NOT NULL ,
    valor_realizado   DECIMAL (18,2) NOT NULL ,
    valor_faturado    DECIMAL (18,2) NOT NULL ,
    situacao          CHAR (1) NOT NULL
  )
  ON "default"
GO
ALTER TABLE Projeto ADD CONSTRAINT PK_Projeto PRIMARY KEY CLUSTERED (id_projeto
)
WITH
  (
    ALLOW_PAGE_LOCKS = ON ,
    ALLOW_ROW_LOCKS  = ON
  )
  ON "default"
GO

ALTER TABLE EmpregadoProjeto
ADD CONSTRAINT FK_EmpregadoProjeto_Empregado FOREIGN KEY
(
id_empregado
)
REFERENCES Empregado
(
id_empregado
)
ON
DELETE
  NO ACTION ON
UPDATE NO ACTION
GO

ALTER TABLE EmpregadoProjeto
ADD CONSTRAINT FK_EmpregadoProjeto_Projeto FOREIGN KEY
(
id_projeto
)
REFERENCES Projeto
(
id_projeto
)
ON
DELETE
  NO ACTION ON
UPDATE NO ACTION
GO

ALTER TABLE Projeto
ADD CONSTRAINT FK_Projeto_Empregado FOREIGN KEY
(
id_responsavel
)
REFERENCES Empregado
(
id_empregado
)
ON
DELETE
  NO ACTION ON
UPDATE NO ACTION
GO


-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             3
-- CREATE INDEX                             0
-- ALTER TABLE                              7
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE DATABASE                          0
-- CREATE DEFAULT                           0
-- CREATE INDEX ON VIEW                     0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE ROLE                              0
-- CREATE RULE                              0
-- CREATE SCHEMA                            0
-- CREATE SEQUENCE                          0
-- CREATE PARTITION FUNCTION                0
-- CREATE PARTITION SCHEME                  0
-- 
-- DROP DATABASE                            0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
