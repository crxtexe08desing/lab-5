package main;

import modelo.Animal;
import modelo.Perro;
import modelo.Gato;

public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        miAnimal.hacerSonido(); // El animal hace un sonido.
        miPerro.hacerSonido();  // El perro ladra
        miGato.hacerSonido();   // El gato maúlla
    }
}
