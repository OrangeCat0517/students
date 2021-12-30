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
insert into classes(c_number, c_name, c_status, c_create_user, c_create_time, c_operator_user, c_operator_time)
values ('CL202112001', 'Java大数据358', 1, 'tom', '2021-01-01 10:12:59', 'tom', '2021-01-01 10:12:59');
insert into classes(c_number, c_name, c_status, c_create_user, c_create_time, c_operator_user, c_operator_time)
values ('CL202112002', 'Java大数据359', 1, 'tom', '2021-01-01 10:12:59', 'tom', '2021-01-01 10:12:59');

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
insert into students(s_number, s_name, s_age, s_sex, s_birthday, s_address, s_tel, c_id, s_status, s_create_user, s_create_time, s_operator_user, s_operator_time)
values('SN20211200001', 'Tom', 21, 'M', '1998-12-28', 'Beijing', '18601223321', 1, 1, 'tom', '2021-01-01 10:12:59', 'tom', '2021-01-01 10:12:59');
insert into students(s_number, s_name, s_age, s_sex, s_birthday, s_address, s_tel, c_id, s_status, s_create_user, s_create_time, s_operator_user, s_operator_time)
values('SN20211200002', 'Jerry', 21, 'M', '1998-12-28', 'Beijing', '18601223321', 1, 1, 'tom', '2021-01-01 10:12:59', 'tom', '2021-01-01 10:12:59');
insert into students(s_number, s_name, s_age, s_sex, s_birthday, s_address, s_tel, c_id, s_status, s_create_user, s_create_time, s_operator_user, s_operator_time)
values('SN20211200003', 'Ben', 21, 'M', '1998-12-28', 'Beijing', '18601223321', 1, 1, 'tom', '2021-01-01 10:12:59', 'tom', '2021-01-01 10:12:59');
insert into students(s_number, s_name, s_age, s_sex, s_birthday, s_address, s_tel, c_id, s_status, s_create_user, s_create_time, s_operator_user, s_operator_time)
values('SN20211200004', 'Tom1', 21, 'M', '1998-12-28', 'Beijing', '18601223321', 2, 1, 'tom', '2021-01-01 10:12:59', 'tom', '2021-01-01 10:12:59');
insert into students(s_number, s_name, s_age, s_sex, s_birthday, s_address, s_tel, c_id, s_status, s_create_user, s_create_time, s_operator_user, s_operator_time)
values('SN20211200005', 'Jerry2', 21, 'M', '1998-12-28', 'Beijing', '18601223321', 2, 1, 'tom', '2021-01-01 10:12:59', 'tom', '2021-01-01 10:12:59');



drop table if exists scores;
create table scores(
                       sc_id int primary key auto_increment,
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
insert into scores(sc_chinese, sc_math, sc_english, s_id, sc_status, sc_create_user, sc_create_time, sc_operator_user, sc_operator_time)
values(79, 100, 91, 1, 1, 'tom', '2021-01-01 10:12:59', 'tom', '2021-01-01 10:12:59');
insert into scores(sc_chinese, sc_math, sc_english, s_id, sc_status, sc_create_user, sc_create_time, sc_operator_user, sc_operator_time)
values(23, 32, 88, 2, 1, 'tom', '2021-01-01 10:12:59', 'tom', '2021-01-01 10:12:59');
insert into scores(sc_chinese, sc_math, sc_english, s_id, sc_status, sc_create_user, sc_create_time, sc_operator_user, sc_operator_time)
values(100, 100, 65, 3, 1, 'tom', '2021-01-01 10:12:59', 'tom', '2021-01-01 10:12:59');

select count(s_id) from students where c_id = 1;

