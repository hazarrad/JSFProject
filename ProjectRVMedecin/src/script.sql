create database if not exists dbRdMedecins;

use dbRdMedecins;

create table Medecin
(
  codeMedecin int auto_increment primary key,
  nom varchar(35),
  tel varchar(35),
  dateEmbauche Date,
  specialite varchar(35)

);

create table Patient
(
  codePatient int auto_increment primary key,
  nom varchar(35),
  adresse varchar(35),
  dateNaissance Date,
  sexe varchar(35)
);

create table RV
(
  numero int auto_increment primary key,
  dateRV Date,
  HeureRV varchar(35),
  codeMedecin int,
  codePatient int
);

ALTER TABLE `dbrdmedecins`.`rv`
ADD CONSTRAINT `FK_rv_Medecin` FOREIGN KEY `FK_rv_Medecin` (`codeMedecin`)
    REFERENCES `medecin` (`codeMedecin`);

ALTER TABLE `dbrdmedecins`.`rv` ADD CONSTRAINT `FK_rv_Patient` FOREIGN KEY `FK_rv_Patient` (`codePatient`)
    REFERENCES `patient` (`codePatient`);

SELECT * FROM medecin m;