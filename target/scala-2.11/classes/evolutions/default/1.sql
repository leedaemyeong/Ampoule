# --- !Ups
CREATE TABLE user (
	idx int unsigned not null auto_increment primary key,
	name varchar(128) not null,
	email varchar(128) not null,
	password varchar(128) not null,
	regdate date not null
);

# --- !Downs
DROP TABLE if exists user;

