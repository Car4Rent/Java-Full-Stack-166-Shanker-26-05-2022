insert into Account (ac_no,balance,name) values (1,45000,'shanker');
insert into Account (ac_no,balance,name) values (2,55000,'Anu'),(3,12000,'Ram');
insert into Account values (4,75000 ,'Ravi');
SELECT * FROM Account ;
select name , balance  from Account;
select name , balance  from Account where balance >15000;

CREATE  TABLE People (
  id int NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL ,
  occupation VARCHAR(35) NOT NULL ,
  age int,
  PRIMARY KEY (id)
);

    INSERT INTO People (id, name, occupation, age)   
    VALUES (101, 'Peter', 'Engineer', 32);  

INSERT INTO People values (105,'Mike' ,'Leader' ,28),
(102,'Joseph','Devoleper',30),
(103,'Mike' ,'Leader' ,28),
(104, 'Stepehen' ,'Scienist',45);

INSERT INTO People (Name,occupation)
values ('Stephen','Scientist'),('Bob','Actor');

SELECT * FROM People ;

UPDATE People set age=45 WHERE id=103;
UPDATE People set age=33 WHERE name='Bob';
UPDATE People set occupation='Tester' WHERE id=104;
UPDATE People set name='John' WHERE id=103 AND name='Stephen';
UPDATE People set age = 35 WHERE id = 103 AND occupation ='Scientist'; 
UPDATE People set age = 34,occupation ='Team Leader' WHERE id = 101 ; 

DELETE FROM People WHERE id =102;
DELETE FROM People WHERE id =104 AND name ='Bob';
DELETE FROM People ORDER by name LIMIT 3;

CREATE TABLE Oficers (
Oficer_id int NOT NULL AUTO_INCREMENT ,
Name VARCHAR (50) NOT NULL ,
Adress VARCHAR (100) NOT NULL ,
PRIMARY KEY (Oficer_id)
);

SELECT * FROM Oficers;

INSERT INTO Oficers VALUES (1,'Ajeet','Mau'),
(2,'Deepika','Lucknow'),
(3 , 'Vimal','Faizbad'),
(4,'Rahul' ,'Lucknow');

CREATE TABLE Students(
Student_id int NOT NULL AUTO_INCREMENT ,
Name VARCHAR (50) NOT NULL ,
Course VARCHAR (100) NOT NULL ,
PRIMARY KEY (Student_id)
);

SELECT * FROM Students;

INSERT INTO Students  VALUES (1,'Aryan','Java'),
(2,'Rohini','Haddop'),
(3 , 'Lallu','MongoDP');

SELECT Oficers.Name , Oficers.Adress ,Students.Course 
FROM Oficers 
INNER JOIN Students 
on Oficers.oficer_id = Students.Student_id ;


SELECT Oficers.Name , Oficers.Adress ,Students.Course 
FROM  Oficers 
LEFT JOIN Students 
on Oficers.oficer_id = Students.Student_id ;

SELECT Oficers.Name , Oficers.Adress ,Students.Course ,Students.Name 
FROM  Oficers 
RIGHT JOIN Students 
on Oficers.oficer_id = Students.Student_id ;



CREATE TABLE emp(
id int NOT NULL AUTO_INCREMENT, 
name varchar(50) NOT NULL,
age int NOT NULL ,
PRIMARY KEY (id)
);


