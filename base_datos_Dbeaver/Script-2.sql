use banco_protalento

insert into clientes values(1,"1.127.050.945","Cristian","Carrera 9  No. 7 - 34","Cucuta");
insert into clientes values(2,"1.114.058.124","Robert","Calle 28 No. 8-69 CENTRO","Cucuta");
insert into clientes values(3,"1.020.141.201","Luis","Calle 33B  No. 38-42  Barrio Barzal","Cucuta");
insert into clientes values(4,"1.454.302.125","Duvan","Calle 20 No. 3-22","Cucuta");
insert into clientes values(5,"1.349.926.525","Alex","Calle 7 No. 5-25  Edificio Segunda","Cucuta");
insert into clientes values(6,"1.241.331.440","Emma","Carrera 56A No. 51-81","Bogota");
insert into clientes values(7,"1.123.070.241","Saul","Carrera 12  No. 3-20","Bogota");
insert into clientes values(8,"1.329.401.115","Joel","Calle 56 No. 17-30","Medellin");
insert into clientes values(9,"1.219.024.987","Oscar","Calle 40A  No. 14-35","Cali");
insert into clientes values(10,"1.246.948.463","Norma","Calle 56C  No. 26-90","Cali");
insert into clientes values(11,"1.578.478.291","Hector","Carrera 12 No. 46-72","Medellin");
insert into clientes values(12,"1.786.371.936","Gabriel","Carrera 6 No. 12-25","Cali");
insert into clientes values(13,"1.783.294.673","Felipe","Carrera 37 No. 37-90","Bogota");
insert into clientes values(14,"1.946.573.102","Stiven","Calle 68 No. 11-34","Bogota");
insert into clientes values(15,"1.684.743.039","Federico","Calle 32 No. 19-31","Medellin");
insert into clientes values(16,"1.235.775.912","Octavio","Calle 56 No. 34-77","Medellin");
insert into clientes values(17,"1.865.846.732","Raul","Calle 43 No. 60-89","Bogota");
insert into clientes values(18,"1.758.823.125","Jhon","Calle 87 No. 55-78","Cali");
insert into clientes values(19,"1.748.926.946","Santiago","Calle 42 No. 25-52","Cali");
insert into clientes values(20,"1.945.981.346","Ingrid","Calle 24 No. 19-35","Medellin");



insert into sucursales values(1,"Sucursal-01","Cucuta");
insert into sucursales values(2,"Sucursal-02","Medellin");
insert into sucursales values(3,"Sucursal-03","Bogota");
insert into sucursales values(4,"Sucursal-04","Cali");

insert into empleados values(1,"1.259.514.845","Laura","2022-03-4","350-508-6505","1.114.300.132","Pedro");
insert into empleados values(2,"1.137.567.907","Andrea","2020-11-16","350-457-5467","1.114.300.132","Pedro");
insert into empleados values(3,"1.235.566.678","Diego","2022-03-25","350-345-4578","1.378.278.176","Edgar");
insert into empleados values(4,"1.246.312.567","Pablo","2021-01-20","350-236-3463","1.114.300.132","Pedro");
insert into empleados values(5,"1.347.132.035","Camilo","2018-06-5","350-432-4512","1.456.675.489","Faber");
insert into empleados values(6,"1.890.564.456","Gustavo","2015-04-10","350-789-5561","1.456.675.489","Faber");
insert into empleados values(7,"1.467.222.039","Nubia","2022-02-9","350-986-4512","1.512.240.871","Angel");
insert into empleados values(8,"1.327.574.479","Dario","2021-08-4","350-112-5687","1.512.240.871","Angel");
insert into empleados values(9,"1.431.111.568","Angelica","2019-05-13","350-751-5678","1.378.278.176","Edgar");
insert into empleados values(10,"1.125.172.678","Arley","2017-07-24","350-235-5480","1.456.675.489","Faber")

delete from empleados 


insert into cuentas values(1,"1","1.127.050.945","10001000","Corriente","5.000.000","1","1.259.514.845",1,"Sucursal-01" );
insert into cuentas values(2,"4","1.454.302.125","10002000","Corriente","2.500.000","4","1.246.312.567",1,"Sucursal-01" );
insert into cuentas values(3,"8","1.329.401.115","10003000","Corriente","1.500.000","3","1.235.566.678",2,"Sucursal-02" );
insert into cuentas values(4,"20","1.945.981.346","10004000","Ahorro","3.000.000","9","1.431.111.568",2,"Sucursal-02" );
insert into cuentas values(5,"14","1.946.573.102","10005000","Ahorro","1.000.000","5","1.347.132.035",3,"Sucursal-03" );
insert into cuentas values(6,"6","1.241.331.440","10006000","Corriente","8.000.000","6","1.890.564.456",3,"Sucursal-03" );
insert into cuentas values(7,"19","1.748.926.946","10007000","Ahorro","2.300.000","7","1.467.222.039",4,"Sucursal-04" );
insert into cuentas values(8,"18","1.758.823.125","10008000","Corriente","4.000.000","8","1.327.574.479",4,"Sucursal-04" );

select id_cliente='1.241.331.440'from clientes where id_cliente='1.241.331.440'
					


