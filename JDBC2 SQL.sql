CREATE DATABASE JDBC2;

USE JDBC2;


CREATE TABLE fotos (
	id INT,
    titulo VARCHAR (50),
    fecha DATE,
    archivo VARCHAR(50),
    visitas INT,
    idfotografo INT,
    PRIMARY  KEY (id));
    
CREATE TABLE fotografos (
	idfotografo INT,
    nombre VARCHAR (15),
    premiado BOOLEAN,
    PRIMARY KEY(idfotografo));
    
ALTER TABLE fotos ADD FOREIGN KEY (idfotografo) REFERENCES fotografos (idfotografo);
    