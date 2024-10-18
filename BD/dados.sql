use bd_BUSMAP2;

INSERT Usuario (nome, email, senha, nivelAcesso, foto, dataCadastro, statusUsuario)
VALUES ('Fulano da Silva', 'fulano@email.com.br', 'MTIzNDU2Nzg=', 'ADMIN', NULL, GETDATE(), 'ATIVO')
INSERT Usuario (nome, email, senha, nivelAcesso, foto, dataCadastro, statusUsuario)
VALUES ('Beltrana de Sá', 'beltrana@email.com.br', 'MTIzNDU2Nzg=', 'USER', NULL, GETDATE(), 'ATIVO')
INSERT Usuario (nome, email, senha, nivelAcesso, foto, dataCadastro, statusUsuario)
VALUES ('Sicrana de Oliveira', 'sicrana@email.com.br', 'MTIzNDU2Nzg=', 'USER', NULL, GETDATE(), 'INATIVO')
INSERT Usuario (nome, email, senha, nivelAcesso, foto, dataCadastro, statusUsuario)
VALUES ('Ordnael Zurc', 'ordnael@email.com.br', 'MTIzNDU2Nzg=', 'USER', NULL, GETDATE(), 'TROCAR_SENHA')
GO

INSERT INTO Linha (numero, nomeIda, nomeVolta, empresa, info, statusLinha)
VALUES 
('001', 'Centro para Bairro A', 'Bairro A para Centro', 'Empresa 1', 'http://empresa1.com.br/linha001', 'ATIVO'),
('002', 'Centro para Bairro B', 'Bairro B para Centro', 'Empresa 2', 'http://empresa2.com.br/linha002', 'INATIVO'),
('003', 'Centro para Bairro C', 'Bairro C para Centro', 'Empresa 3', 'http://empresa3.com.br/linha003', 'ATIVO');

INSERT INTO Ponto (cep, referencia, lado, statusPonto)
VALUES 
('12345678', 'Perto do Mercado Central', 'Esquerdo', 'ATIVO'),
('87654321', 'Em frente à Praça', 'Direito', 'ATIVO'),
('11223344', 'Ao lado da Escola Municipal', 'Esquerdo', 'INATIVO');

INSERT INTO Rua (logradouro, cep, bairro, cidade, uf, statusRua)
VALUES 
('Rua das Flores', '12345678', 'Centro', 'Cidade A', 'SP', 'ATIVO'),
('Avenida Brasil', '87654321', 'Bairro B', 'Cidade B', 'RJ', 'ATIVO'),
('Praça da República', '11223344', 'Centro', 'Cidade C', 'MG', 'INATIVO');

INSERT INTO Itinerario (linha_id, ponto_id, rua_id, statusItinerario)
VALUES 
(1, 1, 1, 'ATIVO'),
(1, 2, 2, 'ATIVO'),
(2, 3, 3, 'INATIVO');


INSERT INTO LinhaFavorita (linha_id, usuario_id, statusLinhaFavorita)
VALUES 
(1, 1, 'ATIVO'),
(2, 2, 'ATIVO'),
(3, 3, 'INATIVO');


