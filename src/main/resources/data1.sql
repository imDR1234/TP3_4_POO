INSERT INTO address (id, creation, content) VALUES (1, CURRENT_TIMESTAMP(), '57 boulevard demorieux');
INSERT INTO address (id, creation, content) VALUES (2, CURRENT_TIMESTAMP(), '51 allee du gamay, 34080 montpellier');

DROP TABLE IF EXISTS address;

CREATE TABLE address (
                         id INT NOT NULL AUTO_INCREMENT,
                         author VARCHAR(255) NOT NULL,
                         creation TIMESTAMP NOT NULL,
                         content VARCHAR(255) NOT NULL,
                         PRIMARY KEY (id)
);

INSERT INTO address (id, author, creation, content)
VALUES (DEFAULT, 'Imane', CURRENT_TIMESTAMP(), '16 Bd Charles nicolle ');
INSERT INTO address (id, author, creation, content)
VALUES (DEFAULT, 'Draoui', CURRENT_TIMESTAMP(), 'Le mans france ');
