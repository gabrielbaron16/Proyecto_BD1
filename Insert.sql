\connect proyecto

--Lugares
insert into Lugar_4 values(1, 'Miranda', 'Estado');
insert into Lugar_4 values(2, 'Vargas', 'Estado');
insert into Lugar_4 values(3, 'Nueva Esparta', 'Estado');
insert into Lugar_4 values(4, 'Caracas', 'Ciudad', 1);
insert into Lugar_4 values(5, 'Baruta', 'Municipio', 4);
insert into Lugar_4 values(6, 'Los Samanes', 'Urbanizacion', 5);
insert into Lugar_4 values(7, 'Av. Las Colinas', 'Avenida', 6);
insert into Lugar_4 values(8, 'Edf Las Ternarias', 'Edfificio', 7);
insert into Lugar_4 values(9, 'El cafetal', 'Urbanizacion', 4);
insert into Lugar_4 values(10, 'El limon', 'Calle', 9);
insert into Lugar_4 values(11, 'Quinta Almeida', 'Casa', 10);
insert into Lugar_4 values(12, 'Chacao', 'Municipio', 4);
insert into Lugar_4 values(13, 'Calle Elice', 'Calle', 12);
insert into Lugar_4 values(14, 'Edf Merwe', 'Edfificio', 13);
insert into Lugar_4 values(15, 'La Guaira', 'Ciudad', 2);
insert into Lugar_4 values(16, 'Catia La Mar', 'Municipio', 15);
insert into Lugar_4 values(17, 'Av Balneario', 'Avenida', 16);
insert into Lugar_4 values(18, 'Quinta Pampa', 'Casa', 17);
insert into Lugar_4 values(19, 'Pampatar', 'Municipio', 3);
insert into Lugar_4 values(20, 'Calle JM Vargas', 'Calle' ,19);
insert into Lugar_4 values(21, 'Castillo San Carlos de Barromeo', 'Casa', 20);
insert into Lugar_4 values(22, 'Res Colinavila', 'Edf', 7);
insert into Lugar_4 values(23, 'Quinta Pnooorab', 'Casa', 17);
insert into Lugar_4 values(24, 'Juventus', 'Edf', 20);
insert into Lugar_4 values(25, 'Las candelitas', 'Edf', 10);

--Guarderias
insert into Guarderia_4 values ('J298754541-5',1200, 500, 400, 1400, 250, '08:00', '18:00', 8);
insert into Guarderia_4 values ('J764219187-2', 1250, 450, 500, 1500, 285, '08:30', '18:00', 10);
insert into Guarderia_4 values ('J128487902-9', 1400, 500,  500, 1500, 400, '08:00', '17:00', 14);
insert into Guarderia_4 values ('J516782778-4', 1100, 400, 400, 1200, 200, '07:00', '19:00', 17);
insert into Guarderia_4 values ('J279154667-2', 1200, 500, 400, 1400, 250, '08:00', '18:00', 21);

--Personal
insert into Personal_4 values ('V9214662' , 'Juan', 'Pollizschter', 04167198427, 'Universitario', 200, 1, '2017-12-02', 22, 'J128487902-9' );
insert into Personal_4 values ('V24718965' , 'Enrique', 'Pollizschter', 04167198578, 'Bachillerato', 200, 1, '2018-01-20', 22, 'J298754541-5');
insert into Personal_4 values ('V8176220', 'Maria', 'Hernandez', 04249810876, 'Postgrado', 400, 1, '2016-09-17', 23, 'J516782778-4');
insert into Personal_4 values ('V17958047', 'Ernesto', 'Dawae', 04269108765, 'TSU', 400, 1, '2017-05-20', 22, 'J764219187-2');
insert into Personal_4 values ('E25978194', 'Andrea', 'Pirlo', 04129876178, 'Universitario', 400, 1, '2017-11-10', 24, 'J279154667-2');

--Experiencia
insert into Experiencia_4 values ('V9214662', 'Reformatorio');
insert into Experiencia_4 values ('V9214662', 'Plan vacacional');
insert into Experiencia_4 values ('V24718965', 'Reformatorio');
insert into Experiencia_4 values ('V17958047', '7 Hermanos menores');
insert into Experiencia_4 values ('E25978194', 'Academia de futbol infantil');

--Representantes
insert into Representante_4 values ('V8108418', 'Henrietta', 'Zazalli', 04245019827, 02129448721, 02129871451, 'Hzaza@gmail.com', 'Albañil', 'C', 1, 23 );
insert into Representante_4 values ('V24871662', 'Daniel', 'Guerra', 04167810091, 02129876612, 02128876542, 'losada@gmail.com', 'Ingeniero', 'S', 1, 24);
insert into Representante_4 values ('V20145701', 'Cristoff', 'Ruiz', 04129018764, 02129087651, 02127650918, 'ffRui@gmail.com', 'Profesor', 'C', 1, 25);
insert into Representante_4 values ('V14910819', 'Claudia', 'Marcano', 04269018765, 02120918716, 02129108714, 'siso@hotmail.com', 'Contadora', 'C', 1, 25);
insert into Representante_4 values ('E10917655', 'Danielle', 'Sturaro', 04169870191, 02129980198, 02126517891, 'atalancia@yahoo.net', 'Mafioso', 'S', 1, 22);

--Autorizado
insert into Autorizado_4 values ('V9187221', 'Jorge', 'Ramirez', 04166908170);
insert into Autorizado_4 values ('V9214662', 'Juan', 'Pollizschter', 04167198427);
insert into Autorizado_4 values ('V12018977', 'Alfredo', 'Martinez', 04249108761);
insert into Autorizado_4 values ('V4987907', 'Sergio', 'Reveron', 04168901245);
insert into Autorizado_4 values ('V25987122', 'Augusto', 'Marchisio', 04149871020);

--Actividades
insert into Actividad_4 values (1, 'Futbol', 'Los niños juegan futbol con un balón 3', 4, 1);