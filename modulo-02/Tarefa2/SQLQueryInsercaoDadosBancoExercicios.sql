--Responsaveis--
insert into Empregado (nome, sobrenome) Values ('Heitor', 'de Troia'); --1
insert into Empregado (nome, sobrenome) Values ('James', 'Lovell'); --2
insert into Empregado (nome, sobrenome) Values ('Ivan', 'Korolev'); --3
insert into Empregado (nome, sobrenome) Values ('Sergei', 'Korolev'); --4

--Projetos--
insert into Projeto (descricao, id_responsavel, data_inicio, data_fim_previsto, data_fim_real, valor_previsto, valor_real, valor_faturado) values ('Projeto Atenas II', 1, convert(datetime, '21/07/2001',103), convert(datetime, '28/07/2011', 103), convert(datetime, '10/04/2011', 103), 7851532326.14, 1969532326.14, 2500532326.14);
insert into Projeto (descricao, id_responsavel, data_inicio, data_fim_previsto, data_fim_real, valor_previsto, valor_real, valor_faturado) values ('Apollo XIII', 2, convert(datetime, '02/01/2010',103), convert(datetime, '25/04/2016', 103),  convert(datetime, '17/04/2016', 103), 350754000.65, 386754014.38, 386754014.38);
insert into Projeto (descricao, id_responsavel, data_inicio, data_fim_previsto, data_fim_real, valor_previsto, valor_real, valor_faturado) values ('Sputinik', 3, convert(datetime, '25/12/2009',103), convert(datetime, '25/10/2012', 103),  convert(datetime, '25/10/2012', 103), 79853154.50, 55953154.50, 79853154.50);
insert into Projeto (descricao, id_responsavel, data_inicio, data_fim_previsto, data_fim_real, valor_previsto, valor_real, valor_faturado) values ('Vostok I', 4, convert(datetime, '09/11/2005',103), convert(datetime, '12/04/2016', 103),  convert(datetime, '12/04/2016', 103), 765876200.00, 610176200.00, 765876200.00);
insert into Projeto (descricao, id_responsavel, data_inicio, data_fim_previsto, data_fim_real, valor_previsto, valor_real, valor_faturado) values ('Alimentar Sua Mãe', 4, convert(datetime, '09/11/2005',103), convert(datetime, '12/04/2016', 103),  convert(datetime, '12/04/2016', 103), 765876200.00, 765876200.00, 610176200.00);

--Empregados
insert into Empregado (nome) values ('Dardano'); --5
insert into Empregado (nome) values ('Laomedonte'); --6
insert into Empregado (nome, sobrenome) values ('Carlos', 'Saldanha'); --7
insert into Empregado (nome) values ('Príamo'); --8
insert into Empregado (nome) values ('Páris'); --9
insert into Empregado (nome, sobrenome) values ('Fred', 'Haise'); --10
insert into Empregado (nome, sobrenome) values ('John', 'Swigert'); --11
insert into Empregado (nome, sobrenome) values ('John', 'Young'); --12
insert into Empregado (nome, sobrenome) values ('Charles', 'Duke Jr'); --13
insert into Empregado (nome) values ('Laika'); --14
insert into Empregado (nome, sobrenome) values ('Yuri', 'Gagarin'); --15
insert into Empregado (nome, sobrenome) values ('Kerim', 'Kerimov'); --16
insert into Empregado (nome, sobrenome) values ('Valentina', 'Tereshkova'); --17

--EmpregadoProjeto--
insert into EmpregadoProjeto (id_projeto, id_empregado, participacao_perc) Values (1, 5, 1.00);
insert into EmpregadoProjeto (id_projeto, id_empregado, participacao_perc) Values (1, 6, 1.00);
insert into EmpregadoProjeto (id_projeto, id_empregado, participacao_perc) Values (1, 7, 0.10);
insert into EmpregadoProjeto (id_projeto, id_empregado, participacao_perc) Values (1, 8, 1.00);
insert into EmpregadoProjeto (id_projeto, id_empregado, participacao_perc) Values (1, 9, 1.00);
insert into EmpregadoProjeto (id_projeto, id_empregado, participacao_perc) Values (2, 10, 1.00);
insert into EmpregadoProjeto (id_projeto, id_empregado, participacao_perc) Values (2, 11, 1.00);
insert into EmpregadoProjeto (id_projeto, id_empregado, participacao_perc) Values (2, 12, 0.90);
insert into EmpregadoProjeto (id_projeto, id_empregado, participacao_perc) Values (2, 13, 0.90);
insert into EmpregadoProjeto (id_projeto, id_empregado, participacao_perc) Values (2, 7, 0.10);
insert into EmpregadoProjeto (id_projeto, id_empregado, participacao_perc) Values (3, 14, 1.00);
insert into EmpregadoProjeto (id_projeto, id_empregado, participacao_perc) Values (3, 7, 0.10);
insert into EmpregadoProjeto (id_projeto, id_empregado, participacao_perc) Values (4, 15, 1.00);
insert into EmpregadoProjeto (id_projeto, id_empregado, participacao_perc) Values (4, 16, 1.00);
insert into EmpregadoProjeto (id_projeto, id_empregado, participacao_perc) Values (4, 7, 0.10);
insert into EmpregadoProjeto (id_projeto, id_empregado, participacao_perc) Values (4, 17, 0.85);
