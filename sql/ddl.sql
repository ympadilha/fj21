create table contatos(
    id bigint not null auto_increment,
    nome varchar(255),
    email varchar(255),
    endereco varchar(255),
    dataNascimento date,
    primary key(id)
);
