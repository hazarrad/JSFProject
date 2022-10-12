CREATE DATABASE if not exists DBEtudiants ;
use DBEtudiants;


CREATE TABLE IF NOT EXISTS filiere(

	ID_FIL int auto_increment primary key,
	libelle varchar(50),
	niveau varchar(50)
);


CREATE TABLE IF NOT EXISTS etudiant (

	id int auto_increment primary key,
	nom varchar(50),
	prenom varchar(50),
	ID_FIL int,
	CONSTRAINT FK_ETUDIANT_FILIERE FOREIGN KEY(ID_FIL) REFERENCES filiere(ID_FIL)

);



insert into  filiere values(null,'textile',1);
insert into  filiere values(null,'design',2);
insert into  filiere values(null,'textile',1);


insert into  etudiant values(null,'user1','us1',1);
insert into  etudiant values(null,'user2','us',2);
