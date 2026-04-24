-- Mundo
INSERT INTO Mundo (Nombre, Region) VALUES 
('Parla', 'Centro'),
('Valde', 'Moro'),
('Bronx', 'Brasil Oscuro');

-- Tipo
INSERT INTO Tipo (Nombre) VALUES 
('Fuego'),
('Agua'),
('Planta'),
('Volador'),
('Veneno'),
('Tierra'),
('Normal'),
('Navaja'),
('Explosivo'),
('Acero');

-- Entrenador
INSERT INTO Entrenador (Nombre) VALUES 
('Ruben'),
('Jp'),
('Hector'),
('Leo');

-- Gimnasio
INSERT INTO Gimnasio (Nombre, NivelRecomendado, idMundo) VALUES 
('Gimnasio Maleante', 15, 1),
('Gimnasio Duro', 17, 1),
('Gimnasio Cuencos', 19, 1),
('Gimnasio Pastelito de Fresa', 21, 2),
('Gimnasio Tren Molon', 24, 2),
('Gimnasio Ibuprofeno', 27, 2),
('Gimnasio Flexolandia', 29, 3),
('Gimnasio Rattatatata Fitness', 31, 3),
('Gimnasio PuchaFit', 34, 3);

-- Mision (sin objeto aún)
INSERT INTO Mision (Descripcion, Recompensa, idMundo, idObjeto) VALUES 
('Vence todos los gimnasios', 'Medalla', 1, NULL),
('Vence todos los gimnasios', 'Medalla', 2, NULL),
('Vence todos los gimnasios', 'Medalla', 3, NULL),
('Consigue todos los puchamones', 'Palmadita', 1, NULL),
('Consigue todos los puchamones', 'Palmadita', 2, NULL),
('Consigue todos los puchamones', 'Palmadita', 3, NULL);

-- Objeto
INSERT INTO Objeto (Nombre, Efecto, idMision) VALUES 
('Pocion', 'Cura 20 HP', 2),
('SuperPocion', 'Cura 50 HP', 1),
('Revivir', 'Revive a la mitad de HP', 1);

-- Actualizar Mision con objeto
UPDATE Mision SET idObjeto = 1 WHERE idMision = 1;
UPDATE Mision SET idObjeto = 2 WHERE idMision = 2;
UPDATE Mision SET idObjeto = 3 WHERE idMision = 3;
UPDATE Mision SET idObjeto = 1 WHERE idMision = 4;
UPDATE Mision SET idObjeto = 2 WHERE idMision = 5;
UPDATE Mision SET idObjeto = 3 WHERE idMision = 6;

-- Inventario (N:M)
INSERT INTO Inventario VALUES 
(1,1,0),
(1,2,0);

-- Ataque
INSERT INTO Ataque (Nombre, Daño, TipoDaño, idTipo) VALUES 
('Navajazo', 30, 'Normal', 7),
('Super Navajazo', 50, 'Especial', 8),
('Coletazo', 30, 'Normal', 7),
('Tajo Supremo', 50, 'Especial', 3),
('Arañazo', 30, 'Normal', 7),
('Aqua Jet', 50, 'Especial', 2);

-- Puchamon
INSERT INTO Puchamon (Nombre, Nivel, Vida, idEntrenador) VALUES 
('Lagasaur', 10, 100, 1),
('Salasaur', 23, 130, 1),
('Dragasaur', 33, 175, 1),
('Jai', 10, 90, 2),
('Nava-Jazo', 24, 110, 2),
('Tapu-Ñalo', 35, 142, 2),
('Rico', 10, 97, 1),
('Krico', 20, 124, 1),
('Krico: Hulkbuster', 30, 159, 1);

-- TipoPuchamon (N:M)
INSERT INTO TipoPuchamon VALUES 
(1,3,null),
(2,3,5),
(3,3,5),
(4,10,null),
(5,8,10),
(6,8,10),
(7,2,null),
(8,2,10),
(9,10,9);

INSERT INTO Puchamon_Ataque VALUES 
(1,3,null), 
(2,3,4), 
(3,3,4),
(4,1,null),
(5,1,2),
(6,1,2),
(7,5,null),
(8,5,6),
(9,5,6);

-- Lucha
INSERT INTO Lucha (Fecha, Tipo, idEntrenador, idGimnasio) VALUES 
('2025-01-05', 'Gimnasio', 1, 1),
('2025-03-02', 'Amistosa', 2, 2);