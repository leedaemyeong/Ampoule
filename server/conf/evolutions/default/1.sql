# --- !Ups

create table user (userID VARCHAR(255) NOT NULL PRIMARY KEY,
                   firstName VARCHAR(255),lastName VARCHAR(255),
                   fullName VARCHAR(255),
                   email VARCHAR(255),
                   avatarURL VARCHAR(255),
                   activated Boolean);
create table logininfo (id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                        providerID VARCHAR(255) NOT NULL,providerKey VARCHAR(255) NOT NULL);
create table userlogininfo (userID VARCHAR(255) NOT NULL,loginInfoId BIGINT NOT NULL);
create table passwordinfo (hasher VARCHAR(255) NOT NULL,password VARCHAR(255) NOT NULL,
                           salt VARCHAR(255),loginInfoId BIGINT NOT NULL);
create table oauth1info (id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                         token VARCHAR(255) NOT NULL,secret VARCHAR(255) NOT NULL,loginInfoId BIGINT NOT NULL);
create table oauth2info (id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                         accesstoken VARCHAR(255) NOT NULL,tokentype VARCHAR(255),
                         expiresin INTEGER,refreshtoken VARCHAR(255),logininfoid BIGINT NOT NULL);
create table openidinfo (id VARCHAR(255) NOT NULL PRIMARY KEY,logininfoid BIGINT NOT NULL);
create table openidattributes (id VARCHAR(255) NOT NULL,openidKey VARCHAR(255) NOT NULL,openidValue VARCHAR(255) NOT NULL);


# --- !Downs

drop table openidattributes;
drop table openidinfo;
drop table oauth2info;
drop table oauth1info;
drop table passwordinfo;
drop table userlogininfo;
drop table logininfo;
drop table user;