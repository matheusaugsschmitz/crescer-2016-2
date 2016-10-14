--1) Com base nesta base de apoio identifique se algum colaborador atua em mais de um projeto;
	select id_empregado, COUNT(*) as QuantidadeProjetos from EmpregadoProjeto group by id_empregado HAVING count(*) > 1; 
--2) Liste os projetos que geram lucro (faturado x realizado)
	select descricao from Projeto where valor_faturado > valor_real;
--3) Liste os projetos que geraram prejuízo e qual foi o percentual deste prejuízo
	select descricao, 100 - valor_faturado * 100 / valor_real as PercentualPrejuizo from Projeto where valor_faturado < valor_real;
--4) Faça uma consulta que liste os distintos empregados, exibindo seu nome completo 
-- e projetando apenas o primeiro nome (como outra coluna);
	select distinct nome, substring(nome, 1, charindex(' ', nome)) as primeiro_nome from Empregado;
	