--1) Liste o total de pedidos realizados no mês de setembro de 2016.
--select * from pedido;
select count(*) as TotalPedidosSetembor2016 
from pedido 
group by year(DataEntrega), month(DataEntrega)
having month(DataEntrega) = 9 and year(DataEntrega) = 2016;

--2) Liste quais os produtos que utilizam o material de IDMaterial = 15836. Intranet #15836
select p.IDProduto, p.Nome, p.DataCadastro, p.PrecoCusto, p.PrecoVenda, p.Situacao 
from Produto p
inner join ProdutoMaterial pm on p.IDProduto = pm.IDProduto
inner join Material m on pm.IDMaterial = m.IDMaterial
where m.IDMaterial = 15836;

--3) Liste todos os clientes que tenham o LTDA no nome ou razao social.
select IDCliente, Nome, RazaoSocial, Endereco, Bairro, IDCidade, CEP, Situacao 
from cliente 
where Nome like '%LTDA%' 
	  or RazaoSocial like '%LTDA%';

/*4) Crie (insira) um novo registro na tabela de Produto, com as seguintes informações:
Nome: Galocha Maragato
Preço de custo: 35.67
Preço de venda: 77.95
Situação: A*/
insert into Produto (Nome, DataCadastro, PrecoCusto, PrecoVenda, Situacao) 
values ('Galocha Maragato', CONVERT(datetime, GETDATE(), 103), 35.67, 77.95, 'A');

/*5) Identifique e liste os produtos que não tiveram nenhum pedido, considere os relacionamentos no modelo de dados, 
pois não há relacionamento direto entre Produto e Pedido (será preciso relacionar PedidoItem).
Obs.: o produto criado anteriormente deverá ser listado (apenas este)*/
select * from Produto p where not Exists (Select * from PedidoItem where IDProduto = p.IDProduto);

/*6) Identifique qual o estado (coluna UF da tabela Cidade) possuí o maior número de clientes (tabela Cliente), 
liste também qual o Estado possuí o menor número de clientes.*/
select count(*) cont from Cliente cl
inner join Cidade cd on cd.IDCidade = cl.IDCidade
group by UF
order by cont desc
