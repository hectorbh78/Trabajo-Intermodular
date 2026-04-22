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
('Acero'),

-- Entrenador
INSERT INTO Entrenador (Nombre) VALUES 
('Ruben'),
('Jp'),
('Hector'),
('Leo');

-- Gimnasio
INSERT INTO Gimnasio (Nombre, NivelRecomendado, idMundo) VALUES 
('Gimnasio Maleante', 10, 1),
('Gimnasio Duro', 20, 1),
('Gimnasio Cuencos', 5, 2),
('Gimnasio Pastelito de Fresa', 2, 2),
('Gimnasio Tren Molon', 8, 3),
('Gimnasio Ibuprofeno', 9, 3);

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
(1,1),
(1,2),
(2,1),
(4,1),
(3,1);

-- Ataque
INSERT INTO Ataque (Nombre, Daño, TipoDaño, idTipo) VALUES 
('Navajazo', 40, 'Normal', 7),
('Super Navajazo', 60, 'Especial', 8),
('Coletazo', 50, 'Normal', 7),
('Tajo Supremo', 30, 'Especial', 3),
('Arañazo', 30, 'Normal', 7),
('Aqua Jet', 30, 'Especial', 2);

-- Puchamon
INSERT INTO Puchamon (Nombre, Nivel, Vida, idEntrenador) VALUES 
('Lagasur', 10, 35, 1),
('Salasaur', 21, 65, 1),
('Dragasaur', 36, 90, 1),
('Jai', 12, 40, 2),
('Nava-Jazo', 22, 55, 1),
('Tapu-Ñalo', 38, 110, 1),
('Rico', 10, 35, 1),
('Krico', 20, 50, 1),
('Krico: Hulkbuster', 40, 120, 1);

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