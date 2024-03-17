package aplicacion;

import mates.Matematicas;

public class Principal {

    public static void main(String[] args) {
        int pasos = 1000000; // Número de puntos a generar para la aproximación.
        double pi = Matematicas.generarNumeroPiLambda(pasos);
        System.out.println("La aproximación de PI es: " + pi);
    }
}

