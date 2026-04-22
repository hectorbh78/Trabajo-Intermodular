**Entrenador** (PK·idEntrenador, Nombre)

**Inventario** (PKFK·idEntrenador --> Entrenador, PKFK·idObjeto --> Objeto)

**Objeto** (PK·idObjeto, Nombre, Efecto)

**Mision** (PK·idMision, Descripcion, Recompensa, FK·idMundo --> Mundo, FK·idObjeto --> Objeto)

**Lucha** (PK·idLucha, Fecha, Tipo, FK·idEntrenador --> Entrenador, FK·idGimnasio --> Lucha)

**Ataque** (PK·idAtaque, Nombre, Daño, TipoDaño, FK·idTipo --> Tipo)

**Puchamon_Ataque** (PKFK·idPuch --> Puchamon, PKFK·idAtaque --> Ataque)

**Puchamon** (PK·idPuch, Nombre, Nivel, Vida, FK·idEntrenador --> Entrenador)

**TipoPuchamon** (PKFK·idPuch --> Puchamon, PKFK·idTipo --> Tipo)

**Tipo** (PK·idTipo, Nombre)

**Gimnasio** (PK·idGimnasio, Nombre, NivelRecomendado, FK·idMundo --> Mundo)

**Mundo** (PK·idMundo, Nombre, Region)


