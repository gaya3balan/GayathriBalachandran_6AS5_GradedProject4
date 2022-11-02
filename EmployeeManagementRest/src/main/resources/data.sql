--password of admin is admin6as5
--password of user is user6as5

insert into users (user_id,password, username) values (1,'$2a$12$yni9G4b7r9mEsXfPFKL9.uFcCDP18Mn8rBNszz0syzB2ukZTJkQkW', 'admin');
insert into users (user_id,password, username) values (2,'$2a$12$Ty3ckOTpY4l2ra3EyNrBKuh.bsA0euVxqBNILKfvg67tWFUwGcOMm', 'user');

insert into roles (role_id,name) values(1,'ADMIN');
insert into roles (role_id,name) values(2,'USER');

insert into users_roles (user_id, role_id) values (1, 1);
insert into users_roles (user_id, role_id) values (2, 2);

insert into employee (id, first_name, last_name, email) values (1, 'gayathri', 'balachandran', 'gaya.bala@gmail.com');
insert into employee (id, first_name, last_name, email) values (2, 'vikas', 'agrawal', 'vikas.agrawal@gmail.com');
insert into employee (id, first_name, last_name, email) values (3, 'vikas', 'sharma', 'vikas.sharma@gmail.com');
