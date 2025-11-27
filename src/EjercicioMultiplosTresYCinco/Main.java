package EjercicioMultiplosTresYCinco;

public class Main {

    public static void main(String[] args) {

        int suma = 0;
        // Hacemos lo mismo que en el ejercicio anterior. Un for para recorrer todos los números hasta el 1000
        for (int i = 0; i < 1000; i++) {
            // Con un if, filtramos solo los que sean divisibles entre 3 y 5
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }

        System.out.println("Suma total = " + suma);
    }
}
