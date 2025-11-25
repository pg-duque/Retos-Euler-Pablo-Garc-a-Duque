package EjercicioRegistro;

public class Main {

    public static void main(String[] args) {

        long suma = 0;

        for (long i = 1; i<=901000; i+=2){
            suma = suma + (i*i);
        }
        System.out.println("Suma: " + suma);
    }
}
