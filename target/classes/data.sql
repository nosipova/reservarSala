insert into sala(codigo, nombre, capacidad, recursos_tec) values (1, 'Videoconferencias', 20,'television, proyector, pizarra digital, sistemas de
videoconferencia')
insert into sala(codigo, nombre, capacidad, recursos_tec) values (2, 'Meetings', 6,'pizarra digital')
insert into sala(codigo, nombre, capacidad, recursos_tec) values (3, 'Interna', 4,'pizarra digital')
insert into sala(codigo, nombre, capacidad, recursos_tec) values (4, 'Juntas', 12,'television, proyector, pizarra digital, sistemas de
videoconferencia')
insert into sala(codigo, nombre, capacidad, recursos_tec) values (5, 'Meetings', 8,'pizarra digital')

insert into sala_reservada(id, num_personas, fecha, init_hour, finish_hour, codigo) values (1, 3, TO_DATE('14/03/2020', 'DD/MM/YYYY'), 10, 11, 3)
insert into sala_reservada(id, num_personas, fecha, init_hour, finish_hour, codigo) values (2, 8, TO_DATE('14/03/2020', 'DD/MM/YYYY'), 10, 11, 5)
insert into sala_reservada(id, num_personas, fecha, init_hour, finish_hour, codigo) values (3, 4, TO_DATE('14/03/2020', 'DD/MM/YYYY'), 12, 13, 3)
insert into sala_reservada(id, num_personas, fecha, init_hour, finish_hour, codigo) values (4, 5, TO_DATE('14/03/2020', 'DD/MM/YYYY'), 10, 11, 2)