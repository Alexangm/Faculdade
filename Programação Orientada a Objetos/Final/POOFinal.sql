drop database bdloja;

CREATE DATABASE bdloja;

USE bdloja;

-- criação tabelas
CREATE TABLE cliente (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(20) NOT NULL,
    sobrenome VARCHAR(20),
    data_nascimento DATE,
    cpf VARCHAR(14) NOT NULL,
    genero VARCHAR(10),
    email VARCHAR(60),
    data_cadastro DATE
);

CREATE TABLE produto (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(200) NOT NULL,
    descricao VARCHAR(500),
    preco DOUBLE NOT NULL,
    estoque INT
);

CREATE TABLE venda (
    id INT NOT NULL AUTO_INCREMENT,
    cliente_id INT,
    produto_id1 INT,
    produto_id2 INT,
    produto_id3 INT,
    produto_id4 INT,
    produto_id5 INT,
    valor DOUBLE,
    PRIMARY KEY (id),
    FOREIGN KEY (cliente_id) REFERENCES cliente(id),
    FOREIGN KEY (produto_id1) REFERENCES produto(id),
    FOREIGN KEY (produto_id2) REFERENCES produto(id),
    FOREIGN KEY (produto_id3) REFERENCES produto(id),
    FOREIGN KEY (produto_id4) REFERENCES produto(id),
    FOREIGN KEY (produto_id5) REFERENCES produto(id)
);

CREATE TABLE login(
    id INT NOT NULL AUTO_INCREMENT,
    usuario VARCHAR(10),
    senha VARCHAR(10),
    tipo VARCHAR(15),
    PRIMARY KEY (id)
);

-- inserções
-- cliente
INSERT INTO cliente(nome, sobrenome, data_nascimento, data_cadastro, cpf, genero, email) 
VALUES ("Robnelson", "Silva", "12/05/2001", curdate(), "121.221.323-24", "Masculino", "robnelsonmataelas@gmail.com");

INSERT INTO cliente(nome, sobrenome, data_nascimento, data_cadastro, cpf, genero, email) 
VALUES ("Cidicleyson", "Moura", "01/01/1980", curdate(), "199.211.345-24", "Masculino", "cidinhopegador@gmail.com");

INSERT INTO cliente(nome, sobrenome, data_nascimento, data_cadastro, cpf, genero, email) 
VALUES ("Maria", "Melo", "19/07/2007", curdate(), "191.231.773-22", "Feminino", "marialinda123@gmail.com");

INSERT INTO cliente(nome, sobrenome, data_nascimento, data_cadastro, cpf, genero, email) 
VALUES ("Josinilda", "José", "12/09/1934", curdate(), "101.999.777-24", "Feminino", "josinildaantiga@gmail.com");

INSERT INTO cliente(nome, sobrenome, data_nascimento, data_cadastro, cpf, genero, email) 
VALUES ("Dani", "Sol", "06/09/1969", curdate(), "408.204.102-42", "Outros", "danisollua@gmail.com");

-- produto
INSERT INTO produto(nome, descricao, preco, estoque)
VALUES ("Mouse Gamer Logitech G403 Hero", "O G403 entra no ringue com a nova geração do sensor HERO 25K. Prepare-se para um mouse com rastreamento 1:1 no próximo nível, suavização, filtragem ou aceleração zero.", 179.90, 150);

INSERT INTO produto(nome, descricao, preco, estoque)
VALUES ("Teclado Multilaser Slim Preto Laser Usb - TC193", "Tecnologia de conexão: USB, Características especiais: Antirrespingo, Componentes incluídos: 1 teclado, Marca: Multilaser", 24.50, 500);

INSERT INTO produto(nome, descricao, preco, estoque)
VALUES ("Monitor LG 23.8 Full HD, IPS, HDMI, VESA, FreeSync, Sem Bordas, Preto - 24MP400-B", "O monitor LG com tecnologia de 23.8 Full HD IPS destaca o desempenho de telas de cristal líquido. Os tempos de resposta são reduzidos, a reprodução de cores é aprimorada e os usuários podem visualizar a tela em ângulos amplos.", 899.90, 80);

INSERT INTO produto(nome, descricao, preco, estoque)
VALUES ("Headset Gamer Husky Gaming Polar, Preto, P2, Drivers 50mm, Rainbow - HGMD002", "Aproveite sua gameplay com total imersão! 
O Headset Gamer Polar da Husky Gaming foi pensado em cada detalhe para oferecer a você todos os recursos necessários para um áudio perfeito e de alto conforto, acompanhados de um design que une beleza, praticidade e resistência.", 109.90, 591);

INSERT INTO produto(nome, descricao, preco, estoque)
VALUES ("Placa de Vídeo Zotac Gaming NVIDIA GeForce RTX 2060, 6GB, GDDR6 - ZT-T20600H-10M", "GPU: GeForce RTX 2060, Núcleos CUDA: 1920, Clock Boost: 1680 MHz, Capacidade: 6GB, Tipo: GDDR6, Barramento: 192 bits, Clock: 14 Gbps, PCI Express 3.0, Resfriamento: Ventilador duplo, Tamanho do slot: Duplo, Dimensões:209.6x119.3x41mm", 2049.90, 16);

-- venda
INSERT INTO venda (cliente_id, produto_id1, produto_id2, produto_id3, produto_id4, produto_id5, 179.90)
VALUES (2, 3, 1, null, null, null, null)

insert into login(usuario, senha, tipo) values("joaozinho", "joao123", "Funcionário");
