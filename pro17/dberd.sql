SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS freeboard;
DROP TABLE IF EXISTS t_member;




/* Create Tables */

CREATE TABLE freeboard
(
	articleN0 int NOT NULL AUTO_INCREMENT,
	parentN0 int NOT NULL,
	title varchar(100) NOT NULL,
	content varchar(4000) NOT NULL,
	imageFileName varchar(100),
	writeDate date DEFAULT (current_date) NOT NULL,
	id varchar(10) NOT NULL,
	PRIMARY KEY (articleN0),
	UNIQUE (articleN0)
);


CREATE TABLE t_member
(
	id varchar(10) NOT NULL,
	pwd varchar(10) NOT NULL,
	name varchar(10) NOT NULL,
	email varchar(50) NOT NULL,
	joinDate date DEFAULT (current_date),
	hobby varchar(45),
	PRIMARY KEY (id)
);



/* Create Foreign Keys */

ALTER TABLE freeboard
	ADD FOREIGN KEY (id)
	REFERENCES t_member (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



