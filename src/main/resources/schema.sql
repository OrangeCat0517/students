drop table if exists classes;
create table classes(
                        c_id int primary key auto_increment,
                        c_number varchar(11),
                        c_name varchar(50),
                        c_status int(1),
                        c_create_user varchar(30),
                        c_create_time datetime,
                        c_operator_user varchar(30),
                        c_operator_time datetime
);


drop table if exists students;
create table students(
                         s_id int primary key auto_increment,
                         s_number varchar(13),
                         s_name varchar(30),
                         s_age int,
                         s_sex enum('F', 'M'),
                         s_birthday date,
                         s_address varchar(100),
                         s_tel varchar(20),
                         c_id int,
                         s_status int(1),
                         s_create_user varchar(30),
                         s_create_time datetime,
                         s_operator_user varchar(30),
                         s_operator_time datetime
);

drop table if exists scores;
create table scores(
                       sc_id int primary key ,
                       sc_chinese int,
                       sc_math int,
                       sc_english int,
                       s_id int,
                       sc_status int(1),
                       sc_create_user varchar(30),
                       sc_create_time datetime,
                       sc_operator_user varchar(30),
                       sc_operator_time datetime
);
