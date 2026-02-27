CREATE TABLE flexi (
    id SERIAL PRIMARY KEY,
    firstname VARCHAR(100),
    lastname VARCHAR(100),
    address TEXT,
    occupation VARCHAR(100),
    date DATE
);

INSERT INTO flexi (firstname, lastname, address, occupation, date)
VALUES ('Jane', 'Doe', '100 Tech Lane', 'Developer', '2026-02-27');

UPDATE flexi
SET occupation = 'Lead Developer'
WHERE id = 1;

DELETE FROM flexi
WHERE id = 1;
