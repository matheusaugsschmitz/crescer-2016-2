/*1) Faça uma consulta que liste os empregados admitidos entre 01/05/1980 e 20/01/1982. Exibir também o total de
meses de trabalho até a data de 31/12/2000.*/
select NomeEmpregado, 
	   DATEDIFF(month, DataAdmissao, convert(datetime, '31/12/2000', 103)) as totalDeMeses 
from Empregado 
where DataAdmissao between convert(datetime, '01/05/1980', 103) 
				   and convert(datetime, '20/01/1982', 103);
/*2) Qual o cargo (tabela empregado) tem mais empregados?*/
select top 1 with ties
	   Cargo,
	   Count(*) total_Empregados
from Empregado
group by Cargo
order by total_Empregados desc;
/*3) Liste a quantidade de cidades agrupando por UF – quantas cidades cada estado possuí ?*/
select UF, 
	   count(*) as quantidadeDeCidades 
from Cidade 
group by UF;
/*4) Liste as cidades que possuem o mesmo nome e UF – cidades duplicadas.*/
select Nome, UF, count(*) Repeticoes
from Cidade 
group by Nome, UF
having count (IDCidade) > 1;
/*5) Identifique qual deve ser o próximo ID para a criação de um novo registro na tabela Associado (maior + 1).*/
select isnull(max(IDAssociado),0)+1 as proximoRegistro 
from Associado;
/*6) Faça uma consulta que mostre o nome do empregado, o Salario e percentual a ser descontado do Imposto de
Renda, considerando a tabela abaixo:
Até R$ 1.164,00 = 0% De R$ 1.164,00 a R$ 2.326,00 = 15%
Acima de R$ 2.326,00 = 27,5%.*/
select NomeEmpregado, Salario, 
	Case when Salario <= 1164 then '0%' 
		 when Salario <= 2326 then '15%' 
		 else '27,5%' 
	End percentualDescIR 
from Empregado;
/*7) Liste o nome do empregado,o nome do gerente, e o departamento de cada um.*/
select e.NomeEmpregado, de.NomeDepartamento DepartamentoEmpregado, g.NomeEmpregado NomeGerente, dg.NomeDepartamento DepartamentoGerado from Empregado e
	left join Empregado g on e.IDGerente = g.IDEmpregado
	left join Departamento de on de.IDDepartamento = e.IDDepartamento
	left join Departamento dg on dg.IDDepartamento = g.IDDepartamento;
/*8) Faça uma cópia da tabela Empregado e altere o salário de todos os empregados (Empregado) que o departamento fique na localidade de SAO PAULO, faça um reajuste de 14,5%*/
select e.IDEmpregado, e.NomeEmpregado, e.Cargo, e.IDGerente, e.DataAdmissao, 
Case	when d.Localizacao = 'SAO PAULO' then Salario*1.145
		else Salario
End Salario,
e.Comissao, e.IDDepartamento
into CopiaEmpregado 
from Empregado e
inner join Departamento d on e.IDDepartamento = d.IDDepartamento;
/*9)Liste a diferença que representará o reajuste aplicado no item anterior no somatóriodos salários de todosos empregados.*/
select (sum(c.Salario) - sum(e.Salario)) DiferecaSomaSalario 
from Empregado e
inner join CopiaEmpregado c on e.IDEmpregado = c.IDEmpregado;
/*10)Liste o departamento com o empregado de maior salário*/
select top 1 with ties
	   e.Salario,
	   d.NomeDepartamento
from Empregado e
left join Departamento d on e.IDDepartamento = d.IDDepartamento
group by e.Salario, d.NomeDepartamento
order by e.Salario desc;