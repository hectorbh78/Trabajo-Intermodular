# 🦖 Puchamon Adventure

> **¡Bienvenido al mundo de los Puchamones!**  
> Una aventura de consola desarrollada en **Java**, donde los entrenadores se enfrentan en combates estratégicos contra la máquina para demostrar quién es el mejor.

---

# 🎮 Descripción

**Puchamon Adventure** es un videojuego en consola basado en **combates por turnos**, inspirado en los clásicos juegos de criaturas coleccionables.

El jugador deberá:

- 🐾 Elegir a sus Puchamones  
- ⚔️ Usar ataques estratégicamente  
- 🤖 Derrotar a la IA enemiga  
- 🏆 Convertirse en el mejor entrenador  

---

# 🏗️ Arquitectura del Proyecto

El proyecto sigue los principios de **Programación Orientada a Objetos (POO)**, manteniendo una estructura:

- ✅ Limpia  
- ✅ Modular  
- ✅ Escalable  
- ✅ Fácil de mantener  

---

# 📦 Estructura General

| Capa | Descripción |
|------|-------------|
| 🧬 **Entidades (Modelos)** | Representan el dominio principal: `Puchamon`, `Entrenador`, `Movimiento`. |
| ⚙️ **Lógica del Juego** | Gestiona combates, turnos, daño y decisiones de la IA. |
| 🖥️ **Interfaz de Usuario** | Sistema por consola usando `Scanner` para interactuar con el jugador. |

---

# 📊 Diagrama de Clases

```text
Entrenador
 ├── nombre
 ├── lista<Puchamon>
 ├── Inventario
     ├── Objetos


Puchamon
 ├── nombre
 ├── vida
 ├── ataque
 ├── lista<Movimiento>

Mundo
 ├── nombre
 ├── Gimnasio
```
---

# 🔗 Relaciones del Sistema

- 🧑‍🏫 **Entrenador** contiene una colección de **Puchamones**  
- 🦖 **Puchamon** posee varios **Movimientos**  
- ⚔️ **Movimiento** define el daño y comportamiento del ataque  

---

# 🚀 Mejora de Programación (MPO)

El proyecto ha sido mejorado pensando en:

- 📈 **Escalabilidad**  
- 🧩 **Polimorfismo**  
- 🧼 **Código limpio**  
- 🔄 **Reutilización**  

---

# ✅ Objetivos de la Mejora

- Simplificar la lógica interna del juego  
- Facilitar la creación de nuevos Puchamones  
- Añadir ataques sin modificar el motor principal  
- Mantener una estructura ordenada  
- Permitir crecimiento futuro del proyecto  

---

# 💡 Resultado Final

Gracias a esta mejora, el sistema puede evolucionar fácilmente añadiendo nuevo contenido de forma **rápida**, **sencilla** y **ordenada**.

---

# 🛠️ Tecnologías Utilizadas

| Tecnología | Uso |
|-----------|-----|
| ☕ **Java JDK 17+** | Lenguaje principal |
| 💻 **Visual Studio Code** | Entorno de desarrollo |
| 🌿 **Git** | Control de versiones |
| 🖥️ **CLI** | Interfaz por línea de comandos |

---

# 👨‍💻 Autores

Proyecto desarrollado por:

- **Leo**  
- **Rubén**  
- **Héctor**  
- **Juan Pablo**

---

# 📚 Trabajo Académico

Desarrollado como parte del **Trabajo Intermodular**.

---

# ⭐ Futuras Mejoras

- 🎨 Interfaz gráfica  
- 🌍 Modo multijugador online  
- 🐉 Nuevos Puchamones  
- ⚔️ Más tipos de ataques  
- 💾 Sistema de guardado  

---

# 🏆 ¡Prepárate para la aventura!

> **¿Tienes lo necesario para convertirte en el mejor entrenador Puchamon?**

---
