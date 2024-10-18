
USE master IF EXISTS(select * from sys.databases where name='BUSMAP2')

DROP DATABASE BUSMAP2 

GO 

--- drop database  BUSMAP2 
use master  

create database BUSMAP2 

USE BUSMAP2 

GO  


CREATE TABLE Usuario( 
ID int primary key,
ID_Usuario int,
Nome_usuario VARCHAR(50), 
Senha INT, 
Email VARCHAR(50)
) 

CREATE TABLE Usuario_Linha( 
ID_Usuario int,
ID_Linha int 
);

CREATE TABLE LINHA ( 
ID INT PRIMARY KEY IDENTITY, 
Numero INT, 
Empresa VARCHAR(50),
Tarifa int,
Nome_volta VARCHAR(50),
Nome_ida VARCHAR(50),
   ); 
 CREATE TABLE Trajeto(
 Linha VARCHAR (50),
 Rua VARCHAR (50),

 )

CREATE TABLE Rua ( 
ID INT PRIMARY KEY, 
Cidade VARCHAR(40) NOT NULL, 
Bairro VARCHAR(60), 
Rua VARCHAR(40), 
PontoRefencia VARCHAR(40) 

); 


CREATE TABLE ADM ( 
    ID INT PRIMARY KEY IDENTITY, 
    Email VARCHAR(100) NOT NULL, 
    Usuario VARCHAR(50) NOT NULL, 
    Senha VARCHAR(100) NOT NULL, 
    CPF VARCHAR(14) NOT NULL 

); 
 
CREATE TABLE Perfil ( 
    ID int PRIMARY KEY IDENTITY(10,1), 
    descricao varchar(30) NOT NULL 
); 

  

