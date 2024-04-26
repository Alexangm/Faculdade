--1
alter table ambulatorio
alter column andar integer not null

alter table ambulatorio
alter column capacidade integer not null

--2
alter table medico
alter column codesp integer not null

--3
ALTER TABLE medico 
DROP foreign key codesp;

ALTER TABLE medico 
DROP COLUMN codesp;

