CREATE DATABASE DBPuchamon;
USE DBPuchamon;

-- Tabla Mundo
CREATE TABLE Mundo (
    idMundo INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50),
    Region VARCHAR(50)
);

-- Tabla Tipo
CREATE TABLE Tipo (
    idTipo INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50)
);

-- Tabla Entrenador
CREATE TABLE Entrenador (
    idEntrenador INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50)
);

-- Tabla Objeto
CREATE TABLE Objeto (
    idObjeto INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50),
    Efecto VARCHAR(100),
    idMision INT
);

-- Tabla Gimnasio
CREATE TABLE Gimnasio (
    idGimnasio INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50),
    NivelRecomendado INT,
    idMundo INT,
    FOREIGN KEY (idMundo) REFERENCES Mundo(idMundo)
);

-- Tabla Mision (sin FK a Objeto aún por dependencia circular)
CREATE TABLE Mision (
    idMision INT AUTO_INCREMENT PRIMARY KEY,
    Descripcion VARCHAR(100),
    Recompensa VARCHAR(50),
    idMundo INT,
    idObjeto INT,
    FOREIGN KEY (idMundo) REFERENCES Mundo(idMundo),
    FOREIGN KEY (idObjeto) REFERENCES Objeto(idObjeto)
);

-- Tabla Inventario (N:M)
CREATE TABLE Inventario (
    idEntrenador INT,
    idObjeto INT,
    numObjetos INT,
    PRIMARY KEY (idEntrenador, idObjeto),
    FOREIGN KEY (idEntrenador) REFERENCES Entrenador(idEntrenador),
    FOREIGN KEY (idObjeto) REFERENCES Objeto(idObjeto)
);

-- Tabla Ataque
CREATE TABLE Ataque (
    idAtaque INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50),
    Daño INT,
    TipoDaño VARCHAR(50),
    idTipo INT,
    FOREIGN KEY (idTipo) REFERENCES Tipo(idTipo)
);

-- Tabla Puchamon 
CREATE TABLE Puchamon (
    idPuch INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50),
    Nivel INT,
    Vida INT,
    idEntrenador INT,
    FOREIGN KEY (idEntrenador) REFERENCES Entrenador(idEntrenador)
);

-- Tabla TipoPuchamon (N:M)
CREATE TABLE TipoPuchamon (
    idPuch INT,
    idTipo INT,
    idTipo2 INT,
    PRIMARY KEY (idPuch, idTipo),
    FOREIGN KEY (idPuch) REFERENCES Puchamon(idPuch),
    FOREIGN KEY (idTipo) REFERENCES Tipo(idTipo)
);

-- Tabla Lucha
CREATE TABLE Lucha (
    idLucha INT AUTO_INCREMENT PRIMARY KEY,
    Fecha DATE,
    Tipo VARCHAR(50),
    idEntrenador INT,
    idGimnasio INT,
    FOREIGN KEY (idEntrenador) REFERENCES Entrenador(idEntrenador),
    FOREIGN KEY (idGimnasio) REFERENCES Gimnasio(idGimnasio)
);

CREATE TABLE Puchamon_Ataque (
    idPuch INT,
    idAtaque INT,
    idAtaque2 INT,
    PRIMARY KEY (idPuch, idAtaque),
    FOREIGN KEY (idPuch) REFERENCES Puchamon(idPuch),
    FOREIGN KEY (idAtaque) REFERENCES Ataque(idAtaque)
);
