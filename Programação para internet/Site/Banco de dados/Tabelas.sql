CREATE TABLE anime(
idanime INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50),
genero VARCHAR(20),
ano INT,
sinopse VARCHAR(250)
);

CREATE TABLE elenco(
idelenco INT PRIMARY KEY AUTO_INCREMENT, 
idanimefk INT NOT NULL,
diretor VARCHAR(50),
estudio VARCHAR(50)
);

ALTER TABLE elenco ADD CONSTRAINT fk_anime_elenco FOREIGN KEY (idanimefk) REFERENCES anime (idanime);

CREATE TABLE dublador(
iddublador INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(90),
data_nasc VARCHAR(10),
idelencofk INT NOT NULL,
personagem VARCHAR(20)
);

ALTER TABLE dublador ADD CONSTRAINT fk_elenco_dublador FOREIGN KEY (idelencofk) REFERENCES elenco (idelenco);

CREATE TABLE cadastro(
nick VARCHAR(15) PRIMARY KEY,
email VARCHAR(50),
senha VARCHAR(15),
idade VARCHAR(3)
);
