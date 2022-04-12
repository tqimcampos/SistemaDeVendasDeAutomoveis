create table TB_CLIENTE
(
id_cliente	int(20) NOT NULL AUTO_INCREMENT,
nome		varchar(255) not null,
cpf		    varchar(20) not null,
email		varchar(255) not null,
telefone	varchar(15) not null,

PRIMARY KEY (`id_cliente`));
