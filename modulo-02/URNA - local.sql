CREATE TABLE MESARIO(
  IDMesario integer      not null,
  Nome      varchar2(30) not null,
    constraint PK_MESARIO primary key (IDMesario)
);

create sequence seq_mesario NOCACHE;/*cache é bom pra desempenho mas pode resultar em saltos de valores*/
insert into Mesario (IDMesario, Nome) values (seq_mesario.nextval, 'Pedro da Silva');

SELECT * FROM MESARIO;