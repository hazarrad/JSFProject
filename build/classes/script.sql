CREATE DATABASE IF NOT EXISTS DBPROJECTEFM2;
use DBPROJECTEFM2;


CREATE TABLE IF NOT EXISTS Filiere(

	ID_FIL int auto_increment primary key,
	libelle varchar(50),
	niveau varchar(50)
);


CREATE TABLE IF NOT EXISTS Etudiant (

	id int auto_increment primary key,
	nom varchar(50),
	prenom varchar(50),
	ID_FIL int,
	CONSTRAINT FK_ETUDIANT_FILIERE FOREIGN KEY(ID_FIL) REFERENCES Filiere(ID_FIL)

);



insert into  filiere values(null,'textile',1);
insert into  filiere values(null,'design',2);


insert into  etudiant values(null,'user1','us1',1);
insert into  etudiant values(null,'user2','us2',2);
