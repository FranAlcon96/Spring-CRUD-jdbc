create database tp6;

use tp6;

create table empleado( 
id integer unsigned not null auto_increment, 
nombre varchar(50) not null, 
profesion varchar(50) not null, 
departamento varchar(50) not null,
primary key (id)
)auto_increment=1;

