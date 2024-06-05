

create table if not exists post(
    id serial primary key,
    version int,
    title varchar(255) not null,
    content text not null,
    published_on TIMESTAMP not null,
    foreign key (author) references Author(id)
);


create table if not exists author(
    id serial primary key,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    email varchar(255) not null,
    user_name varchar(255) not null
);
