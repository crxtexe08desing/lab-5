package main;

import modelo.Circulo;
import modelo.Figura;
import modelo.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(4, 6),
            new Circulo(2.5),
            new Rectangulo(10, 3)
        };

        for (int i = 0; i < figuras.length; i++) {
            System.out.printf("Figura %d (%s) -> Área: %.2f%n",
                    i + 1, figuras[i].getClass().getSimpleName(), figuras[i].calcularArea());
        }
    }
}
