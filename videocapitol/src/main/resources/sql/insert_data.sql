insert into CLIENTE(rut,nombre,direccion,telefono) values 
('1','1','1','1'),
('2','2','2','2'),
('3','3','3','3');

insert into PELICULA(titulo, descripcion, actores, director, inventario) values
('1','1','1','1',1),
('2','2','2','2',2),
('3','3','3','3',3);

insert into RESERVA(cliente_id, pelicula_id, fecha_hora) values
(1,1,CURRENT_TIMESTAMP()),
(2,2,CURRENT_TIMESTAMP()),
(3,3,CURRENT_TIMESTAMP());