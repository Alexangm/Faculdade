CREATE TABLE Universidades (
	sigla CHAR(10),
	nome CHAR(60),
	endereco VARCHAR(100),
	cidade CHAR (50),
	PRIMARY KEY (sigla),
);

CREATE TABLE Faculdades (
	sigla CHAR(10),
	dataImplantacao DATE,
	cidade CHAR(50),
	nome CHAR(60),
	endereco CHAR(80),
	fk_sigla CHAR(10),
	PRIMARY KEY (sigla),
	FOREIGN KEY (fk_sigla) REFERENCES Universidades
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Blocos (
	codigoIdentificacao VARCHAR(10),
	area FLOAT(7),
	tipo BIT NOT NULL ,
	fk_sigla CHAR(10),
	PRIMARY KEY (codigoIdentificacao),
	FOREIGN KEY (fk_sigla) REFERENCES Faculdades
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Didatica (
	numero INT,
	area FLOAT(7),
	fk_codigoIdentificacao VARCHAR(10),
	PRIMARY KEY (numero),
	FOREIGN KEY (fk_codigoIdentificacao) REFERENCES Blocos
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Administrativa (
	numero INT,
	area FLOAT(7),
	fk_codigoIdentificacao VARCHAR(10),
	PRIMARY KEY (numero),
	FOREIGN KEY (fk_codigoIdentificacao) REFERENCES Blocos
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Coordenacao (
	sigla CHAR(10),
	bloco INT,
	ramal INT,
	fk_numero INT,
	PRIMARY KEY (sigla),
	FOREIGN KEY (fk_numero) REFERENCES Administrativa
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Curso (
	codigo VARCHAR(10),
	nome CHAR(60),
	duracao VARCHAR(10),
	fk_sigla CHAR(10),
	PRIMARY KEY (codigo),
	FOREIGN KEY (fk_sigla) REFERENCES Coordenacao
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Turma (
	codigo VARCHAR(10),
	anoCriacao INT,
	fk_codigo VARCHAR(10)
	PRIMARY KEY (codigo)
	FOREIGN KEY (fk_codigo) REFERENCES Curso
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Aluno (
	matricula INT,
	cpf VARCHAR(14),
	endereco VARCHAR(100),
	telefone CHAR(11),
	nome CHAR(60),
	PRIMARY KEY (matricula)
);

CREATE TABLE organizam (
	fk_codigo VARCHAR(10),
	fk_matricula INT,
	FOREIGN KEY (fk_codigo) REFERENCES Turma
		ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (fk_matricula) REFERENCES Aluno
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Disciplina (
	codigo VARCHAR(10),
	cargaHoraria TIME,
	PRIMARY KEY(codigo)
);


CREATE TABLE pertence (
	fk_codigo_dis VARCHAR(10),
	fk_codigo_cur VARCHAR(10),
	FOREIGN KEY (fk_codigo_dis) REFERENCES Disciplina
		ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (fk_codigo_cur) REFERENCES Curso
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Conteudo (
	item CHAR(60),
	cargaHoraria TIME,
	PRIMARY KEY (item)
);

CREATE TABLE possui (
	fk_item CHAR(60),
	fk_codigo VARCHAR(10),
	FOREIGN KEY (fk_item) REFERENCES Conteudo
		ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (fk_codigo) REFERENCES Disciplina
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE matricula (
	fk_codigo VARCHAR(10),
	fk_matricula INT,
	FOREIGN KEY (fk_codigo) REFERENCES Disciplina 
		ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (fk_matricula) REFERENCES Aluno
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE ficaEm (
	fk_numero INT,
	fk_codigo VARCHAR(10),
	FOREIGN KEY (fk_numero) REFERENCES Didatica
		ON UPDATE NO ACTION ON DELETE NO ACTION,
	FOREIGN KEY (fk_codigo) REFERENCES Turma 
		ON UPDATE CASCADE ON DELETE CASCADE
);


CREATE TABLE telefone (
	telefone CHAR(11),
	telefoneN CHAR(11),
	PRIMARY KEY (telefone)
);

CREATE TABLE Professor (
	matricula INT,
	endereco VARCHAR(100),
	cpf VARCHAR(14),
	nome CHAR(60),
	fk_telefone CHAR(11),
	PRIMARY KEY (matricula),
	FOREIGN KEY (fk_telefone) REFERENCES telefone
		ON UPDATE CASCADE ON DELETE CASCADE
);


CREATE TABLE ministra (
	fk_codigo VARCHAR(10),
	fk_matricula INT,
	FOREIGN KEY (fk_codigo) REFERENCES Disciplina
		ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (fk_matricula) REFERENCES Professor
		ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Recurso_Didatico (
	codigo VARCHAR(10),
	horario TIME,
	data DATE,
	nome CHAR(60),
	descricao VARCHAR(100),
	fk_matricula INT,
	PRIMARY KEY (codigo),
	FOREIGN KEY (fk_matricula) REFERENCES Professor
		ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO Universidades VALUES ('UNIPAC', 'Universidade Presidente Antônio Carlos', 'Rodovia MG 338 - Km 8 - "Portão B - Colônia Rodrigo Silva, MG, 36201-143', 'Barbacena');

INSERT INTO Faculdades VALUES ('UNIPACSB', '05/07/1963', 'Sabará', 'Universidade Presidente Antônio Carlos', 'Av. Dr. Henrique de Melo, 90, Sabará - MG', 'UNIPAC');
INSERT INTO Faculdades VALUES ('UNIPACPN', '04/02/1983', 'Ponte Nova', 'Universidade Presidente Antônio Carlos', 'Av. Francisco Viêira Martins, 480 - Palmeiras, Pte. Nova - MG, 35430-225', 'UNIPAC');

INSERT INTO Blocos VALUES ('sb002', '800.00', 0, 'UNIPACSB');
INSERT INTO Blocos VALUES ('04pn00', '1500.25', 1, 'UNIPACPN'); 

INSERT INTO Didatica VALUES (1308, '80.00', 'sb002');
INSERT INTO Didatica VALUES (1309, '60.00', 'sb002');
INSERT INTO Administrativa VALUES (0002, '50.00', 'sb002');
INSERT INTO Administrativa VALUES (0003, '50.00', 'sb002');

INSERT INTO Didatica VALUES (1001, '100.00', '04pn00');
INSERT INTO Didatica VALUES (1002, '120.00', '04pn00');
INSERT INTO Administrativa VALUES (0008, '300.00', '04pn00');
INSERT INTO Administrativa VALUES (0009, '150.00', '04pn00');

INSERT INTO Coordenacao VALUES ('Conutri', 'sb002', 45578, 0003);
INSERT INTO Coordenacao VALUES ('CoEDF', '04pn00', 34110, 0009);

INSERT INTO Curso VALUES ('184NCO', 'Nutrição', '2340 horas', 'Conutri');
INSERT INTO Curso VALUES ('224EDF', 'Educação Física', '2800 horas', 'CoEDF');

INSERT INTO Turma VALUES ('Ouro', '2018', '184NCO');
INSERT INTO Turma VALUES ('Bronze', '2021', '224EDF');

INSERT INTO Aluno VALUES ('12000412', '237.633.317-27', 'Rua da Diminuição - 481 Machadinha', '99457892', 'Doroteia Bezerra Fonsceca');
INSERT INTO Aluno VALUES ('12000507', '237.473.317-00', 'Avenida Vasconn - 11 Mônica', '99488543', 'Pedro Ângelo Silveira');
INSERT INTO Aluno VALUES ('10412201', '237.000.317-37', 'Rua Ronaldo da Silva - 48 Centro', '99411892', 'Leonardo de Melo Barbosa');
INSERT INTO Aluno VALUES ('10412340', '017.477.317-17', 'Ponte Uniself - 778 Copacabano', '99457800', 'Larissa Cotta Santos');

INSERT INTO organizam VALUES ('Ouro','12000412');
INSERT INTO organizam VALUES ('Ouro','12000507');
INSERT INTO organizam VALUES ('Bronze','10412201');
INSERT INTO organizam VALUES ('Bronze','10412340');

INSERT INTO Disciplina VALUES ('Anatomia', '23:40');
INSERT INTO Disciplina VALUES ('Dietética', '21:00');
INSERT INTO Disciplina VALUES ('Cines', '20:00:00');
INSERT INTO Disciplina VALUES ('Filosofia', '22:00');

INSERT INTO pertence VALUES ('Anatomia', '184NCO');
INSERT INTO pertence VALUES ('Dietética', '184NCO');
INSERT INTO pertence VALUES ('Cines', '224EDF');
INSERT INTO pertence VALUES ('Filosofia', '224EDF');

INSERT INTO Conteudo VALUES ('Sistema esquelético', '15:00');
INSERT INTO Conteudo VALUES ('Carboidratos', '10:00');
INSERT INTO Conteudo VALUES ('Análise do Fêmur', '02:00');
INSERT INTO Conteudo VALUES ('Sócrates', '01:00');

INSERT INTO possui VALUES ('Sistema esquelético', 'Anatomia');
INSERT INTO possui VALUES ('Carboidratos', 'Dietética');
INSERT INTO possui VALUES ('Análise do Fêmur', 'Cines');
INSERT INTO possui VALUES ('Sócrates', 'Filosofia');

INSERT INTO telefone VALUES ('31998452167','-');
INSERT INTO telefone VALUES ('31998452110','-');
INSERT INTO telefone VALUES ('31998452148','31999707070');
INSERT INTO telefone VALUES ('31998452199','-');

INSERT INTO Professor VALUES ('4518712', 'Rua Discordância - 220', '222.224.348-78', 'Amanda Rezende Melo', '31998452167');
INSERT INTO Professor VALUES ('4527894', 'Avenida Odilon Melo - 458', '124.487.349-76', 'Augusto Eleaquim Morais', '31998452110');
INSERT INTO Professor VALUES ('5789415', 'Rua Criativa - 22', '147.258.369-12', 'Francisco Andrade', '31998452148');
INSERT INTO Professor VALUES ('4789998', 'Avenida dos Anjos - 7', '778.986.545-71', 'Vinícius Trindade', '31998452199');

INSERT INTO ministra VALUES ('Anatomia', '4518712');
INSERT INTO ministra VALUES ('Dietética', '4527894');
INSERT INTO ministra VALUES ('Cines', '5789415');
INSERT INTO ministra VALUES ('Filosofia', '4789998');

INSERT INTO Recurso_Didatico VALUES ('1', '20:45', '12/06/2021','DataShow', 'Recurso para projetar a imagem de um computador para aulas', '4518712');
INSERT INTO Recurso_Didatico VALUES ('2', '22:00', '12/06/2021','Bola', 'Propriamente dita, bolas para atividades', '4527894');
INSERT INTO Recurso_Didatico VALUES ('3', '19:00', '14/06/2021','Esqueleto Humano', 'Elemento de estudo das áreas humanas', '5789415');
INSERT INTO Recurso_Didatico VALUES ('4', '20:45', '15/06/2021','Globo Terrestre', 'Um globo do planeta Terra', '4789998');

INSERT INTO ficaEm VALUES (1308, 'Ouro');
INSERT INTO ficaEm VALUES (1309, 'Ouro');
INSERT INTO ficaEm VALUES (1001, 'Bronze');
INSERT INTO ficaEm VALUES (1002, 'Bronze');

INSERT INTO matricula VALUES ('Anatomia','12000412');
INSERT INTO matricula VALUES ('Dietética','12000507');
INSERT INTO matricula VALUES ('Cines','10412201');
INSERT INTO matricula VALUES ('Filosofia','10412340');

CREATE PROCEDURE alunosTurma @tipo CHAR(10)
AS
BEGIN
	SELECT aluno.nome, Turma.codigo FROM Aluno, Turma, organizam 
			 WHERE Turma.codigo = @tipo AND aluno.matricula=organizam.fk_matricula AND turma.codigo=organizam.fk_codigo
END

CREATE VIEW profDados AS SELECT * FROM Professor

