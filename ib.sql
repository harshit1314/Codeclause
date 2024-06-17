create database bankmanagementsystem;


show databases;

use bankmanagementsystem;


show tables;

select * from signup;

create table signuptwo( formno varchar(20),religion varchar(20),category varchar(20),income varchar(20),education varchar(20),occupation varchar(20),seniorcit varchar(20),exist varchar(20),pan varchar(20),adhaar varchar(20));

show tables;

select * from signuptwo;
create table signupthree( formno varchar(20),accountType varchar(40),cardNumber varchar(25),pin varchar(4),fascility varchar(100));
create table login(formno varchar(20),cardNumber varchar(25),pin varchar(4));
select * from signupthree;

select * from login;

drop table bank;

create table bank(pin varchar(10),date varchar(50),type varchar(20),amount varchar(20));

select * from bank;


