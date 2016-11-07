create database StreetFighter;
use StreetFighter;
create table Personagens(
	id int identity,
	nome varchar(100) not null,
	url_imagem varchar(255),
	primeira_aparicao varchar(200) not null,
	nascimento datetime not null,
	altura int not null,
	peso decimal not null,
	origem varchar(200) not null,
	golpes_especiais varchar(200) not null,
	personagem_oculto bit not null,
		constraint PK_Personagem primary key (id)
);
create table Usuario(
	id int identity,
	nome varchar(100) not null,
	senha varchar(50) not null,
		constraint PK_Usuario primary key (id)
);