create database if not exists vol;
use vol;


create table if not exists Pilote
(
  IdPilote int auto_increment primary key,
  Nom varchar(30),
  Prenom varchar(30),
  Adresse varchar(100),
  tel varchar(30),
  DateNaissance Date,
  DateEmbauche Date
);


create table if not exists Avion
(
  IdAvion int auto_increment primary key,
  Compagnie varchar(30),
  Type varchar(30),
  DateMiseMarche Date
);


create table if not exists Trajet
(
  IdTrajet int auto_increment primary key,
  AeroportDepart varchar(30),
  AeroportArrivee varchar(30),
  duree_vol INT
);

create table if not exists Vol
(
  IdVol int auto_increment primary key,
  Datevol Date,
  HeureDecalage INT,
  MinuteDecalage INT ,
  idPilote INT  ,
  private int INT ,
  idTrajet INT ,
  constraint fk_volo_pilote foreign key(idPilote) references Pilote(IdPilote),
  constraint fk_volo_Avion foreign key(idAvion) references Avion(IdAvion),
  constraint fk_volo_Trajet foreign key(idTrajet) references Trajet(IdTrajet)

);


insert into Pilote values (null,'Pilot1','Kroki','derb galef ','+212527684','1965-12-02','2002-02-19');
insert into Pilote values (null,'Pilot2','chante','derb galef ','+2121547684','1965-12-02','2002-02-19');
insert into Pilote values (null,'Pilot3','Kmsda','derb galef ','+2121547684','1965-12-02','2002-02-19');
insert into Pilote values (null,'Pilot4','dadp','derb galef ','+2121547684','1965-12-02','2002-02-19');
insert into Pilote values (null,'Pilot5','yusef','derb galef ','+2121547684','1965-12-02','2002-02-19');
insert into Pilote values (null,'Pilot8','abdkader','derb galef ','+2121547684','1965-12-02','2002-02-19');
insert into Pilote values (null,'Pilot9','hamid','derb galef ','+2121547684','1965-12-02','2002-02-19');


insert into Avion values (null,'MarocAirways','airbase300','2002-02-19');
insert into Avion values (null,'FranceAirway','airbase850','2002-02-19');
insert into Avion values (null,'Qataraireways','airbase200','2002-02-19');
insert into Avion values (null,'EmaratesAir','airbase005','2002-02-19');
insert into Avion values (null,'BuingAirways','airbase3400','2002-02-19');


insert into Trajet values (null,'Casa','Paris',2);
insert into Trajet values (null,'Rabat','Moscow',8);
insert into Trajet values (null,'Abudabi','Madrid',6);
insert into Trajet values (null,'Dawha','rabat',6);


insert into Vol values (null,'2002-02-19',3,40,2,3,1);
insert into Vol values (null,'2002-02-19',3,40,2,3,1);
insert into Vol values (null,'2002-02-19',3,40,2,3,1);




SELECT * FROM Pilote;

