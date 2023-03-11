create table car (
    id serial primary key,
    brand varchar,
    model varchar,
    engine varchar,
    production varchar,
    body_type varchar,
    seats int,
    doors int,
    speed int,
    amount int,
    status int
);

create table customer (
    id serial primary key,
    name varchar,
    surname varchar,
    birthdate date,
    fin varchar,
    serial_number varchar,
    car_id int,

    foreign key (car_id) references car
);
