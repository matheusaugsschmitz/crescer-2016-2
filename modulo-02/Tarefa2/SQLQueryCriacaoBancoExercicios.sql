drop table EmpregadoProjeto
drop table Projeto
drop table Empregado

create table Empregado(
	id_empregado		int identity	not null,
	nome				varchar(50)		not null,
	sobrenome			varchar(50),
		constraint PK_Empregado primary key (id_empregado)
);

create table Projeto(
	id_projeto			int identity	not null,
	descricao			varchar(100)	not null,
	id_responsavel		int				not null,
	data_inicio			datetime		not null,
	data_fim_previsto	datetime		not null,
	valor_previsto		decimal(18,2)	not null,
	data_fim_real		datetime,
	valor_real			decimal(18,2),
	valor_faturado		decimal(18,2),
		constraint PK_Projeto primary key (id_projeto),
		constraint FK_Responsavel foreign key (id_responsavel) references Empregado (id_empregado)
);

create table EmpregadoProjeto(
	id_empregado_projeto	int identity	not null,
	id_empregado			int				not null,
	id_projeto				int				not null,
	participacao_perc		decimal(3,2)    not null,
		constraint PK_EmpregadoProjeto primary key (id_empregado_projeto),
		constraint FK_Empregado foreign key (id_empregado) references Empregado (id_empregado),
		constraint FK_Projeto foreign key (id_projeto) references Projeto (id_projeto)
);