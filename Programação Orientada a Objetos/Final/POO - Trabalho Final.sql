CREATE DATABASE bdloja;
use bdloja;
select now();
select curdate();
select current_time() as "Momento da consulta";

select c.nome as " " from cliente as c where c.nome = "Rogério";

CREATE TABLE cliente (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(20),
    sobrenome VARCHAR(20),
    data_nascimento DATE,
    cpf VARCHAR(14),
    genero VARCHAR(1),
    email VARCHAR(60),
    data_cadastro DATE
);

INSERT INTO cliente(nome, sobrenome, data_nascimento, data_cadastro, cpf, genero, email) VALUES 
	("Rogério", "Silva", "1999/05/18", curdate(), "111.222.333-44", "M", "rogerinhosilva@gmail.com");
    
select date_format(data_cadastro, "%d/%m/%Y") as "Ano cadastrado" from cliente where id=1;

CREATE TABLE produto (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30),
    descricao VARCHAR(255),
    preco DOUBLE,
    estoque INT
);

CREATE TABLE carrinho_compras (
	cliente_id INT,
    produto_id INT,
    id INT NOT NULL AUTO_INCREMENT,
    quantidade INT,
    PRIMARY KEY (id),
    FOREIGN KEY (cliente_id) REFERENCES cliente(id),
    FOREIGN KEY (produto_id) REFERENCES produto(id)
);

CREATE TABLE venda_final (
	carrinho_compras_id INT,
    id INT NOT NULL AUTO_INCREMENT,
    valor_total DOUBLE,
    nota_fiscal VARCHAR(1000),
    PRIMARY KEY (id),
    FOREIGN KEY (carrinho_compras_id) REFERENCES carrinho_compras(id)
);