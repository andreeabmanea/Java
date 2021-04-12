DROP TABLE movies CASCADE CONSTRAINTS;

DROP TABLE genres CASCADE CONSTRAINTS;

DROP TABLE guide CASCADE CONSTRAINTS;

CREATE TABLE movies (
	id INT PRIMARY KEY,
        title VARCHAR2(64) NOT NULL, 
        release_date DATE,
	duration INT,
	score DOUBLE(5,4)
);

CREATE TABLE genres (
	id INT PRIMARY KEY,
        name VARCHAR2(25)
);

CREATE TABLE guide (
	id_movie INT NOT NULL,
	id_genre INT NOT NULL,
	CONSTRAINT fk_id_movie FOREIGN KEY(id_movie) REFERENCES movies(id),
	CONSTRAINT fk_id_genre FOREIGN KEY(id_genre) REFERENCES genres(id)
	CONSTRAINT uni UNIQUE(id_movie, id_genre) 
);
