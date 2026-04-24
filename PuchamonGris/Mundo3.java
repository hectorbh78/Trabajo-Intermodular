package PuchamonGris;

import java.util.Scanner;

// Clase Mundo3 (tercer mundo del juego)
public class Mundo3 {
    
    // Método para iniciar el combate en este mundo
    public void iniciarCombate(Puchamon puchaJugador) {
        
        Scanner scanner = new Scanner(System.in);

        // Creamos el Puchamon enemigo
        PuchaEnemigo puchaEnemigo = new PuchaEnemigo(3, 155, "Rayquaza");

        // Creamos el entrenador enemigo
        EntrenadorEnemigo entrenadorEnemigo = new EntrenadorEnemigo(3, "JP");
        
        // Vida inicial del jugador y del enemigo
        int vidaJugador = puchaJugador.getVida();
        int vidaEnemigo = puchaEnemigo.getVidaPuchaEnemigo();

        int opcionCombate;
        
        // Mensaje inicial del combate
        System.out.println("\n====== EL BRONX - COMBATE ======");
        System.out.println("¡Te enfrentas a " + entrenadorEnemigo.getNombreEntrenadorEnemigo() + "!");
        System.out.println(puchaEnemigo.getNombrePuchaEnemigo() + " ha entrado en combate");
        System.out.println(puchaJugador.getNombrePuchamon() + " está listo\n");
        
        // Bucle del combate (hasta que alguien pierda toda la vida)
        while(vidaJugador > 0 && vidaEnemigo > 0){
            
            // Mostrar estado del combate
            System.out.println("\n======== ESTADO DE COMBATE =======");
            System.out.println("| " + puchaJugador.getNombrePuchamon() + " HP: " + vidaJugador);
            System.out.println("| " + puchaEnemigo.getNombrePuchaEnemigo() + " HP: " + vidaEnemigo);
            System.out.println("==================================\n");
            
            // Menú de opciones del jugador
            System.out.println("¿Qué ataque deseas usar?");
            System.out.println("1. Ataque Normal (30 Atk + 20% Crit)");
            System.out.println("2. Ataque Especial (50 Atk + 10% Crit)");
            System.out.println("3. Objeto curativo (+30 PS)");
            System.out.println("4. Huir");
            System.out.print("Elige opción: ");
            
            opcionCombate = scanner.nextInt();
            int danoInfligido = 0;
            
            // Acciones del jugador
            switch (opcionCombate){
                case 1:
                    // Ataque normal
                    danoInfligido = 30;
                    System.out.println("Usas ataque normal");
                    vidaEnemigo -= danoInfligido;
                    break;

                case 2:
                    // Ataque especial con posible crítico
                    Ataque ataque = new Ataque(2, "Ataque Especial", 50, "agua", 1);
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
            System.out.println("\nTu atacas...");
            System.out.println("\nEl enemigo ataca...");
            
            int ataqueEnemigo = (int)(Math.random() * 2) + 1;
            int danoRecibido = 0;
            
            if(ataqueEnemigo == 1){
                // Ataque normal enemigo
                danoRecibido = 32;
                System.out.println("Ataque normal del enemigo");
            } else {
                // Ataque especial enemigo
                danoRecibido = 45;

                // Probabilidad de crítico
                if(Math.random() < 0.3){
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
            System.out.println("Has ganado el combate");
        } else {
            System.out.println("¡¡DERROTA!!");
            System.out.println("Has perdido el combate");
        }

        // Guardamos la vida final del jugador
        puchaJugador.setVida(vidaJugador);

        System.out.println("==================================\n");

        // Pausa antes de volver al menú
        System.out.println("Presiona Enter para volver al menú...");
        scanner.nextLine();
    }
}