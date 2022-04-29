-- drop database airport;

create database airport;

use airport;

create table passenger
(
	id int auto_increment not null primary key,
    passport varchar(10),
    name varchar(30),
    birth_date date,
    ticket_id int
);

create table tickets
(
	id int auto_increment not null primary key,
    ticket_number int,
    place_number int,
    flight_id int,
    passanger_id int
);

create table flight
(
	id int auto_increment not null primary key,
    depart_time datetime,
	airline_id int,
	route_id int,
    status bool
);

create table route
(
	id int auto_increment not null primary key,
    depart_point varchar(30),
    destanation_point varchar(30)
);

create table airline
(
	id int auto_increment not null primary key,
	rating int,
    airplane_id int
);

create table airplane
(
	id int auto_increment not null primary key,
    name varchar(30)
);

create table teminal
(
	id int auto_increment not null primary key,
    name varchar(30),
    gate int
);

create table employee
(
	id int auto_increment not null primary key,
    salary int,
    name varchar(30),
    position_id int
);

create table employee_position
(
	id int auto_increment not null primary key,
    position_name varchar(30)
);

insert passenger
(passport, name, birth_date, ticket_id)
values
('MD293847', 'Іванов Г.І.', '1986-02-26', 1),
('ЩЛ948576', 'Петров А.Д.', '1987-03-16', 2),
('ИГ234678', 'Петренко В.К.', '1990-02-04', 3),
('ШО849375', 'Іващенко Г.І.', '1982-10-26', 4),
('ДА673854', 'Давиденко К.Н.', '1989-12-09', 5),
('ГО294857', 'Гончарюк Д.Н.', '1995-04-01', 6);

insert tickets
(ticket_number, place_number, flight_id, passanger_id)
values
(1, 10, 1, 1),
(2, 11, 1, 2),
(3, 12, 1, 3),
(4, 10, 2, 2),
(5, 11, 2, 3),
(5, 12, 3, 4);

insert flight
(depart_time, airline_id, route_id, status)
values
('2022-05-20 22:50:00', 1, 1, true),
('2022-06-15 15:30:00', 2, 2, true),
('2022-07-04 15:30:00', 3, 3, true);

insert route
(depart_point, destanation_point)
values
('Kyiv', 'London'),
('Kyiv', 'Berlin'),
('Kyiv', 'Rome'),
('Kyiv', 'Bern');

insert into airline
(rating, airplane_id)
values
(4, 1),
(5, 2),
(3, 3);

insert airplane
(name)
values
('Boing737'),
('Boing747'),
('An26'),
('An226'),
('An178');

insert teminal
(name, gate)
values
('Terminal A', 1),
('Terminal B', 2),
('Terminal C', 3),
('Terminal D', 4);

insert employee
(salary, name, position_id)
values
(500, 'Петров Г.І.', 3),
(400, 'Осляк В.Д.', 2),
(1000, 'Трофімчук К.М.', 1),
(800, 'Щур К.С.', 4);

insert employee_position
(position_name)
values
('Security'),
('Janitor'),
('Baggage carrier'),
('Registration worker');
