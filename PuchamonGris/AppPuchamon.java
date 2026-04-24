package PuchamonGris;

// Importamos clases para la base de datos
import ConectarBBDDpuchamon.InventarioDAO;
import ConectarBBDDpuchamon.PruebaConexion;
import ConectarBBDDpuchamon.PuchamonDAO;
import java.awt.Desktop;
import java.io.File;
import java.net.URI;
import java.util.*;
import PuchamonGris.*;
import java.sql.*;


// Clase principal del programa
public class AppPuchamon {

    public static void main(String[] args) {
        int opcion;
        Scanner miEscaner= new Scanner(System.in); // Scanner para leer datos del usuario
        AppPuchamon app = new AppPuchamon(); // Creamos objeto de la app
        
        // Bucle del menú principal
        do
        {
            app.menu(); // Mostramos menú
            opcion= miEscaner.nextInt(); // Leemos opción

            switch (opcion){
                case 1:
                    jueguito(); // Empieza el juego
                    break;
                case 2:
                    app.mostrarVersion(); // Muestra versión
                    break;
                case 3:
                    System.out.println("Web");
                    
                    break;
                case 4:
                    System.out.println("Salir");
                    System.out.println("Gracias por jugar a las Puchas Aventuras");
                    break;
                default:
                    System.out.println("Opcion no valida"); // Control de error
            }

        } while (opcion != 3); // Se repite hasta salir
    }
    
    // Método que muestra el menú principal
    public void menu() {
        System.out.println("+------- Menu ------+");
        System.out.println("| 1. Jugar          |");
        System.out.println("| 2. Versión        |");
        System.out.println("| 3. WEB            |");
        System.out.println("| 4. Salir          |");
        System.out.println("+-------------------+");
    }

