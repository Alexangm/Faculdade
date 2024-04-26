/* Exercício 5 - Lógico: */

CREATE TABLE Funcionario (
    Cpf VARCHAR PRIMARY KEY,
    Minicial CHAR,
    Unome CHAR,
    Pnome CHAR,
    Salario FLOAT,
    Sexo CHAR,
    Datanasc DATE,
    Endereco VARCHAR,
    cpf_supervisor VARCHAR,
    Dnumero INT
);

CREATE TABLE Departamento (
    Dnumero INT PRIMARY KEY,
    Data_inicio_gerente DATE,
    Dnome CHAR,
    Cpf_gerente VARCHAR
);

CREATE TABLE Dependente (
    Nome_dependente CHAR PRIMARY KEY,
    Parentesco CHAR,
    Datanasc DATE,
    Sexo CHAR,
    Cpf VARCHAR
);

CREATE TABLE Projeto (
    projNumero INT PRIMARY KEY,
    projLocal VARCHAR,
    projNome CHAR,
    Dnumero INT
);

CREATE TABLE trabalha_em (
    Cpf VARCHAR,
    projNumero INT,
    horas VARCHAR
);

CREATE TABLE Localizacoes_Dep (
    Dnumero INT,
    Dlocal VARCHAR PRIMARY KEY
);
 
ALTER TABLE Funcionario ADD CONSTRAINT FK_Funcionario_2
    FOREIGN KEY (Dnumero)
    REFERENCES Departamento (Dnumero);
 
ALTER TABLE Funcionario ADD CONSTRAINT FK_Funcionario_3
    FOREIGN KEY (cpf_supervisor)
    REFERENCES Funcionario (Cpf);
 
ALTER TABLE Departamento ADD CONSTRAINT FK_Departamento_1
    FOREIGN KEY (Cpf_gerente)
    REFERENCES Funcionario (Cpf);
 
ALTER TABLE Dependente ADD CONSTRAINT FK_Dependente_2
    FOREIGN KEY (Cpf)
    REFERENCES Funcionario (Cpf)
    ON DELETE CASCADE;
 
ALTER TABLE Projeto ADD CONSTRAINT FK_Projeto_1
    FOREIGN KEY (Dnumero)
    REFERENCES Departamento (Dnumero)
    ON DELETE CASCADE;
 
ALTER TABLE trabalha_em ADD CONSTRAINT FK_trabalha_em_1
    FOREIGN KEY (Cpf)
    REFERENCES Funcionario (Cpf)
    ON DELETE RESTRICT;
 
ALTER TABLE trabalha_em ADD CONSTRAINT FK_trabalha_em_2
    FOREIGN KEY (projNumero)
    REFERENCES Projeto (projNumero);
 
ALTER TABLE Localizacoes_Dep ADD CONSTRAINT FK_Localizacoes_Dep_1
    FOREIGN KEY (Dnumero)
    REFERENCES Departamento (Dnumero);