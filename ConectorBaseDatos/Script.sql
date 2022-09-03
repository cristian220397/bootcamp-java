create database if not exists busquedas_realizadas;

create table if not exists busquedas_recientes(
	Texto varchar(100) not null,
	URL varchar(100) not null,		
	Fecha datetime not null
);
