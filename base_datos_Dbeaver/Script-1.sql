create database if not exists banco_protalento;
use banco_protalento;


create table sucursales(
	id int auto_increment,
	nombre_sucursal varchar(100) not null,
	cuidad varchar(100) not null,		
	primary key( id, nombre_sucursal)
);
drop table clientes
drop table sucursales
drop table cuentas

create table clientes(
    id int auto_increment ,
	id_cliente varchar(15) not null,
	nombre varchar(100) not null,
	calle varchar(100) not null,
	cuidad varchar(100),
	primary key(id,id_cliente)
);

create table cuentas(
    idincrement int auto_increment,
	idc int,
    idCliente varchar(15) not null,
	id_cuenta varchar(15)not null,
	tipoCuenta varchar(10)not null,
	prestamo varchar(15) not null,
	ide int,
	idEmpleado varchar(15) not null,
	id_sucursal int,
	nombreSucursal varchar(100) not null,
	
	primary key(idincrement),
	foreign key(id_sucursal,nombreSucursal) references sucursales(id,nombre_sucursal),
	foreign key(idc,idCliente) references clientes(id,id_cliente),
	foreign key(ide,idEmpleado) references empleados(id,id_empleado)
	
);

create table empleados(
	id int auto_increment,
	id_empleado varchar(15) not null,
	nombre_empleado varchar(100) not null,
	fecha_incorporacion date,
	numero_telefono varchar(15)not null,
	id_jefe varchar(15) not null,
	nombre_jefe varchar(100) NOT NULL,
	primary key (id,id_empleado)
);




	


