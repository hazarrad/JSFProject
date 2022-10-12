create database if not exists GestionStock;
use GestionStock;
create table if not exists Client
(
  idClient int auto_increment primary key,
  nom varchar(30),
  prenom varchar(30),
  datenaissance varchar(30),
  adresse varchar(30),
  codepostal int,
  ville varchar(30),
  pays varchar(30),
  telephone int,
  email varchar(30)
);

insert into Client values (null,'client 1','hassan','12-9-1997','Rue FAR',93000,'Tetouan','Morocco',0678566446,'clien1@gmail.com');
insert into Client values (null,'client 2','hamza','12-9-1999','Rue FAR',94000,'Tetouan','Morocco',0678997446,'clien2@gmail.com');
insert into Client values (null,'client 4','mohamed','12-9-1998','Rue FAR',43000,'Tetouan','Morocco',0689566446,'clien3@gmail.com');
insert into Client values (null,'client 5','simo','12-9-1999','Rue FAR',53000,'Tetouan','Morocco',0644566446,'clien4@gmail.com');
insert into Client values (null,'client 6','ayoub','12-9-1994','Rue FAR',63000,'tanger','Morocco',0678575446,'clien5@gmail.com');
insert into Client values (null,'client 7','houssin','12-9-1993','Rue FAR',13000,'casa','Morocco',0645686446,'clien6@gmail.com');
insert into Client values (null,'client 8','karim','12-9-1993','Rue FAR',23000,'rabat','Morocco',0678566446,'clien7@gmail.com');
insert into Client values (null,'client 9','seraj','12-9-1992','Rue FAR',43000,'Tetouan','Morocco',0678566446,'clien8@gmail.com');
insert into Client values (null,'client 10','reda','12-9-1993','Rue FAR',53000,'tanger','Morocco',0678566446,'clien9@gmail.com');
insert into Client values (null,'client 11','ahmed','12-9-1992','Rue FAR',93000,'rabat','Morocco',0678566446,'clien10@gmail.com');
insert into Client values (null,'client 12','yassin','12-9-1992','Rue FAR',93000,'casa','Morocco',0678566446,'clien11@gmail.com');


SELECT * FROM Client;

