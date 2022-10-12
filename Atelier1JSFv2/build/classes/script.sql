create database if not exists dbPersonnes;
use dbPersonnes;


create table if not exists Personne(
  cin varchar(10) primary key,
  nom varchar(30),
  prenom varchar(30),
  sexe   varchar(30)
);

