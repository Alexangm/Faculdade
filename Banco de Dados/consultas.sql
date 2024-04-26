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