CREATE TABLE pessoa (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	ativo boolean NOT NULL,
	cep VARCHAR(11) NULL,
    logradouro VARCHAR(100) NULL,
	numero VARCHAR(10) NULL,
	complemento VARCHAR(20) NULL,
	bairro VARCHAR(60) NULL,
	cidade VARCHAR(60) NULL,
	estado VARCHAR(3) NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, ativo, cep, logradouro, numero, complemento, bairro, cidade, estado) 
  values ('Davyd Castro', true, '53530456', 'Rua Cento e Oitenta', '05', 'Casa A', 'Caetés 1', 'Abreu e Lima', 'PE');
INSERT INTO pessoa (nome, ativo, cep, logradouro, numero, complemento, bairro, cidade, estado) 
  values ('Deuton Castro', true, '53530456', null, '05', null, 'Caetés 1', 'Abreu e Lima', 'PE');
INSERT INTO pessoa (nome, ativo, cep, logradouro, numero, complemento, bairro, cidade, estado) 
  values ('Eliete Castro', true, null, null, null, null, null, null, null);
INSERT INTO pessoa (nome, ativo, cep, logradouro, numero, complemento, bairro, cidade, estado) 
  values ('Pedro Damião',  false, null, null, null, null, null, null, null);
INSERT INTO pessoa (nome, ativo, cep, logradouro, numero, complemento, bairro, cidade, estado) 
  values ('João blablabla', false, '53530486', 'Rua Cento e Noventa', '105', null, 'Caetés 1', 'Abreu e Lima', 'PE');
INSERT INTO pessoa (nome, ativo, cep, logradouro, numero, complemento, bairro, cidade, estado) 
  values ('Tiberio Lima', true, '50950170', null, '05', null, 'Varzea', 'Recife', 'PE');
INSERT INTO pessoa (nome, ativo, cep, logradouro, numero, complemento, bairro, cidade, estado) 
  values ('Evaldo Lopes',  true, null, null, null, null, null, null, null);
INSERT INTO pessoa (nome, ativo, cep, logradouro, numero, complemento, bairro, cidade, estado) 
  values ('Josenildo Melo',  true, null, null, null, null, null, null, null);
INSERT INTO pessoa (nome, ativo, cep, logradouro, numero, complemento, bairro, cidade, estado) 
  values ('Geivson Lima',  false, null, null, null, null, null, null, null);
INSERT INTO pessoa (nome, ativo, cep, logradouro, numero, complemento, bairro, cidade, estado) 
  values ('Reuson Vieira',  true, null, null, null, null, null, null, null);