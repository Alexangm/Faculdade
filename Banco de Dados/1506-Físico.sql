/* 1506-Logico: */

CREATE TABLE Construtora (
    fk_telefone_telefone CHAR(11),
    endereco CHAR(100),
    razao_social CHAR(50),
    nome_fantasia CHAR(30),
    cnpj VARCHAR(20) PRIMARY KEY,
    ramal CHAR(5)
);

CREATE TABLE Condominio (
    lote VARCHAR(20),
    area FLOAT(7),
    cep VARCHAR(9) PRIMARY KEY,
    endereco VARCHAR(100),
    Construtora_cnpj VARCHAR(20),
    projetopredios VARCHAR(100),
    terreno VARCHAR(30),
    Compradores_id_compra INT
);

CREATE TABLE Clientes_Historico (
    datacadastro DATE,
    fk_telefone_telefone CHAR(11),
    endereco VARCHAR(100),
    datanascimento DATE,
    nome CHAR(60),
    cpf VARCHAR(14) PRIMARY KEY,
    Compradores_id_compra INT,
    apartartamentos_apartartamentos INT
);

CREATE TABLE potenciaisClientes (
    telefone CHAR(11),
    endereco VARCHAR(100),
    nome CHAR(60),
    cpf VARCHAR(14) PRIMARY KEY,
    Compradores_id_compra INT
);

CREATE TABLE Apartamento (
    numero INT,
    andar INT,
    contrato VARCHAR(30) PRIMARY KEY,
    Predios_numeropredio VARCHAR(10)
);

CREATE TABLE Predios (
    nandares INT,
    numeropredio VARCHAR(10) PRIMARY KEY,
    Condominio_cep VARCHAR(9),
    Compradores_id_compra INT
);

CREATE TABLE Compradores (
    id_compra INT PRIMARY KEY,
    telefone_telefone_PK INT
);

CREATE TABLE telefone (
    telefone CHAR(11) NOT NULL PRIMARY KEY,
    telefone CHAR(11)
);

CREATE TABLE telefone (
    telefone_PK CHAR(11) NOT NULL PRIMARY KEY,
    telefone CHAR(11),
    telefone CHAR(11)
);

CREATE TABLE telefone (
    telefone_PK INT NOT NULL PRIMARY KEY,
    telefone VARCHAR(11)
);

CREATE TABLE apartartamentos (
    apartartamentos INT NOT NULL PRIMARY KEY,
    cota FLOAT(4),
    data DATE
);

CREATE TABLE possui (
    fk_Construtora_cnpj VARCHAR(20),
    fk_Clientes_Historico_cpf VARCHAR(14)
);

CREATE TABLE possuiPc (
    fk_Construtora_cnpj VARCHAR(20),
    fk_potenciaisClientes_cpf VARCHAR(14)
);

CREATE TABLE compram (
    Compradores_id_compra INT,
    Apartamento_contrato VARCHAR(30),
    cota_ FLOAT(7)
);
 
ALTER TABLE Construtora ADD CONSTRAINT FK_Construtora_2
    FOREIGN KEY (fk_telefone_telefone)
    REFERENCES telefone (telefone)
    ON DELETE NO ACTION;
 
ALTER TABLE Condominio ADD CONSTRAINT FK_Condominio_2
    FOREIGN KEY (Construtora_cnpj)
    REFERENCES Construtora (cnpj)
    ON DELETE CASCADE;
 
ALTER TABLE Condominio ADD CONSTRAINT FK_Condominio_3
    FOREIGN KEY (Compradores_id_compra)
    REFERENCES Compradores (id_compra)
    ON DELETE CASCADE;
 
ALTER TABLE Clientes_Historico ADD CONSTRAINT FK_Clientes_Historico_2
    FOREIGN KEY (fk_telefone_telefone)
    REFERENCES telefone (telefone_PK)
    ON DELETE CASCADE;
 
ALTER TABLE Clientes_Historico ADD CONSTRAINT FK_Clientes_Historico_3
    FOREIGN KEY (Compradores_id_compra)
    REFERENCES Compradores (id_compra)
    ON DELETE NO ACTION;
 
ALTER TABLE Clientes_Historico ADD CONSTRAINT FK_Clientes_Historico_4
    FOREIGN KEY (apartartamentos_apartartamentos)
    REFERENCES apartartamentos (apartartamentos);
 
ALTER TABLE potenciaisClientes ADD CONSTRAINT FK_potenciaisClientes_2
    FOREIGN KEY (Compradores_id_compra)
    REFERENCES Compradores (id_compra)
    ON DELETE NO ACTION;
 
ALTER TABLE Apartamento ADD CONSTRAINT FK_Apartamento_2
    FOREIGN KEY (Predios_numeropredio)
    REFERENCES Predios (numeropredio)
    ON DELETE RESTRICT;
 
ALTER TABLE Predios ADD CONSTRAINT FK_Predios_2
    FOREIGN KEY (Condominio_cep)
    REFERENCES Condominio (cep)
    ON DELETE RESTRICT;
 
ALTER TABLE Predios ADD CONSTRAINT FK_Predios_3
    FOREIGN KEY (Compradores_id_compra)
    REFERENCES Compradores (id_compra)
    ON DELETE CASCADE;
 
ALTER TABLE Compradores ADD CONSTRAINT FK_Compradores_2
    FOREIGN KEY (telefone_telefone_PK)
    REFERENCES telefone (telefone_PK)
    ON DELETE NO ACTION;
 
ALTER TABLE possui ADD CONSTRAINT FK_possui_1
    FOREIGN KEY (fk_Construtora_cnpj)
    REFERENCES Construtora (cnpj)
    ON DELETE RESTRICT;
 
ALTER TABLE possui ADD CONSTRAINT FK_possui_2
    FOREIGN KEY (fk_Clientes_Historico_cpf)
    REFERENCES Clientes_Historico (cpf)
    ON DELETE SET NULL;
 
ALTER TABLE possuiPc ADD CONSTRAINT FK_possuiPc_1
    FOREIGN KEY (fk_Construtora_cnpj)
    REFERENCES Construtora (cnpj)
    ON DELETE RESTRICT;
 
ALTER TABLE possuiPc ADD CONSTRAINT FK_possuiPc_2
    FOREIGN KEY (fk_potenciaisClientes_cpf)
    REFERENCES potenciaisClientes (cpf)
    ON DELETE SET NULL;
 
ALTER TABLE compram ADD CONSTRAINT FK_compram_1
    FOREIGN KEY (Compradores_id_compra)
    REFERENCES Compradores (id_compra)
    ON DELETE RESTRICT;
 
ALTER TABLE compram ADD CONSTRAINT FK_compram_2
    FOREIGN KEY (Apartamento_contrato)
    REFERENCES Apartamento (contrato)
    ON DELETE SET NULL;