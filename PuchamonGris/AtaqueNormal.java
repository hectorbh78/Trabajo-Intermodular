package PuchamonGris;

import java.util.*;

public class AtaqueNormal extends Ataque {

    public AtaqueNormal(String nombre, int damage, String TipoDamage) {
        super(damage, nombre, TipoDamage);
    }

    @Override
    public String getDescripcion() {
        return "Es un ataque normal";
    }
    
    @Override
    public boolean CalcularCritico(){
        Random rand = new Random();
        double chance = rand.nextDouble(); // Genera un número entre 0.0 y 1.0
        if (chance < 0.2) { // 20% de probabilidad de crítico
            return true; // El daño se duplica en caso de crítico
        } else {
            return false; // Daño normal si no es crítico
        }
    };

    
}