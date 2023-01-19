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
