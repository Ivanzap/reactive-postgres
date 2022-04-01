CREATE TABLE IF NOT EXISTS person
(
    id serial PRIMARY KEY,
    name text
);

INSERT INTO person (name)
VALUES ('Person1'),
       ('Person2'),
       ('Person3')
