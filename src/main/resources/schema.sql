--category
create table IF NOT EXISTS Category(
    id serial primary key,
    title varchar(255) not null,
    owner int not null,
    description varchar(255) not null
);

-- product
create table IF NOT EXISTS Product (
    id serial primary key,
    title varchar(255) not null,
    owner int not null,
    price numeric not null ,
    description varchar(255) not null,
    category int not null ,
    foreign key (category) references Category(id)
);

