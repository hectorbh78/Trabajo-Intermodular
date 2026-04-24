package PuchamonGris;

import java.sql.Connection;
import java.util.Scanner;

import ConectarBBDDpuchamon.InventarioDAO;
import ConectarBBDDpuchamon.PruebaConexion;

// Clase Mundo1 (segundo mundo del juego)
public class Mundo1 {
    
    // Método que inicia el combate en este mundo
    public void iniciarCombate(Puchamon puchaJugador) {

        InventarioDAO iven = new InventarioDAO();
        try {
            Connection conex = PruebaConexion.getConnection();
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        Scanner scanner = new Scanner(System.in);

        // Creamos el Puchamon enemigo
        PuchaEnemigo puchaEnemigo = new PuchaEnemigo(1, 105, "Squirtle");

        // Creamos el entrenador enemigo
        EntrenadorEnemigo entrenadorEnemigo = new EntrenadorEnemigo(1, "Hector");
        
        // Guardamos la vida inicial de ambos
        int vidaJugador = puchaJugador.getVida();
        int vidaEnemigo = puchaEnemigo.getVidaPuchaEnemigo();

        int opcionCombate;
        
        // Mensaje inicial del combate
        System.out.println("\n====== PARLA CENTRO - COMBATE ======");
        System.out.println("¡Te enfrentas a " + entrenadorEnemigo.getNombreEntrenadorEnemigo() + "!");
        System.out.println(puchaEnemigo.getNombrePuchaEnemigo() + " ha entrado en combate");
        System.out.println(puchaJugador.getNombrePuchamon() + " está listo\n");
        System.out.println("==================================\n");
        
        // Bucle del combate (hasta que alguien se quede sin vida)
        while(vidaJugador > 0 && vidaEnemigo > 0){
            
            // Mostrar estado actual
            System.out.println("\n======== ESTADO DE COMBATE =======");
            System.out.println("| " + puchaJugador.getNombrePuchamon() + " HP: " + vidaJugador+" |");
            System.out.println("| " + puchaEnemigo.getNombrePuchaEnemigo() + " HP: " + vidaEnemigo+" |");
            System.out.println("==================================\n");
            
            // Menú de acciones
            System.out.println("¿Qué ataque deseas usar?");
            System.out.println("1. Ataque Normal (30 Atk + 20% Crit)");
            System.out.println("2. Ataque Especial (50 Atk + 10% Crit)");
            System.out.println("3. Objeto curativo (+30 PS)");
            System.out.println("4. Huir");
            System.out.print("Elige opción: ");
            
            opcionCombate = scanner.nextInt();
            int danoInfligido = 0;
            
            // Turno del jugador
            switch (opcionCombate){
                case 1:
                    // Ataque normal
                    danoInfligido = 30;
                    System.out.println("Usas ataque normal");
                    vidaEnemigo -= danoInfligido;
                    break;

                case 2:
                    // Ataque especial con crítico posible
                    Ataque ataque = new Ataque(2, "Ataque Especial", 50, "fuego", 1);
                    danoInfligido = 50;

                    System.out.println("Usas ataque especial");

                    if (ataque.CalcularCriticoEspecial()){
                        danoInfligido = danoInfligido * 2;
                        System.out.println("¡¡GOLPE CRÍTICO!!");
                    }

                    vidaEnemigo -= danoInfligido;
                    break;

                case 3:
                    // Curación del jugador
                    int curacion = 30;
                    vidaJugador = Math.min(vidaJugador + curacion, puchaJugador.getVida());
                    System.out.println("Te curas +30 HP");
                    try{
                        Connection conex = PruebaConexion.getConnection();
                    iven.eliminiarInventario(conex,1,1);
                    } catch (Exception e) {
                        System.out.println("Error");
                    }


                    break;

                case 4:
                    // Huir del combate
                    System.out.println("¡Has escapado del combate!");
                    return;

                default:
                    System.out.println("Opción no válida");
                    continue;
            }
            
            // Si el enemigo muere, se termina el combate
            if(vidaEnemigo <= 0) break;
            
            // Turno del enemigo
            System.out.println("Tu atacas...");
            System.out.println("El enemigo ataca...");
            
            int ataqueEnemigo = (int)(Math.random() * 2) + 1;
            int danoRecibido = 0;
            
            if(ataqueEnemigo == 1){
                // Ataque normal enemigo
                danoRecibido = 28;
                System.out.println("Ataque normal del enemigo");
            } else {
                // Ataque especial enemigo
                danoRecibido = 40;

                // Probabilidad de crítico
                if(Math.random() < 0.1){ // 10% de probabilidad de crítico
                    danoRecibido *= 2;
                    System.out.println("¡¡CRÍTICO DEL ENEMIGO!!");
                } else {
                    System.out.println("Ataque especial del enemigo");
                }
            }

            // Se aplica el daño al jugador
            vidaJugador -= danoRecibido;
        }
        
        // Resultado final del combate
        System.out.println("\n===== RESULTADO DEL COMBATE =====");
        if(vidaJugador > 0){
            System.out.println("¡¡VICTORIA!!");
            
            // Función de evolución
            System.out.println("¡" + puchaJugador.getNombrePuchamon() + " está evolucionando!");
            if(puchaJugador.getNombrePuchamon().equals("Lagasaur")) {
                puchaJugador.setNombrePuchamon("Salasaur");
                puchaJugador.setVida(130);
            } else if(puchaJugador.getNombrePuchamon().equals("Jai")) {
                puchaJugador.setNombrePuchamon("Nava-Jazo");
                puchaJugador.setVida(110);
            } else if(puchaJugador.getNombrePuchamon().equals("Rico")) {
                puchaJugador.setNombrePuchamon("Krico");
                puchaJugador.setVida(124);
            }
            puchaJugador.setNivelPuchamon(25);
            vidaJugador = puchaJugador.getVida(); // Restaurar vida tras evolucionar
            System.out.println("¡Ahora es un " + puchaJugador.getNombrePuchamon() + " Nivel " + puchaJugador.getNivelPuchamon() + "!");

            // Función insertar objeto
            System.out.println("\n¡Has obtenido una Poción!");
            try {
                InventarioDAO i1 = new InventarioDAO();

                // Aquí llamamos al método del DAO para insertar el objeto
                Connection conex = PruebaConexion.getConnection();
                i1.insertarInventario(conex, 1, 1); 
                System.out.println("Sistema: El objeto ha sido guardado en tu inventario.");
            } catch (Exception e) {
                System.out.println("Error al actualizar la base de datos: " + e.getMessage());
            }
            System.out.println("==================================\n");
            
        } else {
            System.out.println("¡¡DERROTA!!");
        }
        puchaJugador.setVida(vidaJugador);
        if(vidaJugador > 0) {
            System.out.println("Presiona Enter para volver...");
            scanner.nextLine(); scanner.nextLine();
        }
    }
}
