-- Ver entrenadores con sus puchamon
SELECT e.Nombre, p.Nombre AS Puchamon
FROM Entrenador e
JOIN Puchamon p ON e.idEntrenador = p.idEntrenador;

-- Ver inventario de cada entrenador
SELECT e.Nombre, o.Nombre AS Objeto
FROM Inventario i
JOIN Entrenador e ON i.idEntrenador = e.idEntrenador
JOIN Objeto o ON i.idObjeto = o.idObjeto;

-- Ver puchamon con su tipo
SELECT p.Nombre, t.Nombre AS Tipo
FROM TipoPuchamon tp
JOIN Puchamon p ON tp.idPuch = p.idPuch
JOIN Tipo t ON tp.idTipo = t.idTipo

SELECT 
    p.Nombre, 
    GROUP_CONCAT(t.Nombre SEPARATOR ' / ') AS Tipos,
    COUNT(t.idTipo) AS Total_Tipos
FROM Puchamon p
LEFT JOIN TipoPuchamon tp ON p.idPuch = tp.idPuch
LEFT JOIN Tipo t ON tp.idTipo = t.idTipo
GROUP BY p.idPuch, p.Nombre;

-- Ver ataques con su tipo
SELECT a.Nombre, t.Nombre AS Tipo
FROM Ataque a
JOIN Tipo t ON a.idTipo = t.idTipo;

-- Ver misiones con su objeto recompensa
SELECT m.Descripcion, o.Nombre AS Objeto
FROM Mision m
JOIN Objeto o ON m.idObjeto = o.idObjeto;

-- Ver luchas con entrenador y gimnasio
SELECT l.idLucha, e.Nombre, g.Nombre AS Gimnasio
FROM Lucha l
JOIN Entrenador e ON l.idEntrenador = e.idEntrenador
JOIN Gimnasio g ON l.idGimnasio = g.idGimnasio;