    // Método para mostrar la versión del juego
    public void mostrarVersion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n+==========================+");
        System.out.println("|      PUCHA ADVENTURE     |");
        System.out.println("|      Versión 1.0.0       |");
        System.out.println("+==========================+\n");
        System.out.println("Presiona Enter para volver al menú...");
        scanner.nextLine(); // Espera a que el usuario pulse enter
    }

    // Método para elegir un Puchamon
    public static Puchamon seleccionarPuchamon() {
        Scanner scanner = new Scanner(System.in);
        int opcionPucha;
        
        // Menú de selección
        System.out.println("\n+====== SELECCIONA TU PUCHAMON ======+");
        System.out.println("| 1. Lagasaur (Tipo Planta)            |");
        System.out.println("| 2. Jai (Tipo Acero)                  |");
        System.out.println("| 3. Krico (Tipo Agua)                 |");
        System.out.println("+====================================+");
        System.out.print("Elige tu Puchamon (1-3): ");
        
        opcionPucha = scanner.nextInt();
        Puchamon puchaSeleccionado = null;
        
        // Según la opción crea un Puchamon distinto
        switch(opcionPucha) {
            case 1:
                puchaSeleccionado = new Puchamon(1, "Lagasaur", 100, 1, 1);
                System.out.println("\n¡Has elegido a Lagasaur!");
                break;
            case 2:
                puchaSeleccionado = new Puchamon(2, "Jai", 90, 1, 1);
                System.out.println("\n¡Has elegido a Jai!");
                break;
            case 3:
                puchaSeleccionado = new Puchamon(3, "Krico", 97, 1, 1);
                System.out.println("\n¡Has elegido a Krico!");
                break;
            default:
                // Si mete algo mal, se asigna uno por defecto
                System.out.println("Opción no válida. Se ha asignado Lagasaur.");
                puchaSeleccionado = new Puchamon(1, "Lagasaur", 100, 1, 1);
        }
        
        return puchaSeleccionado; // Devuelve el Puchamon elegido
    }

    // Menú dentro del juego
    public static void menujuego(){
        System.out.println("+------- Menu ----------+");
        System.out.println("| 1. Selección Nivel    |");
        System.out.println("| 2. Inventario         |");
        System.out.println("| 3. Puchadex           |");
        System.out.println("| 4. Regalo Misterioso  |");
        System.out.println("| 5. Salir              |");
        System.out.println("+-----------------------+");
    }

    // Menú de mundos
    public static void menuMundos(){
        System.out.println("\n+========== MUNDOS ==========+");
        System.out.println("| 1. Parla Centro            |");
        System.out.println("| 2. Valde Moro              |");
        System.out.println("| 3. El Bronx                |");
        System.out.println("+============================+");
    }

    // Método principal del juego
    public static void jueguito(){
        int opcionjuego;
        Scanner miEscaner = new Scanner(System.in);

        Puchamon puchaJugador = seleccionarPuchamon(); // Elegimos personaje
        PuchamonDAO A1 = new PuchamonDAO(); // DAO para puchamon
        InventarioDAO Inven1 = new InventarioDAO(); // DAO para inventario
        
        // Bucle del menú del juego
        do
        {
            menujuego();
            opcionjuego = miEscaner.nextInt();

            switch (opcionjuego){
                case 1:
                    // Selección de mundo
                    menuMundos();
                    System.out.print("Escoge a que mundo quieres ir: ");
                    int opcionMundo = miEscaner.nextInt();

                    switch(opcionMundo){
                        case 1: 
                            System.out.println("Bienvenido a Parla Centro");
                            Mundo1 mundo1 = new Mundo1();
                            mundo1.iniciarCombate(puchaJugador); // Empieza combate
                            break;
                        case 2: 
                            System.out.println("Bienvenido a Valde Moro");
                            Mundo2 mundo2 = new Mundo2();
                            mundo2.iniciarCombate(puchaJugador);
                            break;
                        case 3:
                            System.out.println("Bienvenido a El Bronx");
                            Mundo3 mundo3 = new Mundo3();
                            mundo3.iniciarCombate(puchaJugador);
                            break;
                        default:
                            System.out.println("opcion incorrecta");
                    }
                    break;

                case 2:
                    // Mostrar inventario desde la base de datos
                    System.out.println("======= MI INVENTARIO =======");
                    System.out.println("(IdObjeto = 1) = Poción");
                    System.out.println("(IdObjeto = 2) = Super Poción");

                    try {
                        Connection conex = PruebaConexion.getConnection();
                        List<Inventario> inven = Inven1.selectInventario(conex);

                        if (inven == null || inven.isEmpty()) {
                            System.out.println(" El inventario está vacío en la base de datos.");
                        } else {
                            for (Inventario inv : inven) {
                                // Accedemos directamente a los getters para asegurar la impresión
                                System.out.println(inv);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Error al conectar o leer la tabla inventario: " + e.getMessage());
                    }
                    System.out.println("=============================\n");
                    break;
                case 3:
                    // Mostrar Puchadex (lista de puchamones)
                    System.out.println("Bienvenido a la Puchadex");

                    try{
                        Connection conex = PruebaConexion.getConnection();
                        List<Puchamon> puchamon = A1.selectPucha(conex);

                        for(Puchamon puch:puchamon){
                            System.out.println(puch);
                        }
                    

                    } catch(Exception e){
                        System.out.println("Error"); // Error básico
                    }
                    
                    break;

                case 4:
                    System.out.println("Bienvenido al Gachapon"); // Opción para entrar al gachapon
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while ( opcionjuego != 5); // Se repite hasta salir del juego
    }
}


/*
try {
                        // Ruta del archivo HTML
                        File htmlFile = new File("C:\\Users\\Alumno.DESKTOP-DI5KTUG\\Desktop\\Proyecto TFG\\Web\\index.html");

                        // Abrir en navegador
                        Desktop.getDesktop().browse(htmlFile.toURI());
                        System.out.println("Presiona cualquier numero");
                        opcion = miEscaner.nextInt();

                    } catch (Exception e) {
                        e.printStackTrace();
                    } */