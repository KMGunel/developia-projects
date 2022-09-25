package sql;

public class SqlRepeat {
	/*
	 
mysql> create database `my-db`;
Query OK, 1 row affected (0.05 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| baza1              |
| information_schema |
| java5-test         |
| my-db              |
| mysql              |
| mysqlfile          |
| performance_schema |
| sakila             |
| sys                |
| world              |
+--------------------+
10 rows in set (0.00 sec)

mysql> show tables;
ERROR 1046 (3D000): No database selected
mysql> use my-db;
Database changed
mysql> show tables;
Empty set (0.04 sec)

mysql> create table books (id int,name text);
Query OK, 0 rows affected (0.15 sec)

mysql> show tables;
+-----------------+
| Tables_in_my-db |
+-----------------+
| books           |
+-----------------+
1 row in set (0.00 sec)

mysql> select id * from books;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'from books' at line 1
mysql> select id from books;
Empty set (0.01 sec)

mysql> select * from books;
Empty set (0.00 sec)

mysql> insert into books (id,name) values (1,'Java 18');
Query OK, 1 row affected (0.02 sec)

mysql> select * from books;
+------+---------+
| id   | name    |
+------+---------+
|    1 | Java 18 |
+------+---------+
1 row in set (0.00 sec)

mysql> insert into books (id) values (2);
Query OK, 1 row affected (0.01 sec)

mysql> select * from books;
+------+---------+
| id   | name    |
+------+---------+
|    1 | Java 18 |
|    2 | NULL    |
+------+---------+
2 rows in set (0.00 sec)

mysql> update books set name='HTML-5' where id=2;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from books;
+------+---------+
| id   | name    |
+------+---------+
|    1 | Java 18 |
|    2 | HTML-5  |
+------+---------+
2 rows in set (0.00 sec)

mysql> update books set id=5,name='Python' where id=2;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from books;
+------+---------+
| id   | name    |
+------+---------+
|    1 | Java 18 |
|    5 | Python  |
+------+---------+
2 rows in set (0.00 sec)

mysql> delete from books where id=5;
Query OK, 1 row affected (0.01 sec)

mysql> select * from books;
+------+---------+
| id   | name    |
+------+---------+
|    1 | Java 18 |
+------+---------+
1 row in set (0.00 sec)

mysql> insert into books (id,name) values (2,'HTML-5');
Query OK, 1 row affected (0.01 sec)

mysql> insert into books (id,name) values (3,'Python');
Query OK, 1 row affected (0.00 sec)

mysql> delete from books where id>1;
Query OK, 2 rows affected (0.01 sec)

mysql> select * from books;
+------+---------+
| id   | name    |
+------+---------+
|    1 | Java 18 |
+------+---------+
1 row in set (0.00 sec)

mysql> update books set name='HTML-5' where id=2;
Query OK, 0 rows affected (0.00 sec)
Rows matched: 0  Changed: 0  Warnings: 0

mysql> insert into books (id,name) values (2,'HTML-5');
Query OK, 1 row affected (0.00 sec)

mysql> insert into books (id,name) values (3,'Python');
Query OK, 1 row affected (0.01 sec)

mysql> select * from books;
+------+---------+
| id   | name    |
+------+---------+
|    1 | Java 18 |
|    2 | HTML-5  |
|    3 | Python  |
+------+---------+
3 rows in set (0.00 sec)

mysql> delete from books;
Query OK, 3 rows affected (0.01 sec)

mysql> select * from books;
Empty set (0.00 sec)

mysql> drop table books;
Query OK, 0 rows affected (0.04 sec)

mysql> select * from books;
ERROR 1146 (42S02): Table 'my-db.books' doesn't exist
mysql> show tables;
Empty set (0.00 sec)

mysql> create table books (id int,name text);
Query OK, 0 rows affected (0.04 sec)

mysql> insert into books(id,name) values (1,'JAva-17'),(2,'HTML-5'),(3,'Css'),(4,'Python'),(5,'Oracle');
Query OK, 5 rows affected (0.01 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> select * from books;
+------+---------+
| id   | name    |
+------+---------+
|    1 | JAva-17 |
|    2 | HTML-5  |
|    3 | Css     |
|    4 | Python  |
|    5 | Oracle  |
+------+---------+
5 rows in set (0.00 sec)

mysql> alter table books add column price int;
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from books;
+------+---------+-------+
| id   | name    | price |
+------+---------+-------+
|    1 | JAva-17 |  NULL |
|    2 | HTML-5  |  NULL |
|    3 | Css     |  NULL |
|    4 | Python  |  NULL |
|    5 | Oracle  |  NULL |
+------+---------+-------+
5 rows in set (0.00 sec)

mysql> update books set price=20;
Query OK, 5 rows affected (0.01 sec)
Rows matched: 5  Changed: 5  Warnings: 0

mysql> select * from books;
+------+---------+-------+
| id   | name    | price |
+------+---------+-------+
|    1 | JAva-17 |    20 |
|    2 | HTML-5  |    20 |
|    3 | Css     |    20 |
|    4 | Python  |    20 |
|    5 | Oracle  |    20 |
+------+---------+-------+
5 rows in set (0.00 sec)

mysql> alter table books change id code int;
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from books;
+------+---------+-------+
| code | name    | price |
+------+---------+-------+
|    1 | JAva-17 |    20 |
|    2 | HTML-5  |    20 |
|    3 | Css     |    20 |
|    4 | Python  |    20 |
|    5 | Oracle  |    20 |
+------+---------+-------+
5 rows in set (0.00 sec)

mysql> alter table books modify column price double;
Query OK, 5 rows affected (0.08 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> select * from books;
+------+---------+-------+
| code | name    | price |
+------+---------+-------+
|    1 | JAva-17 |    20 |
|    2 | HTML-5  |    20 |
|    3 | Css     |    20 |
|    4 | Python  |    20 |
|    5 | Oracle  |    20 |
+------+---------+-------+
5 rows in set (0.00 sec)

mysql> desc books;
+-------+--------+------+-----+---------+-------+
| Field | Type   | Null | Key | Default | Extra |
+-------+--------+------+-----+---------+-------+
| code  | int    | YES  |     | NULL    |       |
| name  | text   | YES  |     | NULL    |       |
| price | double | YES  |     | NULL    |       |
+-------+--------+------+-----+---------+-------+
3 rows in set (0.01 sec)

mysql> alter table books drop column price;
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from books;
+------+---------+
| code | name    |
+------+---------+
|    1 | JAva-17 |
|    2 | HTML-5  |
|    3 | Css     |
|    4 | Python  |
|    5 | Oracle  |
+------+---------+
5 rows in set (0.00 sec)

mysql> alter table books rename to my-books;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '-books' at line 1
mysql> alter table books rename to mybooks;
Query OK, 0 rows affected (0.02 sec)

mysql> select * from books;
ERROR 1146 (42S02): Table 'my-db.books' doesn't exist
mysql> select * from mybooks;
+------+---------+
| code | name    |
+------+---------+
|    1 | JAva-17 |
|    2 | HTML-5  |
|    3 | Css     |
|    4 | Python  |
|    5 | Oracle  |
+------+---------+
5 rows in set (0.00 sec)

| id    | int  | NO   | PRI | NULL    | auto_increment |
| name  | text | YES  |     | NULL    |                |
+-------+------+------+-----+---------+----------------+
2 rows in set (0.00 sec)

mysql> insert into books (name) values
    -> ('CSS'),
    -> ('Python')
    -> ;
Query OK, 2 rows affected (0.58 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> select * from books;
+----+---------+
| id | name    |
+----+---------+
|  1 | JAva-17 |
|  2 | HTML-5  |
|  3 | Css     |
|  4 | Python  |
|  5 | Oracle  |
|  6 | CSS     |
|  7 | Python  |
+----+---------+
7 rows in set (0.00 sec)

mysql> delete from books where id=3;
Query OK, 1 row affected (0.01 sec)

mysql> select * from books;
+----+---------+
| id | name    |
+----+---------+
|  1 | JAva-17 |
|  2 | HTML-5  |
|  4 | Python  |
|  5 | Oracle  |
|  6 | CSS     |
|  7 | Python  |
+----+---------+
6 rows in set (0.00 sec)

mysql> alter table books modify column name text not null;
Query OK, 0 rows affected (0.11 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc books;
+-------+------+------+-----+---------+----------------+
| Field | Type | Null | Key | Default | Extra          |
+-------+------+------+-----+---------+----------------+
| id    | int  | NO   | PRI | NULL    | auto_increment |
| name  | text | NO   |     | NULL    |                |
+-------+------+------+-----+---------+----------------+
2 rows in set (0.00 sec)

mysql> alter table books add column price double;
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc books;
+-------+--------+------+-----+---------+----------------+
| Field | Type   | Null | Key | Default | Extra          |
+-------+--------+------+-----+---------+----------------+
| id    | int    | NO   | PRI | NULL    | auto_increment |
| name  | text   | NO   |     | NULL    |                |
| price | double | YES  |     | NULL    |                |
+-------+--------+------+-----+---------+----------------+
3 rows in set (0.00 sec)

mysql> update books set price=15;
Query OK, 6 rows affected (0.01 sec)
Rows matched: 6  Changed: 6  Warnings: 0

mysql> select * from books;
+----+---------+-------+
| id | name    | price |
+----+---------+-------+
|  1 | JAva-17 |    15 |
|  2 | HTML-5  |    15 |
|  4 | Python  |    15 |
|  5 | Oracle  |    15 |
|  6 | CSS     |    15 |
|  7 | Python  |    15 |
+----+---------+-------+
6 rows in set (0.00 sec)

mysql> insert into books (price) values (20);
ERROR 1364 (HY000): Field 'name' doesn't have a default value
mysql> insert into books (name) values ('Java 17');
Query OK, 1 row affected (0.01 sec)

mysql> select * from books;
+----+---------+-------+
| id | name    | price |
+----+---------+-------+
|  1 | JAva-17 |    15 |
|  2 | HTML-5  |    15 |
|  4 | Python  |    15 |
|  5 | Oracle  |    15 |
|  6 | CSS     |    15 |
|  7 | Python  |    15 |
|  8 | Java 17 |  NULL |
+----+---------+-------+
7 rows in set (0.00 sec)

mysql> alter table books modify column price decimal(10.1);
Query OK, 7 rows affected (0.08 sec)
Records: 7  Duplicates: 0  Warnings: 0

mysql> update books set price=25.65487;
Query OK, 7 rows affected, 7 warnings (0.01 sec)
Rows matched: 7  Changed: 7  Warnings: 7

mysql> select*from books;
+----+---------+-------+
| id | name    | price |
+----+---------+-------+
|  1 | JAva-17 |    26 |
|  2 | HTML-5  |    26 |
|  4 | Python  |    26 |
|  5 | Oracle  |    26 |
|  6 | CSS     |    26 |
|  7 | Python  |    26 |
|  8 | Java 17 |    26 |
+----+---------+-------+
7 rows in set (0.00 sec)

mysql> alter table books modify column price decimal(10.2);
Query OK, 0 rows affected (0.01 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select*from books;
+----+---------+-------+
| id | name    | price |
+----+---------+-------+
|  1 | JAva-17 |    26 |
|  2 | HTML-5  |    26 |
|  4 | Python  |    26 |
|  5 | Oracle  |    26 |
|  6 | CSS     |    26 |
|  7 | Python  |    26 |
|  8 | Java 17 |    26 |
+----+---------+-------+
7 rows in set (0.00 sec)

mysql> update books set price=25.65487;
Query OK, 0 rows affected, 7 warnings (0.00 sec)
Rows matched: 7  Changed: 0  Warnings: 7

mysql> select * from books;
+----+---------+-------+
| id | name    | price |
+----+---------+-------+
|  1 | JAva-17 |    26 |
|  2 | HTML-5  |    26 |
|  4 | Python  |    26 |
|  5 | Oracle  |    26 |
|  6 | CSS     |    26 |
|  7 | Python  |    26 |
|  8 | Java 17 |    26 |
+----+---------+-------+
7 rows in set (0.00 sec)

mysql> alter table books modify column price double;
Query OK, 7 rows affected (0.08 sec)
Records: 7  Duplicates: 0  Warnings: 0

mysql> update books set price=25.65487;
Query OK, 7 rows affected (0.01 sec)
Rows matched: 7  Changed: 7  Warnings: 0

mysql> select*from books;
+----+---------+----------+
| id | name    | price    |
+----+---------+----------+
|  1 | JAva-17 | 25.65487 |
|  2 | HTML-5  | 25.65487 |
|  4 | Python  | 25.65487 |
|  5 | Oracle  | 25.65487 |
|  6 | CSS     | 25.65487 |
|  7 | Python  | 25.65487 |
|  8 | Java 17 | 25.65487 |
+----+---------+----------+
7 rows in set (0.00 sec)

mysql> alter table books modify column price decimal(10.2);
Query OK, 7 rows affected, 7 warnings (0.08 sec)
Records: 7  Duplicates: 0  Warnings: 7

mysql> select*from books;
+----+---------+-------+
| id | name    | price |
+----+---------+-------+
|  1 | JAva-17 |    26 |
|  2 | HTML-5  |    26 |
|  4 | Python  |    26 |
|  5 | Oracle  |    26 |
|  6 | CSS     |    26 |
|  7 | Python  |    26 |
|  8 | Java 17 |    26 |
+----+---------+-------+
7 rows in set (0.00 sec)

mysql> update books set price=25.65487;
Query OK, 0 rows affected, 7 warnings (0.00 sec)
Rows matched: 7  Changed: 0  Warnings: 7

mysql> select * from books;
+----+---------+-------+
| id | name    | price |
+----+---------+-------+
|  1 | JAva-17 |    26 |
|  2 | HTML-5  |    26 |
|  4 | Python  |    26 |
|  5 | Oracle  |    26 |
|  6 | CSS     |    26 |
|  7 | Python  |    26 |
|  8 | Java 17 |    26 |
+----+---------+-------+
7 rows in set (0.00 sec)

mysql> alter table books modify column price decimal(10,2);
Query OK, 7 rows affected (0.08 sec)
Records: 7  Duplicates: 0  Warnings: 0

mysql> select * from books;
+----+---------+-------+
| id | name    | price |
+----+---------+-------+
|  1 | JAva-17 | 26.00 |
|  2 | HTML-5  | 26.00 |
|  4 | Python  | 26.00 |
|  5 | Oracle  | 26.00 |
|  6 | CSS     | 26.00 |
|  7 | Python  | 26.00 |
|  8 | Java 17 | 26.00 |
+----+---------+-------+
7 rows in set (0.00 sec)

mysql> update books set price=25.65487;
Query OK, 7 rows affected, 7 warnings (0.01 sec)
Rows matched: 7  Changed: 7  Warnings: 7

mysql> select*from books;
+----+---------+-------+
| id | name    | price |
+----+---------+-------+
|  1 | JAva-17 | 25.65 |
|  2 | HTML-5  | 25.65 |
|  4 | Python  | 25.65 |
|  5 | Oracle  | 25.65 |
|  6 | CSS     | 25.65 |
|  7 | Python  | 25.65 |
|  8 | Java 17 | 25.65 |
+----+---------+-------+
7 rows in set (0.00 sec)

mysql> alter table books modify column price decimal(10,2);
Query OK, 0 rows affected (0.01 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select*from books;
+----+---------+-------+
| id | name    | price |
+----+---------+-------+
|  1 | JAva-17 | 25.65 |
|  2 | HTML-5  | 25.65 |
|  4 | Python  | 25.65 |
|  5 | Oracle  | 25.65 |
|  6 | CSS     | 25.65 |
|  7 | Python  | 25.65 |
|  8 | Java 17 | 25.65 |
+----+---------+-------+
7 rows in set (0.00 sec)

mysql> desc books;
+-------+---------------+------+-----+---------+----------------+
| Field | Type          | Null | Key | Default | Extra          |
+-------+---------------+------+-----+---------+----------------+
| id    | int           | NO   | PRI | NULL    | auto_increment |
| name  | text          | NO   |     | NULL    |                |
| price | decimal(10,2) | YES  |     | NULL    |                |
+-------+---------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)

mysql> alter table books modify column name varchar(30) not null;
Query OK, 7 rows affected (0.14 sec)
Records: 7  Duplicates: 0  Warnings: 0

mysql> desc books;
+-------+---------------+------+-----+---------+----------------+
| Field | Type          | Null | Key | Default | Extra          |
+-------+---------------+------+-----+---------+----------------+
| id    | int           | NO   | PRI | NULL    | auto_increment |
| name  | varchar(30)   | NO   |     | NULL    |                |
| price | decimal(10,2) | YES  |     | NULL    |                |
+-------+---------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)

Your MySQL connection id is 25
Server version: 8.0.29 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use my-db;
Database changed
mysql> desc books;
+-------+---------------+------+-----+---------+----------------+
| Field | Type          | Null | Key | Default | Extra          |
+-------+---------------+------+-----+---------+----------------+
| id    | int           | NO   | PRI | NULL    | auto_increment |
| name  | varchar(30)   | NO   |     | NULL    |                |
| price | decimal(10,2) | YES  |     | NULL    |                |
+-------+---------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)

mysql> alter table books add column publish_date date;
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc books;
+--------------+---------------+------+-----+---------+----------------+
| Field        | Type          | Null | Key | Default | Extra          |
+--------------+---------------+------+-----+---------+----------------+
| id           | int           | NO   | PRI | NULL    | auto_increment |
| name         | varchar(30)   | NO   |     | NULL    |                |
| price        | decimal(10,2) | YES  |     | NULL    |                |
| publish_date | date          | YES  |     | NULL    |                |
+--------------+---------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

mysql> insert into books (name,price,publish_date) values ('Vue',12.6845,'2020-04-14');
Query OK, 1 row affected, 1 warning (0.01 sec)

mysql> select*from books;
+----+---------+-------+--------------+
| id | name    | price | publish_date |
+----+---------+-------+--------------+
|  1 | JAva-17 | 25.65 | NULL         |
|  2 | HTML-5  | 25.65 | NULL         |
|  4 | Python  | 25.65 | NULL         |
|  5 | Oracle  | 25.65 | NULL         |
|  6 | CSS     | 25.65 | NULL         |
|  7 | Python  | 25.65 | NULL         |
|  8 | Java 17 | 25.65 | NULL         |
|  9 | Vue     | 12.68 | 2020-04-14   |
+----+---------+-------+--------------+
8 rows in set (0.00 sec)

mysql> update books set publish_date='2018-05-23' where id =5;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from books where publish_date > '01.01.2019';
+----+--------+-------+--------------+
| id | name   | price | publish_date |
+----+--------+-------+--------------+
|  5 | Oracle | 25.65 | 2018-05-23   |
|  9 | Vue    | 12.68 | 2020-04-14   |
+----+--------+-------+--------------+
2 rows in set, 1 warning (0.01 sec)

mysql> select * from books where publish_date > '2019-01-01';
+----+------+-------+--------------+
| id | name | price | publish_date |
+----+------+-------+--------------+
|  9 | Vue  | 12.68 | 2020-04-14   |
+----+------+-------+--------------+
1 row in set (0.00 sec)

mysql> alter table books add column register_date datetime;
Query OK, 0 rows affected (0.04 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> update books set register_date = '2020-05-07 11:29:37';
Query OK, 8 rows affected (0.01 sec)
Rows matched: 8  Changed: 8  Warnings: 0

mysql> select*from books;
+----+---------+-------+--------------+---------------------+
| id | name    | price | publish_date | register_date       |
+----+---------+-------+--------------+---------------------+
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |
|  7 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |
+----+---------+-------+--------------+---------------------+
8 rows in set (0.00 sec)

mysql> alter table books add column is_new boolean;
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> update books set is_new = true where id=4;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select*from books;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  7 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
8 rows in set (0.00 sec)

mysql> update books set is_new=false where id=7;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select*from books;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  7 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      0 |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
8 rows in set (0.00 sec)

mysql> select name from books;
+---------+
| name    |
+---------+
| JAva-17 |
| HTML-5  |
| Python  |
| Oracle  |
| CSS     |
| Python  |
| Java 17 |
| Vue     |
+---------+
8 rows in set (0.00 sec)

mysql> select distinct name from books;
+---------+
| name    |
+---------+
| JAva-17 |
| HTML-5  |
| Python  |
| Oracle  |
| CSS     |
| Java 17 |
| Vue     |
+---------+
7 rows in set (0.00 sec)

mysql> select distict register_date from books;
ERROR 1054 (42S22): Unknown column 'distict' in 'field list'
mysql> select distinct register_date from books;
+---------------------+
| register_date       |
+---------------------+
| 2020-05-07 11:29:37 |
+---------------------+
1 row in set (0.00 sec)

mysql> select * from books;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  7 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      0 |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
8 rows in set (0.00 sec)

mysql> select * from books where id=3;
Empty set (0.00 sec)

mysql> select *from books where id=6;
+----+------+-------+--------------+---------------------+--------+
| id | name | price | publish_date | register_date       | is_new |
+----+------+-------+--------------+---------------------+--------+
|  6 | CSS  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
+----+------+-------+--------------+---------------------+--------+
1 row in set (0.00 sec)

mysql> select * from books where id >=4;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  7 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      0 |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
6 rows in set (0.00 sec)

mysql> select*from books where name!='Css';
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  7 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      0 |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
7 rows in set (0.00 sec)

mysql> select *from books where id<>4;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  7 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      0 |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
7 rows in set (0.00 sec)

mysql> select *from books where id=6;
+----+------+-------+--------------+---------------------+--------+
| id | name | price | publish_date | register_date       | is_new |
+----+------+-------+--------------+---------------------+--------+
|  6 | CSS  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
+----+------+-------+--------------+---------------------+--------+
1 row in set (0.00 sec)

mysql> select *from books where id=6 and name='css';
+----+------+-------+--------------+---------------------+--------+
| id | name | price | publish_date | register_date       | is_new |
+----+------+-------+--------------+---------------------+--------+
|  6 | CSS  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
+----+------+-------+--------------+---------------------+--------+
1 row in set (0.00 sec)

mysql> show *from books where name='Java 17' or price = 12.68;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '*from books where name='Java 17' or price = 12.68' at line 1
mysql> select *from books where name='Java 17' or price = 12.68;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
2 rows in set (0.00 sec)

mysql> select *from books where publish_date is null;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  7 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      0 |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
6 rows in set (0.00 sec)

mysql> select *from books where publish_date is not null;
+----+--------+-------+--------------+---------------------+--------+
| id | name   | price | publish_date | register_date       | is_new |
+----+--------+-------+--------------+---------------------+--------+
|  5 | Oracle | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  9 | Vue    | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
+----+--------+-------+--------------+---------------------+--------+
2 rows in set (0.00 sec)

Enter password: ******
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 26
Server version: 8.0.29 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use my-db;
Database changed
mysql> select*from books;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  7 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      0 |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
8 rows in set (0.00 sec)

mysql> select*from books order by name;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
|  7 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      0 |
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
8 rows in set (0.00 sec)

mysql> select*from books order by name desc;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
|  7 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      0 |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
8 rows in set (0.00 sec)

mysql> select*from books order by price;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  7 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      0 |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
8 rows in set (0.00 sec)

mysql> select*from books order by publish_date;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  7 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      0 |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
8 rows in set (0.00 sec)

mysql> select*from books order by name ,price;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
|  7 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      0 |
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
8 rows in set (0.00 sec)

mysql> select*from books order by name ,price desc;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
|  7 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      0 |
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
8 rows in set (0.00 sec)

mysql> update books set price =20 where id=7;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select*from books order by name ,price desc;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
|  7 | Python  | 20.00 | NULL         | 2020-05-07 11:29:37 |      0 |
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
8 rows in set (0.00 sec)

mysql> select*from books order by name ,price;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  7 | Python  | 20.00 | NULL         | 2020-05-07 11:29:37 |      0 |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
8 rows in set (0.00 sec)

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use my-db;
Database changed
mysql> select*from books;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  7 | Python  | 20.00 | NULL         | 2020-05-07 11:29:37 |      0 |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  9 | Vue     | 12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
8 rows in set (0.01 sec)

mysql> select*from books limit 0,3;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
+----+---------+-------+--------------+---------------------+--------+
3 rows in set (0.00 sec)

mysql> select*from books limit 4,2;
+----+--------+-------+--------------+---------------------+--------+
| id | name   | price | publish_date | register_date       | is_new |
+----+--------+-------+--------------+---------------------+--------+
|  6 | CSS    | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  7 | Python | 20.00 | NULL         | 2020-05-07 11:29:37 |      0 |
+----+--------+-------+--------------+---------------------+--------+
2 rows in set (0.00 sec)

mysql> select*from books where publish_date is null limit 0,3;
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 25.65 | NULL         | 2020-05-07 11:29:37 |      1 |
+----+---------+-------+--------------+---------------------+--------+
3 rows in set (0.00 sec)

mysql> select min(price) from books;
+------------+
| min(price) |
+------------+
|      12.68 |
+------------+
1 row in set (0.01 sec)

mysql> select min(price) as minimum_qiymet from books;
+----------------+
| minimum_qiymet |
+----------------+
|          12.68 |
+----------------+
1 row in set (0.00 sec)

mysql> select min(price) as minimum_qiymet from books;
+----------------+
| minimum_qiymet |
+----------------+
|          12.68 |
+----------------+
1 row in set (0.00 sec)

mysql> select min(publish_date) as minimum_qiymet from books;
+----------------+
| minimum_qiymet |
+----------------+
| 2018-05-23     |
+----------------+
1 row in set (0.00 sec)

mysql> select max(price) as maksimum_qiymet from books;
+-----------------+
| maksimum_qiymet |
+-----------------+
|           25.65 |
+-----------------+
1 row in set (0.00 sec)

mysql> update books set price=100 where id = 4;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select max(price) as maksimum_qiymet from books;
+-----------------+
| maksimum_qiymet |
+-----------------+
|          100.00 |
+-----------------+
1 row in set (0.00 sec)

mysql> select count(*) from books;
+----------+
| count(*) |
+----------+
|        8 |
+----------+
1 row in set (0.01 sec)

mysql> select count(id) from books;
+-----------+
| count(id) |
+-----------+
|         8 |
+-----------+
1 row in set (0.00 sec)

mysql> select count(publish_date) from books;
+---------------------+
| count(publish_date) |
+---------------------+
|                   2 |
+---------------------+
1 row in set (0.00 sec)

mysql> select count (*) from books where publish_date is nor null;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '*) from books where publish_date is nor null' at line 1
mysql> select count (*) from books where publish_date is not null;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '*) from books where publish_date is not null' at line 1
mysql> select count(*) from books where publish_date is not null;
+----------+
| count(*) |
+----------+
|        2 |
+----------+
1 row in set (0.00 sec)

mysql> select count (*) from books where publish_date is not null;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '*) from books where publish_date is not null' at line 1
mysql> select count(*) from books where publish_date is not null;
+----------+
| count(*) |
+----------+
|        2 |
+----------+
1 row in set (0.00 sec)

mysql> select avg(price) from books;
+------------+
| avg(price) |
+------------+
|  32.616250 |
+------------+
1 row in set (0.00 sec)

mysql> select avg(publish_date) from books;
+-------------------+
| avg(publish_date) |
+-------------------+
|     20190468.5000 |
+-------------------+
1 row in set (0.00 sec)

mysql> select avg(id) from books;
+---------+
| avg(id) |
+---------+
|  5.2500 |
+---------+
1 row in set (0.00 sec)

mysql> select avg(price) from books where id>4;
+------------+
| avg(price) |
+------------+
|  21.926000 |
+------------+
1 row in set (0.00 sec)

mysql> select avg(price) from books where id in(2,3);
+------------+
| avg(price) |
+------------+
|  25.650000 |
+------------+
1 row in set (0.00 sec)

mysql> select avg(price) from books where id in(2,4);
+------------+
| avg(price) |
+------------+
|  62.825000 |
+------------+
1 row in set (0.00 sec)

mysql> select sum(price) from books;
+------------+
| sum(price) |
+------------+
|     260.93 |
+------------+
1 row in set (0.00 sec)

mysql> select sum(price) from books where id in(2,3);
+------------+
| sum(price) |
+------------+
|      25.65 |
+------------+
1 row in set (0.00 sec)

mysql> select sum(price) from books where id>=4;
+------------+
| sum(price) |
+------------+
|     209.63 |
+------------+
1 row in set (0.00 sec)

mysql> select sum(price) as cemi from books where id>=4;
+--------+
| cemi   |
+--------+
| 209.63 |
+--------+
1 row in set (0.00 sec)

mysql> select * from books where name like '%n';
+----+--------+--------+--------------+---------------------+--------+
| id | name   | price  | publish_date | register_date       | is_new |
+----+--------+--------+--------------+---------------------+--------+
|  4 | Python | 100.00 | NULL         | 2020-05-07 11:29:37 |      1 |
|  7 | Python |  20.00 | NULL         | 2020-05-07 11:29:37 |      0 |
+----+--------+--------+--------------+---------------------+--------+
2 rows in set (0.00 sec)

mysql> select * from books where name like '%n%';
+----+--------+--------+--------------+---------------------+--------+
| id | name   | price  | publish_date | register_date       | is_new |
+----+--------+--------+--------------+---------------------+--------+
|  4 | Python | 100.00 | NULL         | 2020-05-07 11:29:37 |      1 |
|  7 | Python |  20.00 | NULL         | 2020-05-07 11:29:37 |      0 |
+----+--------+--------+--------------+---------------------+--------+
2 rows in set (0.00 sec)

mysql> select * from books where name like '%a%';
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  5 | Oracle  | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
3 rows in set (0.00 sec)

mysql> select * from books where name like 'j%';
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  1 | JAva-17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
2 rows in set (0.00 sec)

mysql> select * from books where name like 'j';
Empty set (0.00 sec)

mysql> select * from books where name like '--a%';
Empty set (0.00 sec)

mysql> select * from books where name like '__a%';
+----+--------+-------+--------------+---------------------+--------+
| id | name   | price | publish_date | register_date       | is_new |
+----+--------+-------+--------------+---------------------+--------+
|  5 | Oracle | 25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
+----+--------+-------+--------------+---------------------+--------+
1 row in set (0.00 sec)

mysql> select * from books where name like '__V_';
Empty set (0.00 sec)

mysql> select * from books where name like '__s';
+----+------+-------+--------------+---------------------+--------+
| id | name | price | publish_date | register_date       | is_new |
+----+------+-------+--------------+---------------------+--------+
|  6 | CSS  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
+----+------+-------+--------------+---------------------+--------+
1 row in set (0.00 sec)

mysql> select * from books where name like '%s';
+----+------+-------+--------------+---------------------+--------+
| id | name | price | publish_date | register_date       | is_new |
+----+------+-------+--------------+---------------------+--------+
|  6 | CSS  | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
+----+------+-------+--------------+---------------------+--------+
1 row in set (0.00 sec)

mysql>Enter password: ******
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 28
Server version: 8.0.29 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use my-db;
Database changed
mysql> select*from books;
+----+---------+--------+--------------+---------------------+--------+
| id | name    | price  | publish_date | register_date       | is_new |
+----+---------+--------+--------------+---------------------+--------+
|  1 | JAva-17 |  25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  2 | HTML-5  |  25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 100.00 | NULL         | 2020-05-07 11:29:37 |      1 |
|  5 | Oracle  |  25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  6 | CSS     |  25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  7 | Python  |  20.00 | NULL         | 2020-05-07 11:29:37 |      0 |
|  8 | Java 17 |  25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  9 | Vue     |  12.68 | 2020-04-14   | 2020-05-07 11:29:37 |   NULL |
+----+---------+--------+--------------+---------------------+--------+
8 rows in set (0.00 sec)

mysql> select * from books where name in ('Css','Java 17');
+----+---------+-------+--------------+---------------------+--------+
| id | name    | price | publish_date | register_date       | is_new |
+----+---------+-------+--------------+---------------------+--------+
|  6 | CSS     | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  8 | Java 17 | 25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
+----+---------+-------+--------------+---------------------+--------+
2 rows in set (0.00 sec)

mysql> select * from books where publish_date in (null);
Empty set (0.00 sec)

mysql> select * from books where id between 2 and 8;
+----+---------+--------+--------------+---------------------+--------+
| id | name    | price  | publish_date | register_date       | is_new |
+----+---------+--------+--------------+---------------------+--------+
|  2 | HTML-5  |  25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  4 | Python  | 100.00 | NULL         | 2020-05-07 11:29:37 |      1 |
|  5 | Oracle  |  25.65 | 2018-05-23   | 2020-05-07 11:29:37 |   NULL |
|  6 | CSS     |  25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
|  7 | Python  |  20.00 | NULL         | 2020-05-07 11:29:37 |      0 |
|  8 | Java 17 |  25.65 | NULL         | 2020-05-07 11:29:37 |   NULL |
+----+---------+--------+--------------+---------------------+--------+
6 rows in set (0.00 sec)

mysql> select (id,name) from books;
ERROR 1241 (21000): Operand should contain 1 column(s)
mysql> select id, name from books;
+----+---------+
| id | name    |
+----+---------+
|  1 | JAva-17 |
|  2 | HTML-5  |
|  4 | Python  |
|  5 | Oracle  |
|  6 | CSS     |
|  7 | Python  |
|  8 | Java 17 |
|  9 | Vue     |
+----+---------+
8 rows in set (0.00 sec)

mysql> select id as code ,name as ad from books;
+------+---------+
| code | ad      |
+------+---------+
|    1 | JAva-17 |
|    2 | HTML-5  |
|    4 | Python  |
|    5 | Oracle  |
|    6 | CSS     |
|    7 | Python  |
|    8 | Java 17 |
|    9 | Vue     |
+------+---------+
8 rows in set (0.00 sec)

mysql> select price as qiymet, publish_date as tarix from books;
+--------+------------+
| qiymet | tarix      |
+--------+------------+
|  25.65 | NULL       |
|  25.65 | NULL       |
| 100.00 | NULL       |
|  25.65 | 2018-05-23 |
|  25.65 | NULL       |
|  20.00 | NULL       |
|  25.65 | NULL       |
|  12.68 | 2020-04-14 |
+--------+------------+
8 rows in set (0.00 sec)

mysql> select id as code, name as ad, price as qiymet from books;
+------+---------+--------+
| code | ad      | qiymet |
+------+---------+--------+
|    1 | JAva-17 |  25.65 |
|    2 | HTML-5  |  25.65 |
|    4 | Python  | 100.00 |
|    5 | Oracle  |  25.65 |
|    6 | CSS     |  25.65 |
|    7 | Python  |  20.00 |
|    8 | Java 17 |  25.65 |
|    9 | Vue     |  12.68 |
+------+---------+--------+
8 rows in set (0.00 sec)

mysql> create view `books_view` as (select id as code, name as ad, price as qiymet from books);
Query OK, 0 rows affected (0.04 sec)

mysql> select * from books_view;
+------+---------+--------+
| code | ad      | qiymet |
+------+---------+--------+
|    1 | JAva-17 |  25.65 |
|    2 | HTML-5  |  25.65 |
|    4 | Python  | 100.00 |
|    5 | Oracle  |  25.65 |
|    6 | CSS     |  25.65 |
|    7 | Python  |  20.00 |
|    8 | Java 17 |  25.65 |
|    9 | Vue     |  12.68 |
+------+---------+--------+
8 rows in set (0.00 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| baza1              |
| information_schema |
| java5-test         |
| my-db              |
| mysql              |
| mysqlfile          |
| performance_schema |
| sakila             |
| sys                |
| world              |
+--------------------+
10 rows in set (0.01 sec)

mysql> drop database mysqlfile;
Query OK, 1 row affected (0.08 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| baza1              |
| information_schema |
| java5-test         |
| my-db              |
| mysql              |
| performance_schema |
| sakila             |
| sys                |
| world              |
+--------------------+
9 rows in set (0.00 sec)

mysql> drop database mysql;
ERROR 3552 (HY000): Access to system schema 'mysql' is rejected.
mysql> drop database sakila;
Query OK, 23 rows affected (0.76 sec)

mysql> drop database world;
Query OK, 3 rows affected (0.08 sec)

mysql> drop database sys;
Query OK, 101 rows affected (0.33 sec)

mysql> drop database informance_schema;
ERROR 1008 (HY000): Can't drop database 'informance_schema'; database doesn't exist
mysql> drop database information_schema;
ERROR 1044 (42000): Access denied for user 'root'@'localhost' to database 'information_schema'
mysql> drop database performance_schema;
ERROR 1044 (42000): Access denied for user 'root'@'localhost' to database 'performance_schema'
mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| baza1              |
| information_schema |
| java5-test         |
| my-db              |
| mysql              |
| performance_schema |
+--------------------+
6 rows in set (0.00 sec)


Enter password: ******
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 50
Server version: 8.0.29 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use my-db;
Database changed
mysql>  create table students
    ->     (id int not null primary key auto_increment,
    ->     name text,
    ->     phone varchar(20),
    ->     address varchar(100),
    ->     constraint unique_c unique (phone,address));
Query OK, 0 rows affected (0.08 sec)

mysql> desc students;
+---------+--------------+------+-----+---------+----------------+
| Field   | Type         | Null | Key | Default | Extra          |
+---------+--------------+------+-----+---------+----------------+
| id      | int          | NO   | PRI | NULL    | auto_increment |
| name    | text         | YES  |     | NULL    |                |
| phone   | varchar(20)  | YES  | MUL | NULL    |                |
| address | varchar(100) | YES  |     | NULL    |                |
+---------+--------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

mysql>  create table newstudents
    ->     (id int not null primary key auto_increment,
    ->     name text,
    ->     phone varchar(20),
    ->     address varchar(100),
    ->     unique (address));
Query OK, 0 rows affected (0.06 sec)

mysql> desc newstudents;
+---------+--------------+------+-----+---------+----------------+
| Field   | Type         | Null | Key | Default | Extra          |
+---------+--------------+------+-----+---------+----------------+
| id      | int          | NO   | PRI | NULL    | auto_increment |
| name    | text         | YES  |     | NULL    |                |
| phone   | varchar(20)  | YES  |     | NULL    |                |
| address | varchar(100) | YES  | UNI | NULL    |                |
+---------+--------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

mysql> drop table students;
Query OK, 0 rows affected (0.03 sec)

mysql> drop table newstudents;
Query OK, 0 rows affected (0.03 sec)

mysql>  create table newstudents
    ->     (id int not null primary key auto_increment,
    ->     name text,
    ->     phone varchar(20),
    ->     address varchar(100),
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 5
mysql> create table newstudents
    ->     (id int not null primary key auto_increment,
    ->     name text,
    ->     phone varchar(20),
    ->     address varchar(100));
Query OK, 0 rows affected (0.04 sec)

mysql> desc newstudents;
+---------+--------------+------+-----+---------+----------------+
| Field   | Type         | Null | Key | Default | Extra          |
+---------+--------------+------+-----+---------+----------------+
| id      | int          | NO   | PRI | NULL    | auto_increment |
| name    | text         | YES  |     | NULL    |                |
| phone   | varchar(20)  | YES  |     | NULL    |                |
| address | varchar(100) | YES  |     | NULL    |                |
+---------+--------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

mysql> alter table newstudents add unique (phone);
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc newstudents;
+---------+--------------+------+-----+---------+----------------+
| Field   | Type         | Null | Key | Default | Extra          |
+---------+--------------+------+-----+---------+----------------+
| id      | int          | NO   | PRI | NULL    | auto_increment |
| name    | text         | YES  |     | NULL    |                |
| phone   | varchar(20)  | YES  | UNI | NULL    |                |
| address | varchar(100) | YES  |     | NULL    |                |
+---------+--------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

mysql> alter table newstudents add constraint unic unique(phone,address);
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc newstudents;
+---------+--------------+------+-----+---------+----------------+
| Field   | Type         | Null | Key | Default | Extra          |
+---------+--------------+------+-----+---------+----------------+
| id      | int          | NO   | PRI | NULL    | auto_increment |
| name    | text         | YES  |     | NULL    |                |
| phone   | varchar(20)  | YES  | UNI | NULL    |                |
| address | varchar(100) | YES  |     | NULL    |                |
+---------+--------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

mysql> drop table newstudents;
Query OK, 0 rows affected (0.03 sec)

mysql> create table newstudents
    ->     (id int not null primary key auto_increment,
    ->     name text,
    ->     phone varchar(20),
    ->     address varchar(100));
Query OK, 0 rows affected (0.05 sec)

mysql> alter table newstudents add constraint unic unique(phone,address);
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> decs newstudents;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'decs newstudents' at line 1
mysql> desc newstudents;
+---------+--------------+------+-----+---------+----------------+
| Field   | Type         | Null | Key | Default | Extra          |
+---------+--------------+------+-----+---------+----------------+
| id      | int          | NO   | PRI | NULL    | auto_increment |
| name    | text         | YES  |     | NULL    |                |
| phone   | varchar(20)  | YES  | MUL | NULL    |                |
| address | varchar(100) | YES  |     | NULL    |                |
+---------+--------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)
Enter password: ******
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 52
Server version: 8.0.29 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use my-db;
Database changed
mysql> create table cars (id int not null primary key auto_increment,brand text,price double,speed int,check (price>10000));
Query OK, 0 rows affected (0.04 sec)

mysql> insert into cars (name,price) values ('BMW',9000);
ERROR 1054 (42S22): Unknown column 'name' in 'field list'
mysql> insert into cars (brand,price) values ('BMW',9000);
ERROR 3819 (HY000): Check constraint 'cars_chk_1' is violated.
mysql> insert into cars (brand,price) values ('BMW',39000);
Query OK, 1 row affected (0.01 sec)

mysql> select*from cars;
+----+-------+-------+-------+
| id | brand | price | speed |
+----+-------+-------+-------+
|  1 | BMW   | 39000 |  NULL |
+----+-------+-------+-------+
1 row in set (0.00 sec)

mysql> drop tables cars;
Query OK, 0 rows affected (0.03 sec)

mysql> create table cars (id int not null primary key auto_increment,brand text,price double,speed int,constraint price_speed_c check (price>=10000,speed>=100);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ',speed>=100)' at line 1
mysql> create table cars (id int not null primary key auto_increment,brand text,price double,speed int,constraint price_speed_c check (price>=10000 and speed<=300));
Query OK, 0 rows affected (0.04 sec)

mysql> insert into cars (brand,price,speed) values ('BMW',39000,200);
Query OK, 1 row affected (0.01 sec)

mysql> select*from cars;
+----+-------+-------+-------+
| id | brand | price | speed |
+----+-------+-------+-------+
|  1 | BMW   | 39000 |   200 |
+----+-------+-------+-------+
1 row in set (0.00 sec)

mysql> insert into cars (brand,price,speed) values ('BMW',39000,400);
ERROR 3819 (HY000): Check constraint 'price_speed_c' is violated.
mysql> drop tables cars;
Query OK, 0 rows affected (0.03 sec)

mysql> create table cars (id int not null primary key auto_increment,brand text,price double,speed int);
Query OK, 0 rows affected (0.04 sec)

mysql> alter table cars add check (price>30000);
Query OK, 0 rows affected (0.09 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> drop tables cars;
Query OK, 0 rows affected (0.03 sec)

mysql> create table cars (id int not null primary key auto_increment,brand text,price double,speed int);
Query OK, 0 rows affected (0.04 sec)

mysql> alter table cars add constraint price_speed_c check (price>=10000 and speed<=300);
Query OK, 0 rows affected (0.09 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> insert into cars (brand,price,speed) values ('BMW',39000,400);
ERROR 3819 (HY000): Check constraint 'price_speed_c' is violated.
mysql> drop tables cars;
Query OK, 0 rows affected (0.03 sec)

mysql> create table cars (id int not null primary key auto_increment,brand text,price double default 1000,speed int);
Query OK, 0 rows affected (0.04 sec)

mysql> select*from cars;
Empty set (0.00 sec)

mysql> insert into cars (brand) values ('Kia');
Query OK, 1 row affected (0.01 sec)

mysql> select*from cars;
+----+-------+-------+-------+
| id | brand | price | speed |
+----+-------+-------+-------+
|  1 | Kia   |  1000 |  NULL |
+----+-------+-------+-------+
1 row in set (0.00 sec)

mysql> drop tables cars;
Query OK, 0 rows affected (0.03 sec)

mysql> create table cars (id int not null primary key auto_increment,brand text,price double,speed int);
Query OK, 0 rows affected (0.04 sec)

mysql> alter table cars alter price set default 2000;
Query OK, 0 rows affected (0.01 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> insert into cars (brand) values ('Kia');
Query OK, 1 row affected (0.01 sec)

mysql> select*from cars;
+----+-------+-------+-------+
| id | brand | price | speed |
+----+-------+-------+-------+
|  1 | Kia   |  2000 |  NULL |
+----+-------+-------+-------+
1 row in set (0.00 sec)

mysql> alter table cars alter price drop default;
Query OK, 0 rows affected (0.01 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> insert into cars (brand) values ('Kia');
ERROR 1364 (HY000): Field 'price' doesn't have a default value
mysql> insert into cars (brand) values ('BMW');
ERROR 1364 (HY000): Field 'price' doesn't have a default value
mysql> desc cars;
+-------+--------+------+-----+---------+----------------+
| Field | Type   | Null | Key | Default | Extra          |
+-------+--------+------+-----+---------+----------------+
| id    | int    | NO   | PRI | NULL    | auto_increment |
| brand | text   | YES  |     | NULL    |                |
| price | double | YES  |     | NULL    |                |
| speed | int    | YES  |     | NULL    |                |
+-------+--------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

mysql> insert into cars (brand,price) values ('BMW',25000);
Query OK, 1 row affected (0.01 sec)

mysql> select*from tables;
ERROR 1146 (42S02): Table 'my-db.tables' doesn't exist
mysql> select *from cars;
+----+-------+-------+-------+
| id | brand | price | speed |
+----+-------+-------+-------+
|  1 | Kia   |  2000 |  NULL |
|  2 | BMW   | 25000 |  NULL |
+----+-------+-------+-------+
2 rows in set (0.00 sec)

mysql> insert into cars (brand,price) values ('Mercedes',35000);
Query OK, 1 row affected (0.01 sec)

mysql> insert into cars (brand,price) values ('Toyota',45000);
Query OK, 1 row affected (0.01 sec)

mysql> create index1 on cars (s1);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'index1 on cars (s1)' at line 1
mysql> create index1 on cars (brand);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'index1 on cars (brand)' at line 1
mysql> create index index1 on cars(brand);
ERROR 1170 (42000): BLOB/TEXT column 'brand' used in key specification without a key length
mysql> create index index1 on cars(price);
Query OK, 0 rows affected (0.04 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc cars;
+-------+--------+------+-----+---------+----------------+
| Field | Type   | Null | Key | Default | Extra          |
+-------+--------+------+-----+---------+----------------+
| id    | int    | NO   | PRI | NULL    | auto_increment |
| brand | text   | YES  |     | NULL    |                |
| price | double | YES  | MUL | NULL    |                |
| speed | int    | YES  |     | NULL    |                |
+-------+--------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

mysql> alter table cars drop index index1;
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc cars;
+-------+--------+------+-----+---------+----------------+
| Field | Type   | Null | Key | Default | Extra          |
+-------+--------+------+-----+---------+----------------+
| id    | int    | NO   | PRI | NULL    | auto_increment |
| brand | text   | YES  |     | NULL    |                |
| price | double | YES  |     | NULL    |                |
| speed | int    | YES  |     | NULL    |                |
+-------+--------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

mysql> select * from cars;-- where id=2;
+----+----------+-------+-------+
| id | brand    | price | speed |
+----+----------+-------+-------+
|  1 | Kia      |  2000 |  NULL |
|  2 | BMW      | 25000 |  NULL |
|  3 | Mercedes | 35000 |  NULL |
|  4 | Toyota   | 45000 |  NULL |
+----+----------+-------+-------+
4 rows in set (0.00 sec)

mysql> select brand,price from cars;
+----------+-------+
| brand    | price |
+----------+-------+
| Kia      |  2000 |
| BMW      | 25000 |
| Mercedes | 35000 |
| Toyota   | 45000 |
+----------+-------+
4 rows in set (0.00 sec)

mysql> select brand/*,price*/ /*from cars;
+----------+
| brand    |
+----------+
| Kia      |
| BMW      |
| Mercedes |
| Toyota   |
+----------+
4 rows in set (0.00 sec)


	 */

}
