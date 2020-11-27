create database dbProduit
use dbProduit

create table Produit
(
	id int AUTO_INCREMENT primary key,
	nom varchar(30),
	famille varchar(40),
	prix_achat double,
	prix_vente double
)