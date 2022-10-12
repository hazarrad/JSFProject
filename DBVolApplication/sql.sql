create database if not exists DBVOLS;
use DBVOLS;

/***** Creation de la table pilote *****/ 
CREATE TABLE PILOTE
  (
    IDPILOTE INT AUTO_INCREMENT PRIMARY KEY,
    NOM VARCHAR(50),
    PRENOM VARCHAR(50),
    ADRESSE VARCHAR(50),
    TEL VARCHAR(20),
    DATENAISSANCE DATE,
    DATEEMBAUCHE DATE
  );
 /***** Creation de la table avion *****/
create table AVION 
  (
	IDAVION INT AUTO_INCREMENT PRIMARY KEY,
	Compagnie VARCHAR(50), 
	Type VARCHAR(50), 
	DateMiseMarche DATE
  );
create table TRAJET 
  (
  	IDTRAJET INT AUTO_INCREMENT PRIMARY KEY,
  	AeroportDepart VARCHAR(50), 
  	AeroportArrivee VARCHAR(50), 
  	duree_vol INT
  );
create table VOL 
  (IdVol INT AUTO_INCREMENT PRIMARY KEY, 
  Datevol DATE, 
  HeureDecalage INT, 
  MinuteDecalage INT,
  idPilote INT, 
  idAvion INT, 
  idTrajet INT,
  constraint fk_vol_pilote foreign key (idPilote) references Pilote(idpilote),
  constraint fk_vol_avion foreign key (idAvion) references Avion(idavion),
  constraint fk_vol_trajet foreign key (idTrajet) references Trajet(idtrajet)
  );
  
  /******** remplir la base de données ********/
  /** Table Pilote **/
  insert into pilote(Nom,prenom,adresse,tel,DATENAISSANCE,DATEEMBAUCHE)
  values ('NICOLAS','DEPELE','Lyon','0620531245','1984/03/12','2010/12/05');
  
  insert into pilote(Nom,prenom,adresse,tel,DATENAISSANCE,DATEEMBAUCHE)
  values ('THOMAS','TANN','CASA','0660302014','1970/05/4','2000/12/05');

  insert into pilote(Nom,prenom,adresse,tel,DATENAISSANCE,DATEEMBAUCHE)
  values ('Mohammed','KHANN','TETOUAN','0688556630','1960/05/4','1990/03/05');

  insert into pilote(Nom,prenom,adresse,tel,DATENAISSANCE,DATEEMBAUCHE)
  values ('Zaid','MLAM','RABAT','0640123555','1996/05/4','1014/02/05');

  
  update pilote 
  set nom = 'THOMASM',
  	prenom = 'TANNM',
  	adresse = 'BORDEAUX',
  	TEL = '0536235656',
  	DATENAISSANCE = '1950/02/03',
  	DATEEMBAUCHE = '1970/11/03'
  where idPilote = 2
  /** Table Avion **/
  insert into avion(compagnie,type,DateMiseMarche)
  values ('MAROC AIR','BOENG','2010/05/4');
  
  insert into avion(compagnie,type,DateMiseMarche)
  values ('FRANCE AIR','BUSNESS','2005/11/8');
  
  insert into avion(compagnie,type,DateMiseMarche)
  values ('FRANCE AIR','TRAVEL','2012/01/15');
  
  /** Table Trajet **/
  insert into trajet(AeroportDepart,AeroportArrivee,duree_vol)
  values ('Mohamed 5','Lyon',2);
  
  insert into trajet(AeroportDepart,AeroportArrivee,duree_vol)
  values ('Mohamed 5','Paris',3);
  
  insert into trajet(AeroportDepart,AeroportArrivee,duree_vol)
  values ('Dubai','London',6);
  
  /** Table Vol **/
  insert into vol(Datevol,HeureDecalage,MinuteDecalage,idPilote,idAvion,idtrajet)
  values ('2018/11/12',12,30,1,1,2);
  insert into vol(Datevol,HeureDecalage,MinuteDecalage,idPilote,idAvion,idtrajet)
  values ('2017/02/12',12,30,4,2,1);
  insert into vol(Datevol,HeureDecalage,MinuteDecalage,idPilote,idAvion,idtrajet)
  values ('2019/03/15',2,15,2,1,3);
  insert into vol(Datevol,HeureDecalage,MinuteDecalage,idPilote,idAvion,idtrajet)
  values ('2016/05/12',3,45,3,3,3);


select p.*
from vol v
     inner join pilote p on v.idpilote = p.idpilote
where v.idvol =2;
