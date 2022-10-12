create database if not exists AgenceVoiture;
use AgenceVoiture;

create table if not exists Marque(

	code int auto_increment primary key,
	libelle varchar(50),
	CONSTRAINT FK_Marque_voiture FOREIGN KEY(libelle) REFERENCES Voiture(code)


);

create table if not exists Voiture(

	code int auto_increment primary key,
	matricule varchar(50),
	categorie varchar(50),
	types varchar(50),
	prix double,
	CONSTRAINT FK_Voiture_location FOREIGN KEY(matricule) REFERENCES Location(code),
	CONSTRAINT FK_Voiture_panne FOREIGN KEY(matricule) REFERENCES Panne(code)


);


create table if not exists Modele(

	code int auto_increment primary key,
	libelle varchar(50),
	CONSTRAINT FK_model_marque FOREIGN KEY(libelle)  REFERENCES Marque(code)


);


create table if not exists Location(
	code int auto_increment primary key,
	date_debut date,
	date_fin date,
	tarif double,
	nbr_jour int


);



create table if not exists Promotion(
	code int auto_increment primary key,
	date_debut date,
	date_fin date,
		CONSTRAINT FK_promotion_model FOREIGN KEY(date_debut)  REFERENCES Modele(code)

	
);


create table if not exists Panne(
	code int auto_increment primary key,
	date_panne date,
	date_reparation date,
	description varchar(100)
	
);



create table if not exists Client(
	code int auto_increment primary key,
	nom varchar(50),
	prenom varchar(50),
	adresse varchar(50),
	pays varchar(50),
	ville varchar(50),
	cin varchar(50),
	email varchar(50),
	tel varchar(50),
	CONSTRAINT FK_client_compte FOREIGN KEY(cin) REFERENCES Compte(code),
	CONSTRAINT FK_client_location FOREIGN KEY(cin) REFERENCES Location(code),
	CONSTRAINT FK_client_Reservation FOREIGN KEY(cin) REFERENCES Reservation(code)

	
);

create table if not exists Compte(
	code int auto_increment primary key,
	login varchar(50),
	password varchar(50),
	types varchar(50)
		
	
);



create table if not exists Reservation(
	code int auto_increment primary key,
	date_res date,
	etat boolean,
	date_debut date,
	date_fin date

	
);



create table if not exists Directeur(
	code int auto_increment primary key,
	nom varchar(50),
	prenom varchar(50),
	adresse varchar(50),
	tel varchar(50),
	cin varchar(50),
	email varchar(50),
	CONSTRAINT FK_derc_compte FOREIGN KEY(cin) REFERENCES Compte(code)

);


insert into Marque(libelle) values('Audi');
insert into Marque(libelle) values('Mercidece');
insert into Marque(libelle) values('Golf');



insert into Voiture(matricule,categorie,types,prix) values('A785','categorie 1','SEDAN',90000);
insert into Voiture(matricule,categorie,types,prix) values('A785','categorie 2','coupe',87000);



insert into Modele(libelle) values('audi A7');
insert into Modele(libelle) values('Mercidice Beans');


insert into Location(date_debut,date_fin,tarif,nbr_jour) values('2019-05-12','2019-05-16',100,4);
insert into Location(date_debut,date_fin,tarif,nbr_jour) values('2019-05-12','2019-05-16',100,4);



insert into Promotion(date_debut,date_fin) values('2019-05-12','2019-05-20');
insert into Promotion(date_debut,date_fin) values('2019-05-12','2019-05-20');


insert into Panne(date_panne,date_reparation,description) values('2019-05-13','2019-05-15','probleme de moteur ');



insert into Client(nom,prenom,adresse,pays,ville,cin,email,tel) values('john','snow','Rue ville n26 ,paris','paris','france','u8908','john@gmail.com','76722233774');
insert into Client(nom,prenom,adresse,pays,ville,cin,email,tel) values('mohamed','reda','Rue tarifa n26 ,Tetouan','Tetouan','Morocco','l76563','mohamed@gmail.com','0677822332');




insert into Compte(login,password,types) values('john','123456','Premium');
insert into Compte(login,password,types) values('Mohamed','123456','Premium');


insert into Reservation(date_res,etat,date_debut,date_fin) values('2019-05-13',true,'2019-05-13','2019-05-20');


insert into Directeur(nom,prenom,adresse,tel,cin,email) values('Mr adam','ahmed','Rue ville n26 ','865653809' ,'u8908','adam@gmail.com');




