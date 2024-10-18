USE master IF EXISTS(select * from sys.databases where name='bd_BUSMAP2') 
DROP DATABASE bd_BUSMAP2
GO 
-- CRIAR UM BANCO DE DADOS
CREATE DATABASE bd_BUSMAP2
GO
-- ACESSAR O BANCO DE DADOS
USE bd_BUSMAP2
GO

insert into Usuario (nome, email, senha, statusUsuario, dataCadastro) values ('leonardo', 'leo@gmail.com', '123456', 1, '17/10/2024')
select * from Usuario








