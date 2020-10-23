drop table if exists USER;

CREATE TABLE USER (
  cod INT NOT NULL,
  full_name VARCHAR(45) NULL,
  height DECIMAL(18, 2) NULL,
  active INT NULL,
  PRIMARY KEY (cod)
);

INSERT INTO USER (cod, full_name, height, active)
VALUES (1, 'Gaspar', 1.85, 1),
       (2, 'Elton', null, 1),
       (3, 'Lucini', null, 1),
       (4, 'Diogo', 1.73, 1),
       (5, 'Daniel', null, 1),
       (6, 'Marcos', null, 1),
       (7, 'Fernanda', null, 1),
       (8, 'Maicon', null, 1),
       (9, 'Rafael', null, 0),
       (10, 'Felix', 1.83, 1);