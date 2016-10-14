/*1) Faça uma consulta que liste os empregados admitidos entre 01/05/1980 e 20/01/1982. Exibir também o total de
meses de trabalho até a data de 31/12/2000.*/
select NomeEmpregado, DATEDIFF(month, DataAdmissao, convert(datetime, '31/12/2000', 103)) as totalDeMeses from Empregado where DataAdmissao between convert(datetime, '01/05/1980', 103) and convert(datetime, '20/01/1982', 103);
/*2) Qual o cargo (tabela empregado) tem mais empregados?*/
select MAX(cargo) from Empregado;
/*3) Liste a quantidade de cidades agrupando por UF – quantas cidades cada estado possuí ?*/
select UF, count(IDCidade) as quantidadeDeCidades from Cidade group by UF;
/*4) Liste as cidades que possuem o mesmo nome e UF – cidades duplicadas.*/
select Nome from Cidade group by Nome having count (IDCidade) > 1;
/*5) Identifique qual deve ser o próximo ID para a criação de um novo registro na tabela Associado (maior + 1).*/
select max(IDAssociado)+1 as proximoRegistro from Associado;
/*6) Faça uma consulta que mostre o nome do empregado, o Salario e percentual a ser descontado do Imposto de
Renda, considerando a tabela abaixo:
Até R$ 1.164,00 = 0% De R$ 1.164,00 a R$ 2.326,00 = 15%
Acima de R$ 2.326,00 = 27,5%.*/
select NomeEmpregado, Salario, Case when Salario <= 1164 then '0%' when Salario between 1164 and 2326 then '15%' when Salario > 2326 then '27,5%' End percentualDescIR from Empregado;