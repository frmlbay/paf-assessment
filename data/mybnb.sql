create database mybnb;
use mybnb;

create table acc_occupancy (
	acc_id int(10) not null,
    vacancy int(3),
    constraint acc_id_pk primary key (acc_id)
    );

create table reservations (
	resv_id int(8) not null,
    name char(128),
    email char(128),
    acc_id int(10),
    arrival_date date,
    duration int(3),
    constraint resv_id_pk primary key (resv_id),
    constraint acc_id_fk foreign key (acc_id) references acc_occupancy(acc_id)
);

select * from acc_occupancy;
select * from reservations;