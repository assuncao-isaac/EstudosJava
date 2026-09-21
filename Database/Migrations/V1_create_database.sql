create database anime_store;

use anime_store;

create table producer(
 id INT NOT NULL AUTO_INCREMENT,
 name VARCHAR(255) NOT NULL,
 PRIMARY KEY(id));

create table anime(
 id INT NOT NULL AUTO_INCREMENT,
 name VARCHAR(300) NOT NULL,
 episodes INT NOT NULL,
 producer_id INT NOT NULL,
 PRIMARY KEY(id),
 FOREIGN KEY (producer_id) 
REFERENCES producer(id));