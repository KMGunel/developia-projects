package sql;

public class SqlTask {

/*	

mysql> create database `baza1`;
Query OK, 1 row affected (0.01 sec)

mysql> use baza1;
Database changed
mysql> create table computers (id int,brand text,price double);
Query OK, 0 rows affected (0.04 sec)

mysql> insert into computers (id,brand,price) values (1,'Dell',750.0);
Query OK, 1 row affected (0.01 sec)

mysql> insert into computers (id,brand,price) values (2,'Asus',600.0);
Query OK, 1 row affected (0.01 sec)

mysql> insert into computers (id,brand,price) values(5,'Lenovo',500.0);
Query OK, 1 row affected (0.00 sec)

mysql> insert into computers (id,brand,price) values(4,'Acer',680.0);
Query OK, 1 row affected (0.00 sec)

mysql> insert into computers (id,brand,price) values (3,'Macbook',1000.0);
Query OK, 1 row affected (0.01 sec)

mysql> select * from computers;
+------+---------+-------+
| id   | brand   | price |
+------+---------+-------+
|    1 | Dell    |   750 |
|    2 | Asus    |   600 |
|    5 | Lenovo  |   500 |
|    4 | Acer    |   680 |
|    3 | Macbook |  1000 |
+------+---------+-------+
5 rows in set (0.01 sec)

mysql> select*from computers order by brand desc;
+------+---------+-------+
| id   | brand   | price |
+------+---------+-------+
|    3 | Macbook |  1000 |
|    5 | Lenovo  |   500 |
|    1 | Dell    |   750 |
|    2 | Asus    |   600 |
|    4 | Acer    |   680 |
+------+---------+-------+
5 rows in set (0.01 sec)

mysql> select *from computers order by brand;
+------+---------+-------+
| id   | brand   | price |
+------+---------+-------+
|    4 | Acer    |   680 |
|    2 | Asus    |   600 |
|    1 | Dell    |   750 |
|    5 | Lenovo  |   500 |
|    3 | Macbook |  1000 |
+------+---------+-------+
5 rows in set (0.00 sec)

mysql> select max(price) as max_qiymet from computers;
+------------+
| max_qiymet |
+------------+
|       1000 |
+------------+
1 row in set (0.01 sec)

mysql> select min(price) as min_qiymet from computers;
+------------+
| min_qiymet |
+------------+
|        500 |
+------------+
1 row in set (0.00 sec)

mysql> select*from computers;
+------+---------+-------+
| id   | brand   | price |
+------+---------+-------+
|    1 | Dell    |   750 |
|    2 | Asus    |   600 |
|    5 | Lenovo  |   500 |
|    4 | Acer    |   680 |
|    3 | Macbook |  1000 |
+------+---------+-------+
5 rows in set (0.00 sec)

mysql> select count(*) from computers;
+----------+
| count(*) |
+----------+
|        5 |
+----------+
1 row in set (0.01 sec)

mysql> select avg(price) from computers;
+------------+
| avg(price) |
+------------+
|        706 |
+------------+
1 row in set (0.00 sec)

2ci tapsiriq---------------------------------------------------------------------------------------

mysql> create table books(id int primary key auto_increment,name VARCHAR(30),price decimal(10,2),description text);
Query OK, 0 rows affected (0.04 sec)

mysql> insert into books(name,price,description) values ('Sefiller',5.60,'650 sehife');
Query OK, 1 row affected (0.01 sec)

mysql> insert into books (name,price,description) values ('Cinayet ve ceza',4.30,'Fyodor Dostoyevski');
Query OK, 1 row affected (0.01 sec)

mysql> insert into books(name,price,description) values ('Da Vinchi shifresi',8.50,'Dan Brown');
Query OK, 1 row affected (0.01 sec)

mysql> insert into books(name,price,description) values ('Uzuklerin Efendisi',9.64,'Tolkien');
Query OK, 1 row affected (0.01 sec)

mysql> insert into books(name,price,description) values ('Anna Karenina',7.50,'Lev Tolstoy');
Query OK, 1 row affected (0.01 sec)

mysql> select*from books;
+----+--------------------+-------+--------------------+
| id | name               | price | description        |
+----+--------------------+-------+--------------------+
|  1 | Sefiller           |  5.60 | 650 sehife         |
|  2 | Cinayet ve ceza    |  4.30 | Fyodor Dostoyevski |
|  3 | Da Vinchi shifresi |  8.50 | Dan Brown          |
|  4 | Uzuklerin Efendisi |  9.64 | Tolkien            |
|  5 | Anna Karenina      |  7.50 | Lev Tolstoy        |
+----+--------------------+-------+--------------------+
5 rows in set (0.00 sec)

mysql> update books set name='Melekler ve sheytanlar' where id=3;
Query OK, 1 row affected (0.02 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> delete from books where id=4;
Query OK, 1 row affected (0.01 sec)

mysql> select* from books;
+----+------------------------+-------+--------------------+
| id | name                   | price | description        |
+----+------------------------+-------+--------------------+
|  1 | Sefiller               |  5.60 | 650 sehife         |
|  2 | Cinayet ve ceza        |  4.30 | Fyodor Dostoyevski |
|  3 | Melekler ve sheytanlar |  8.50 | Dan Brown          |
|  5 | Anna Karenina          |  7.50 | Lev Tolstoy        |
+----+------------------------+-------+--------------------+
4 rows in set (0.00 sec)



3cu tapsiriq------------------------------------------------------------------------------------


mysql> create table products(id int,name text,price double,quantity int);
Query OK, 0 rows affected (0.04 sec)

mysql> insert into products(id,name,price,quantity) values ( 11,'copybook',1.50,100);
Query OK, 1 row affected (0.01 sec)

mysql> insert into products(id,name,price,quantity) values ( 22,'copybook',2.50,250);
Query OK, 1 row affected (0.01 sec)

mysql> insert into products(id,name,price,quantity) values ( 31,'copybook',1.50,150);
Query OK, 1 row affected (0.01 sec)

mysql> insert into products(id,name,price,quantity) values ( 38,'copybook',1.70,80);
Query OK, 1 row affected (0.01 sec)

mysql> insert into products(id,name,price,quantity) values ( 24,'pencil',0.50,400);
Query OK, 1 row affected (0.01 sec)

mysql> insert into products(id,name,price,quantity) values ( 52,'pencil',1.20,150);
Query OK, 1 row affected (0.01 sec)

mysql> insert into products(id,name,price,quantity) values ( 85,'pen',2.20,300);
Query OK, 1 row affected (0.01 sec)

mysql> insert into products(id,name,price,quantity) values ( 89,'rubber',0.80,250);
Query OK, 1 row affected (0.01 sec)

mysql> insert into products(id,name,price,quantity) values ( 92,'ruler',1.70,170);
Query OK, 1 row affected (0.01 sec)

mysql> insert into products(id,name,price,quantity) values ( 96,'copybook',1.70,180);
Query OK, 1 row affected (0.01 sec)

mysql> select*from products;
+------+----------+-------+----------+
| id   | name     | price | quantity |
+------+----------+-------+----------+
|   11 | copybook |   1.5 |      100 |
|   22 | copybook |   2.5 |      250 |
|   31 | copybook |   1.5 |      150 |
|   38 | copybook |   1.7 |       80 |
|   24 | pencil   |   0.5 |      400 |
|   52 | pencil   |   1.2 |      150 |
|   85 | pen      |   2.2 |      300 |
|   89 | rubber   |   0.8 |      250 |
|   92 | ruler    |   1.7 |      170 |
|   96 | copybook |   1.7 |      180 |
+------+----------+-------+----------+
10 rows in set (0.00 sec)


mysql> select name,max(price) from products group by name;
+----------+------------+
| name     | max(price) |
+----------+------------+
| copybook |        2.5 |
| pencil   |        1.2 |
| pen      |        2.2 |
| rubber   |        0.8 |
| ruler    |        1.7 |
+----------+------------+
5 rows in set (0.00 sec)



4cu tapsiriq------------------------------------------------------------------------


mysql> create table new_computers(id int primary key auto_increment,brand VARCHAR(30),model VARCHAR(30),price decimal(10,2),description text,register datetime);
Query OK, 0 rows affected (0.04 sec)

mysql> insert into new_computers(brand,model,price) values ('Acer','Aspire',1250.0);
Query OK, 1 row affected (0.01 sec)

mysql> insert into new_computers(brand,model,price) values ('Acer','Nitro',1400.0);
Query OK, 1 row affected (0.01 sec)

mysql>
mysql> insert into new_computers(brand,model,price) values ('Asus','Zenbook',1200.0);
Query OK, 1 row affected (0.01 sec)

mysql> insert into new_computers(brand,model,price) values ('Asus','Zenbook-Flip',1850.0);
Query OK, 1 row affected (0.01 sec)

mysql> insert into new_computers(brand,model,price) values ('Dell','XPS',1300.0);
Query OK, 1 row affected (0.01 sec)

mysql> insert into new_computers(brand,model,price) values ('Dell','Alienvare',1200.0);
Query OK, 1 row affected (0.01 sec)

mysql> insert into new_computers(brand,model,price) values ('Macbook','Macbook-Pro',2200.0);
Query OK, 1 row affected (0.01 sec)

mysql> insert into new_computers(brand,model,price) values ('Macbook','Macbook-Air',2100.0);
Query OK, 1 row affected (0.01 sec)

mysql> select*from new_computers;
+----+---------+--------------+---------+-------------+----------+
| id | brand   | model        | price   | description | register |
+----+---------+--------------+---------+-------------+----------+
|  1 | Acer    | Aspire       | 1250.00 | NULL        | NULL     |
|  2 | Acer    | Nitro        | 1400.00 | NULL        | NULL     |
|  3 | Asus    | Zenbook      | 1200.00 | NULL        | NULL     |
|  4 | Asus    | Zenbook-Flip | 1850.00 | NULL        | NULL     |
|  5 | Dell    | XPS          | 1300.00 | NULL        | NULL     |
|  6 | Dell    | Alienvare    | 1200.00 | NULL        | NULL     |
|  7 | Macbook | Macbook-Pro  | 2200.00 | NULL        | NULL     |
|  8 | Macbook | Macbook-Air  | 2100.00 | NULL        | NULL     |
+----+---------+--------------+---------+-------------+----------+
8 rows in set (0.00 sec)

mysql> select * from new_computers where id in(3,5,7);
+----+---------+-------------+---------+-------------+----------+
| id | brand   | model       | price   | description | register |
+----+---------+-------------+---------+-------------+----------+
|  3 | Asus    | Zenbook     | 1200.00 | NULL        | NULL     |
|  5 | Dell    | XPS         | 1300.00 | NULL        | NULL     |
|  7 | Macbook | Macbook-Pro | 2200.00 | NULL        | NULL     |
+----+---------+-------------+---------+-------------+----------+
3 rows in set (0.00 sec)

*/
}
