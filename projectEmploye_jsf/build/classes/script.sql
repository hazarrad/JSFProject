CREATE database IF NOT EXISTS db_employes;
use db_employes;



Create table if not exists EMPLOYE(
	id int auto_increment primary key,
	NOM varchar(50),
	PRENOM varchar(50),
	TEL varchar(50),
	FONCTION varchar(50)


);


insert into EMPLOYE values(1,'Ahmed','Mohamed','0644783992','Comptable');
insert into EMPLOYE values(2,'hassan','Mohamed','0678892292','Administrateur');
insert into EMPLOYE values(3,'karim','Mohamed','0633455622','Directeur');
insert into EMPLOYE values(4,'reda','Mohamed','0688992212','Chauffeur');
insert into EMPLOYE values(5,'hamza','Mohamed','0644783992','Chauffeur');