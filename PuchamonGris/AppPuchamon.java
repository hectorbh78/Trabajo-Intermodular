package PuchamonGris;
import java.util.Scanner;
import java.util.*;
import PuchamonGris.*;

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
                    app.menujuego();
                    
                    break;
                case 2:
                    System.out.println("Inventario");
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

    public static void menujuego(){
        System.out.println("+------- Menu ----------+");
        System.out.println("| 1. Selección Nivel    |");
        System.out.println("| 2. Inventario         |");
        System.out.println("| 3. Puchadex           |");
        System.out.println("| 4. Regalo Misterioso  |");
        System.out.println("| 5. Salir              |");
        System.out.println("+-----------------------+");

        
    }

    public void jueguito(){
        int opcionjuego;
        Scanner miEscaner= new Scanner(System.in);
        AppPuchamon app = new AppPuchamon();
        do
        {
            menujuego();
            opcionjuego = miEscaner.nextInt();
            switch (opcionjuego){
                case 1:
                    System.out.println("Escoge a que mundo quieres ir");
                    int opcionMundo = miEscaner.nextInt();
                    switch(opcionMundo){
                        case 1: 
                        System.out.println("bienvenido a parla centro");
                        int opcionGym = miEscaner.nextInt();
                        System.out.println("Es hora de combatir");

                        break;
                        case 2: 
                        System.out.println("bienvenido a valde moro");
                        opcionGym = miEscaner.nextInt();
                        System.out.println("Es hora de combatir");

                        break;
                        case 3:
                            System.out.println("bienvenido a el bronxs");
                        opcionGym = miEscaner.nextInt();
                        System.out.println("Es hora de combatir");
                        break;
                        default:
                            System.out.println("opcion incorrecta");
                    }
                    
                    break;
                case 2:
                    System.out.println("Inventario");
                    break;
                case 3:
                    System.out.println("Salir");
                    System.out.println("Gracias por jugar a las Puchas Advetnturas");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcionjuego != 3);
        
    }

    public void Combate1(){
        Scanner miEscaner= new Scanner(System.in);
        AppPuchamon app = new AppPuchamon();
        Puchamon pucha = new Puchamon("a", 1, 1, 1,"a","a");
        Entrenador entrenador = new Entrenador(1, "Leo");
        PuchaEnemigo puchaenemigo = new PuchaEnemigo(4, 40, "Jai");
        int opcionCombate;

        System.out.println("\n===== INICIO DEL COMBATE =====");
        System.out.println("¡Te enfrentas al Entrenador A!");


            // (TERMINAR CUANDO TENGAMOS LAS VARIABLES DE ENEMIGO)
            while (pucha.getVida() > 0 && puchaenemigo.getVidaPuchaEnemigo() > 0) {

            // Mostrar estado actual
            System.out.println("\n+====== ESTADO DE COMBATE ======+");
            System.out.println("| " + pucha.getNombrePuchamon() + " (Tuyo)    HP: " + pucha.getVida());
            System.out.println("| Charmander (Enemigo)    HP: " + puchaenemigo.getVidaPuchaEnemigo()); 
            System.out.println("+================================+\n");
            
            // Turno del jugador
            System.out.println("¿Qué ataque deseas usar?");
            System.out.println("1. Ataque Normal (30 daño)");
            System.out.println("2. Ataque Especial (50 daño + crítico 30%)");
            System.out.println("3. Objeto curativo (+30 vida)");
            System.out.println("4. Huir");
            System.out.print("Elige opción: ");

            opcionCombate = miEscaner.nextInt();
            int danoInfligido = 0;

            switch (opcionCombate){
                case 1:
                    danoInfligido = 30;
                    System.out.println("\n" + entrenador.getNombreEntrenador() + " usa ¡Ataque Normal!");
                    System.out.println("Daño infligido: " + danoInfligido);
                    puchaenemigo.getVidaPuchaEnemigo() -= danoInfligido;
                    break;
                case 2:
                    AtaqueEspecial ataque = new AtaqueEspecial("Ataque Especial", 50, "agua");
                    danoInfligido = 50;
                    System.out.println("\n" + entrenador.getNombreEntrenador() + " usa ¡Ataque Especial!");
                    
                    if (ataque.CalcularCritico()){
                        danoInfligido = danoInfligido * 2;
                        System.out.println("¡¡GOLPE CRÍTICO!!");
                    }
                    System.out.println("Daño infligido: " + danoInfligido);
                    puchaenemigo.getVidaPuchaEnemigo() -= danoInfligido;
                    break;
                case 3:
                    int curacion = 30;
                    pucha.getVida = Math.min(pucha.getVida + curacion);
                    System.out.println("\n" + entrenador.getNombreEntrenador() + " se cura +30 HP");
                    break;
                case 4:
                    System.out.println("\n¡Has escapado del combate!");
                    return;
                default:
                    System.out.println("\nOpción no válida");
                    continue;
            }
        }
    }
}

