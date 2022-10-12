create  database if not exists PERSONNE ;
use PERSONNE ;


create table if not exists PERSONNE(

CIN varchar(50) primary key, 
NOM varchar(50),
PRENOM varchar(50),
SEXE varchar(50)
);


insert into PERSONNE(CIN, NOM, PRENOM, SEXE) values('l12354','mohamed','user1','Homme');
insert into PERSONNE(CIN, NOM, PRENOM, SEXE) values('l7755','yassin','user2','Homme');
