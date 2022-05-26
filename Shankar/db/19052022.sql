CREATE TABLE Employee(  
    empid int NOT NULL AUTO_INCREMENT,  
    empname varchar(45) NOT NULL,  
    empsalary int NOT NULL,  
    PRIMARY KEY (empid)  
); 

CREATE TABLE  Account(
    ac_no int NOT NULL AUTO_INCREMENT ,
    name varchar (50) NOT NULL,
    balance int NOT NULL ,
    PRIMARY KEY (ac_no)
);
ALTER  TABLE Account 
Drop column balance ;


ALTER  TABLE Account 

Add column balance int NOT NULL ;

    ALTER TABLE Account  
    MODIFY balance int not NULL After ac_no;  