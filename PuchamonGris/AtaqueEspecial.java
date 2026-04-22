package PuchamonGris;

import java.util.*;

public class AtaqueEspecial extends Ataque{

    public AtaqueEspecial(){
       
    }

    @Override
    public String getDescripcion() {
        return "Ataque Especial: " + getnombre() + " - Daño: " + getdamage() + " - Tipo: " + getTipoDamage();
    }
    @Override
    public boolean CalcularCritico(){
        Random rand = new Random();
        double chance = rand.nextDouble(); // Genera un número entre 0.0 y 1.0
        if (chance < 0.4) { // 40% de probabilidad de crítico
            return true; // El daño se duplica en caso de crítico
        } else {
            return false; // Daño normal si no es crítico
        }
    }
}