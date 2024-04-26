--a
SELECT p.nome_produto
FROM Ingrediente AS i, Produto AS p
WHERE p.codigo_produto=i.codigo_produto
GROUP BY p.nome_produto
HAVING COUNT (i.codigo_produto)>1

--b
CREATE PROCEDURE produtosCadastrados
	AS 
	BEGIN 
		SELECT * FROM Produto;
	END

--c
CREATE PROCEDURE receitasCadastradas
	AS
	BEGIN
		SELECT * FROM Receita;
	END

--d
CREATE PROCEDURE ingredientesCadastrados
	AS
	BEGIN
		SELECT * FROM Ingrediente;
	END

--e
CREATE PROCEDURE receitasSistema 
	AS
	BEGIN
		SELECT * FROM produto AS p, Receita AS r, Ingrediente AS i
		WHERE p.codigo_produto=i.codigo_produto AND r.codigo_receita=i.codigo_receita
	END