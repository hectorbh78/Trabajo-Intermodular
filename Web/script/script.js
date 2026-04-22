// Elementos principales
let contenedor = null;
let modoOscuroBtn = null;
let inputBusqueda = null;
let pokemones = [];

// Esperar a que el DOM esté completamente listo
if (document.readyState === 'loading') {
    document.addEventListener('DOMContentLoaded', inicializar);
} else {
    inicializar();
}

function inicializar() {
    // Obtener elementos
    contenedor = document.getElementById("catalog");
    modoOscuroBtn = document.getElementById("modoOscuro");
    inputBusqueda = document.getElementById("buscador");

    // Configurar modo oscuro
    if (modoOscuroBtn) {
        if (localStorage.getItem("modoOscuro") === "true") {
            document.body.classList.add("dark-mode");
        }
        actualizarBotonModo();
        modoOscuroBtn.addEventListener("click", alternarModoOscuro);
    }

    // Configurar buscador
    if (inputBusqueda) {
        inputBusqueda.addEventListener("input", buscar);
    }

    // Cargar datos
    cargarXML();
}

function cargarXML() {
    if (!contenedor) return;
    
    fetch("data/data.xml")
        .then(res => res.text())
        .then(xmlTexto => procesarXML(xmlTexto))
        .catch(error => {
            console.error("Error cargando XML:", error);
            if (contenedor) {
                contenedor.innerHTML = "<p>Error cargando datos</p>";
            }
        });
}

function procesarXML(xmlTexto) {
    try {
        let parser = new DOMParser();
        let xml = parser.parseFromString(xmlTexto, "application/xml");
        
        // Verificar si hay error de parseo
        if (xml.getElementsByTagName("parsererror").length > 0) {
            throw new Error("XML parse error");
        }

        let lista = xml.getElementsByTagName("pokemon");
        pokemones = [];

        for (let i = 0; i < lista.length; i++) {
            let nodo = lista[i];
            let poke = {
                id: nodo.getAttribute("id") || "",
                imagen: nodo.getElementsByTagName("imagen")[0]?.getAttribute("src") || "",
                numero: nodo.getElementsByTagName("numeroPokedex")[0]?.textContent || "",
                nombre: nodo.getElementsByTagName("nombre")[0]?.textContent || "",
                tipo1: nodo.getElementsByTagName("tipo1")[0]?.textContent || "",
                tipo2: nodo.getElementsByTagName("tipo2")[0]?.textContent || null
            };
            pokemones.push(poke);
        }

        renderPokemons(pokemones);
    } catch (error) {
        console.error("Error procesando XML:", error);
        if (contenedor) {
            contenedor.innerHTML = "<p>Error procesando datos</p>";
        }
    }
}

function actualizarBotonModo() {
    if (!modoOscuroBtn) return;
    if (document.body.classList.contains("dark-mode")) {
        modoOscuroBtn.textContent = "☀️";
    } else {
        modoOscuroBtn.textContent = "🌙";
    }
}

function alternarModoOscuro() {
    document.body.classList.toggle("dark-mode");
    localStorage.setItem("modoOscuro", document.body.classList.contains("dark-mode"));
    actualizarBotonModo();
}

function renderPokemons(lista) {
    if (!contenedor) return;
    
    contenedor.innerHTML = "";

    if (!lista || lista.length === 0) {
        contenedor.innerHTML = "<p>No hay datos</p>";
        return;
    }

    lista.forEach(p => {
        let containerClass = p.nombre === 'Dragasaur' ? 'image-container dragasaur-container' : p.nombre === 'Salasaur' ? 'image-container salasaur-container' : p.nombre === 'Bragasaur' ? 'image-container bulbasaur-small' : p.nombre === 'Charmeleon' ? 'image-container charmeleon-container' : 'image-container';
        let html = `
            <article class="cartas">
                <div class="${containerClass}">
                    <img src="${p.imagen}" alt="${p.nombre}">
                </div>
                <div class="info-container">
                    ${p.numero ? `<p class="pokemon-number">${p.numero}</p>` : ""}
                    <h2 class="pokemon-name">${p.nombre}</h2>
                    ${p.tipo1 ? `
                        <div class="ContenedorTipo">
                            <span class="tipo ${p.tipo1.toLowerCase()}">${p.tipo1}</span>
                            ${p.tipo2 ? `<span class="tipo ${p.tipo2.toLowerCase()}">${p.tipo2}</span>` : ""}
                        </div>
                    ` : ""}
                </div>
            </article>
        `;
        contenedor.innerHTML += html;
    });
}

function buscar(e) {
    if (!inputBusqueda) return;
    
    const texto = e.target.value.toLowerCase();
    const filtrados = pokemones.filter(p => {
        return p.nombre.toLowerCase().includes(texto) ||
               p.tipo1.toLowerCase().includes(texto) ||
               (p.tipo2 && p.tipo2.toLowerCase().includes(texto));
    });
    
    renderPokemons(filtrados);
}
