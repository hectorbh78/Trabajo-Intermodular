package PuchamonGris;

import java.sql.Connection;
import java.util.Scanner;

import ConectarBBDDpuchamon.InventarioDAO;
import ConectarBBDDpuchamon.PruebaConexion;

public class Mundo1 {
    public void iniciarCombate(Puchamon puchaJugador) {
        Scanner scanner = new Scanner(System.in);
        PuchaEnemigo puchaEnemigo = new PuchaEnemigo(1, 105, "Squirtle");
        EntrenadorEnemigo entrenadorEnemigo = new EntrenadorEnemigo(1, "Hector");
        
        int vidaJugador = puchaJugador.getVida();
        int vidaEnemigo = puchaEnemigo.getVidaPuchaEnemigo();
        int opcionCombate;
        
        System.out.println("\n====== PARLA CENTRO - COMBATE ======");
        System.out.println("¡Te enfrentas a " + entrenadorEnemigo.getNombreEntrenadorEnemigo() + "!");
        System.out.println(puchaEnemigo.getNombrePuchaEnemigo() + " ha entrado en combate");
        System.out.println(puchaJugador.getNombrePuchamon() + " está listo\n");
        
        while(vidaJugador > 0 && vidaEnemigo > 0){
            System.out.println("\n======== ESTADO DE COMBATE =======");
            System.out.println("| " + puchaJugador.getNombrePuchamon() + " HP: " + vidaJugador);
            System.out.println("| " + puchaEnemigo.getNombrePuchaEnemigo() + " HP: " + vidaEnemigo);
            System.out.println("==================================\n");
            
            System.out.println("¿Qué ataque deseas usar?");
            System.out.println("1. Ataque Normal (30 Atk + 20% Crit)");
            System.out.println("2. Ataque Especial (50 Atk + 10% Crit)");
            System.out.println("3. Objeto curativo (+30 PS)");
            System.out.println("4. Huir");
            opcionCombate = scanner.nextInt();
            
            int danoInfligido = 0;
            switch (opcionCombate){
                case 1: danoInfligido = 30; vidaEnemigo -= danoInfligido; break;
                case 2: danoInfligido = 50; vidaEnemigo -= danoInfligido; break;
                case 3: vidaJugador = Math.min(vidaJugador + 30, puchaJugador.getVida()); break;
                case 4: return;
            }
            
            if(vidaEnemigo <= 0) break;
            
            System.out.println("\nTu atacas...");
            System.out.println("\nEl enemigo ataca...");
            vidaJugador -= 25;
        }
        
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
                Connection conex = PruebaConexion.getConnection();
                InventarioDAO i1 = new InventarioDAO();
                
                // Aquí llamamos al método del DAO para insertar el objeto
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
        System.out.println("Presiona Enter para volver...");
        scanner.nextLine(); scanner.nextLine();
        
    }
}