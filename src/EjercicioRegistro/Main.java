package EjercicioRegistro;

public class Main {

    public static void main(String[] args) {

        long suma = 0;

        // Para resolver el ejercicio, hacemos un for simple con el que recorrer la lista de números.
        //Inicializamos en 1 para tener el primer impar, y aumentamos el iterador de 2 en 2, para saltarnos los pares.
        for (long i = 1; i<=901000; i+=2){
            // Para cada recorrido del for, sumamos lo que tenemos (la variable "suma") con el cuadrado del nuevo número de la lista.
            suma = suma + (i*i);
        }
        System.out.println("Suma: " + suma);
    }
}
