package PuchamonGris;
import java.util.Scanner;
import java.util.*;

public class Mundo3 {
    
    public void iniciarCombate(Puchamon puchaJugador) {
        Scanner scanner = new Scanner(System.in);
        PuchaEnemigo puchaEnemigo = new PuchaEnemigo(3, 55, "Squirtle");
        EntrenadorEnemigo entrenadorEnemigo = new EntrenadorEnemigo(3, "JP");
        
        int vidaJugador = puchaJugador.getVida();
        int vidaEnemigo = puchaEnemigo.getVidaPuchaEnemigo();
        int opcionCombate;
        
        System.out.println("\n====== EL BRONX - COMBATE ======");
        System.out.println("¡Te enfrentas a " + entrenadorEnemigo.getNombreEntrenadorEnemigo() + "!");
        System.out.println(puchaEnemigo.getNombrePuchaEnemigo() + " (Puchamon Enemigo) ha entrado en combate");
        System.out.println(puchaJugador.getNombrePuchamon() + " (Tu Puchamon) está listo\n");
        System.out.println("==================================\n");
        
        while(vidaJugador > 0 && vidaEnemigo > 0){
            System.out.println("\n======== ESTADO DE COMBATE =======");
            System.out.println("| " + puchaJugador.getNombrePuchamon() + " (Tu Puchamon)    HP: " + vidaJugador + "/" + puchaJugador.getVida());
            System.out.println("| " + puchaEnemigo.getNombrePuchaEnemigo() + " (Puchamon Enemigo)    HP: " + vidaEnemigo + "/" + puchaEnemigo.getVidaPuchaEnemigo());
            System.out.println("==================================\n");
            
            System.out.println("¿Qué ataque deseas usar?");
            System.out.println("1. Ataque Normal (30 daño + crítico 20%)");
            System.out.println("2. Ataque Especial (50 daño + crítico 10%)");
            System.out.println("3. Objeto curativo (+30 vida)");
            System.out.println("4. Huir");
            System.out.print("Elige opción: ");
            
            opcionCombate = scanner.nextInt();
            int danoInfligido = 0;
            
            switch (opcionCombate){
                case 1:
                    danoInfligido = 30;
                    System.out.println("\n" + puchaJugador.getNombrePuchamon() + " usa ¡Ataque Normal!");
                    System.out.println("Daño infligido: " + danoInfligido);
                    vidaEnemigo -= danoInfligido;
                    break;
                case 2:
                    Ataque ataque = new Ataque(2, "Ataque Especial", 50, "agua", 1);
                    danoInfligido = 50;
                    System.out.println("\n" + puchaJugador.getNombrePuchamon() + " usa ¡Ataque Especial!");
                    
                    if (ataque.CalcularCriticoEspecial()){
                        danoInfligido = danoInfligido * 2;
                        System.out.println("¡¡GOLPE CRÍTICO!!");
                    }
                    System.out.println("Daño infligido: " + danoInfligido);
                    vidaEnemigo -= danoInfligido;
                    break;
                case 3:
                    int curacion = 30;
                    vidaJugador = Math.min(vidaJugador + curacion, puchaJugador.getVida());
                    System.out.println("\n" + puchaJugador.getNombrePuchamon() + " se cura +30 HP");
                    break;
                case 4:
                    System.out.println("\n¡Has escapado del combate!");
                    return;
                default:
                    System.out.println("\nOpción no válida");
                    continue;
            }
            
            if(vidaEnemigo <= 0) break;
            
            System.out.println("\n" + puchaEnemigo.getNombrePuchaEnemigo() + " ataca...");
            int ataqueEnemigo = (int)(Math.random() * 2) + 1;
            int danoRecibido = 0;
            
            if(ataqueEnemigo == 1){
                danoRecibido = 32;
                System.out.println(puchaEnemigo.getNombrePuchaEnemigo() + " usa ¡Ataque Normal!");
            } else {
                danoRecibido = 45;
                if(Math.random() < 0.3){
                    danoRecibido *= 2;
                    System.out.println(puchaEnemigo.getNombrePuchaEnemigo() + " usa ¡Ataque Especial! ¡¡CRÍTICO!!");
                } else {
                    System.out.println(puchaEnemigo.getNombrePuchaEnemigo() + " usa ¡Ataque Especial!");
                }
            }
            System.out.println("Daño recibido: " + danoRecibido);
            vidaJugador -= danoRecibido;
        }
        
        System.out.println("\n===== RESULTADO DEL COMBATE =====");
        if(vidaJugador > 0){
            System.out.println("¡¡VICTORIA!!");
            System.out.println(puchaJugador.getNombrePuchamon() + " ha vencido a " + puchaEnemigo.getNombrePuchaEnemigo());
            System.out.println("¡Has ganado 700 exp y 400 pesos!");
        } else {
            System.out.println("¡¡DERROTA!!");
            System.out.println(puchaEnemigo.getNombrePuchaEnemigo() + " ha vencido a " + puchaJugador.getNombrePuchamon());
            System.out.println("Deberás intentarlo de nuevo...");
        }
        puchaJugador.setVida(vidaJugador);
        System.out.println("==================================\n");
        System.out.println("Presiona Enter para volver al menú...");
        scanner.nextLine();
    }
}
