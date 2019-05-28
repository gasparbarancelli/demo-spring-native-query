drop table if exists USER;

CREATE TABLE USER (
  cod INT NOT NULL,
  full_name VARCHAR(45) NULL,
  active INT NULL,
  PRIMARY KEY (cod)
);

INSERT INTO USER (cod, full_name, active)
VALUES (1, 'Gaspar', 1),
       (2, 'Elton', 1),
       (3, 'Lucini', 1),
       (4, 'Diogo', 1),
       (5, 'Daniel', 1),
       (6, 'Marcos', 1),
       (7, 'Fernanda', 1),
       (8, 'Maicon', 1),
       (9, 'Rafael', 0);