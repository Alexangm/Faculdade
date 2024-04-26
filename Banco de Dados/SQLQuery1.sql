--1 
SELECt Medico.nome, Paciente.Nome, Consulta.Data FROM medico, paciente, consulta WHERE Medico.crm = Consulta.crm AND Consulta.RG=Paciente.RG

--2
SELECT medico.nome FROM medico, consulta WHERE medico.codesp ='1' AND consulta.hora >= '7' AND consulta.hora <= '12'
AND consulta.data = '2015-04-03' 

--3
SELECT distinct paciente.nome FROM consulta, paciente WHERE consulta.coddoenca='1' AND consulta.crm='65464' AND paciente.rg=consulta.rg

--4
SELECT nome FROM paciente UNION
SELECT nome FROM medico

--5 
SELECT medico.nome, Medico.idade FROM medico, cidade WHERE cidade.descricao='Barbacena' AND medico.codcidade=cidade.codcidade UNION
SELECT funcionario.nome, funcionario.idade FROM funcionario, cidade WHERE cidade.descricao='Barbacena' AND funcionario.codcidade=cidade.codcidade UNION
SELECT paciente.nome, paciente.idade FROM paciente, cidade WHERE cidade.descricao='Barbacena' AND paciente.codcidade=cidade.codcidade

--6
SELECT distinct funcionario.nome, funcionario.rg FROM funcionario, paciente WHERE funcionario.salario<300 AND funcionario.rg <> paciente.rg

--7
SELECT distinct numeroa FROM ambulatorio except select ambulatorio.numeroa FROM ambulatorio, medico WHERE ambulatorio.numeroa=medico.numeroa	

--8 
SELECT funcionario.nome, funcionario.rg FROM funcionario, paciente WHERE funcionario.rg=paciente.rg

--9
SELECT nome FROM funcionario INTERSECT  SELECT funcionario.nome FROM funcionario, paciente WHERE funcionario.rg=paciente.rg

--10
SELECT funcionario.nome FROM funcionario JOIN paciente on funcionario.rg=paciente.rg

--11
SELECT funcionario.nome FROM funcionario, paciente WHERE funcionario.nome in (SELECT funcionario.nome FROM funcionario, paciente WHERE funcionario.rg=paciente.rg)


--12 
SELECT distinct nome, NULL,NULL from paciente UNION 
SELECT distinct paciente.nome, medico.nome, consulta.data from paciente, consulta, medico WHERE paciente.rg=consulta.rg   






SELECT * FROM ambulatorio
SELECt * FROM medico






select * from consulta

create table funcionario (
    rg integer,
    nome varchar(30),
    idade integer,
    codcidade integer,
    salario float,
    constraint pk_funcionario primary key (rg),
    constraint funcionario_cidade_fkey foreign key (codcidade)
        references cidade (codcidade) on update cascade on delete cascade
);
insert into funcionario values (2324234, 'João Ramos', 55, 1, 1200);
insert into funcionario values (3454464, 'Bianca Silva', 23, 2, 500);
insert into funcionario values (4343242, 'Ana Duarte', 34, 3, 550);
insert into funcionario values (4565756, 'Mariana Souza', 44, 4, 601);
insert into funcionario values (8678678, 'Daniel Ventura', 23, 5, 1900);
insert into funcionario values (4563434, 'João Ramos', 54, 5, 2000);

insert into doenca (descricao) values ('sarampo');
insert into doenca (descricao) values ('rubeola');

select * from doenca


insert into consulta values (12345, 12312,  '2015-01-03', 14, 1);
insert into consulta values (12133, 13123,  '2015-01-05', 15, 1);
insert into consulta values (65464, 34345,  '2015-02-01', 16, 1);
insert into consulta values (65464, 45645,  '2015-02-03', 17, 1);
insert into consulta values (23424, 67867,  '2015-03-03', 18, 1);
insert into consulta values (85675, 56757,  '2015-04-22', 20, 2);
insert into consulta values (12345, 35435,  '2015-05-24', 10, 2);
insert into consulta values (12133, 53453,  '2015-05-23', 11, 2);
insert into consulta values (23424, 64758,  '2015-05-29', 12, 2);
insert into consulta values (85675, 97865,  '2015-05-30', 14, 2);
insert into consulta values (12345, 12312,  '2014-06-03', 14, 1);
insert into consulta values (12133, 13123,  '2014-06-05', 15, 1);
insert into consulta values (65464, 34345,  '2014-06-01', 16, 1);
insert into consulta values (65464, 45645,  '2014-07-03', 17, 1);
insert into consulta values (23424, 67867,  '2014-08-03', 18, 1);
insert into consulta values (85675, 56757,  '2014-08-22', 20, 2);
insert into consulta values (12345, 35435,  '2014-10-24', 10, 2);
insert into consulta values (12133, 53453,  '2014-11-23', 11, 2);
insert into consulta values (23424, 64758,  '2013-12-29', 12, 2);
insert into consulta values (85675, 97865,  '2013-12-30', 14, 2);