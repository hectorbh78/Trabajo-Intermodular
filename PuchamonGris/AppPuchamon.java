package PuchamonGris;
import ConectarBBDDpuchamon.InventarioDAO;
import ConectarBBDDpuchamon.PruebaConexion;
import ConectarBBDDpuchamon.PuchamonDAO;

import java.util.*;
import PuchamonGris.*;
import java.sql.*;

public class AppPuchamon {
    public static void main(String[] args) {
        int opcion;
        Scanner miEscaner= new Scanner(System.in);
        AppPuchamon app = new AppPuchamon();
        
        do
        {
            app.menu();
            opcion= miEscaner.nextInt();
            switch (opcion){
                case 1:
                    app.jueguito();
                    
                    break;
                case 2:
                    app.mostrarVersion();
                    break;
                case 3:
                    System.out.println("Salir");
                    System.out.println("Gracias por jugar a las Puchas Aventuras");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 3);
    }
    
    public void menu() {
        System.out.println("+------- Menu ------+");
        System.out.println("| 1. Jugar          |");
        System.out.println("| 2. Versión        |");
        System.out.println("| 3. Salir          |");
        System.out.println("+-------------------+");
    }

    public void mostrarVersion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n+==========================+");
        System.out.println("|      PUCHA ADVENTURE      |");
        System.out.println("|      Versión 1.0.0        |");
        System.out.println("+==========================+\n");
        System.out.println("Presiona Enter para volver al menú...");
        scanner.nextLine();
    }

    public Puchamon seleccionarPuchamon() {
        Scanner scanner = new Scanner(System.in);
        int opcionPucha;
        
        System.out.println("\n+====== SELECCIONA TU PUCHAMON ======+");
        System.out.println("| 1. Lagasaur (Tipo Planta)            |");
        System.out.println("| 2. Jai (Tipo Acero)                  |");
        System.out.println("| 3. Krico (Tipo Agua)                 |");
        System.out.println("+====================================+");
        System.out.print("Elige tu Puchamon (1-3): ");
        
        opcionPucha = scanner.nextInt();
        Puchamon puchaSeleccionado = null;
        
        switch(opcionPucha) {
            case 1:
                puchaSeleccionado = new Puchamon(1, "Lagasaur", 100, 1, 1);
                System.out.println("\n¡Has elegido a Lagasaur! ¡Un fuerte Puchamon de tipo Planta!");
                break;
            case 2:
                puchaSeleccionado = new Puchamon(2, "Jai", 300, 1, 1);
                System.out.println("\n¡Has elegido a Jai! ¡Un gran Puchamon de tipo Acero!");
                break;
            case 3:
                puchaSeleccionado = new Puchamon(3, "Krico", 70, 1, 1);
                System.out.println("\n¡Has elegido a Krico! ¡Un agresivo Puchamon de tipo Agua!");
                break;
            default:
                System.out.println("Opción no válida. Se ha asignado Lagasaur por defecto.");
                puchaSeleccionado = new Puchamon(1, "Lagasaur", 100, 1, 1);
        }
        
        return puchaSeleccionado;
    }

    public static void menujuego(){
        System.out.println("+------- Menu ----------+");
        System.out.println("| 1. Selección Nivel    |");
        System.out.println("| 2. Inventario         |");
        System.out.println("| 3. Puchadex           |");
        System.out.println("| 4. Regalo Misterioso  |");
        System.out.println("| 5. Salir              |");
        System.out.println("+-----------------------+");
    }

    public static void menuMundos(){
        System.out.println("\n+========== MUNDOS ==========+");
        System.out.println("| 1. Parla Centro            |");
        System.out.println("| 2. Valde Moro              |");
        System.out.println("| 3. El Bronx                |");
        System.out.println("+============================+");
    }

    public void jueguito(){
        int opcionjuego;
        Scanner miEscaner = new Scanner(System.in);
        Puchamon puchaJugador = seleccionarPuchamon();
        PuchamonDAO A1 = new PuchamonDAO();
        InventarioDAO Inven1 = new InventarioDAO();
       
        do
        {
            menujuego();
            opcionjuego = miEscaner.nextInt();
            switch (opcionjuego){
                case 1:
                    menuMundos();
                    System.out.print("Escoge a que mundo quieres ir: ");
                    int opcionMundo = miEscaner.nextInt();
                    switch(opcionMundo){
                        case 1: 
                            System.out.println("Bienvenido a Parla Centro");
                            System.out.println("Es hora de combatir");
                            Mundo1 mundo1 = new Mundo1();
                            mundo1.iniciarCombate(puchaJugador);
                            break;
                        case 2: 
                            System.out.println("Bienvenido a Valde Moro");
                            System.out.println("Es hora de combatir");
                            Mundo2 mundo2 = new Mundo2();
                            mundo2.iniciarCombate(puchaJugador);
                            break;
                        case 3:
                            System.out.println("Bienvenido a El Bronx");
                            System.out.println("Es hora de combatir");
                            Mundo3 mundo3 = new Mundo3();
                            mundo3.iniciarCombate(puchaJugador);
                            break;
                        default:
                            System.out.println("opcion incorrecta");
                    }
                    
                    break;
                case 2:
                    System.out.println("Inventario");
                    System.out.println("Id objeto 1 = pocion normal");
                    System.out.println("Id objeto 2 = pocion Super Pocion");
                    try{
                        Connection conex = PruebaConexion.getConnection();

                        List<Inventario> inven = Inven1.selectInventario(conex);
                        for(Inventario Inven :inven){
                            System.out.println(Inven);
                        }
                    } catch(Exception e){
                            System.out.println("e");
                        }
                    break;
                case 3:
                    System.out.println("Bienvenido a la Puchadex");

                    try{

                        Connection conex = PruebaConexion.getConnection();

                        List<Puchamon> puchamon = A1.selectPucha(conex);
                        for(Puchamon puch:puchamon){
                            System.out.println(puch);
                        }

                        } catch(Exception e){
                            System.out.println("a");
                        }
                    break;
                case 4:
                    System.out.println("Bienvenido al Gachapon");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while ( opcionjuego != 5);
        
    }
}