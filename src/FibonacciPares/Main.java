package FibonacciPares;

public class Main {
    public static void main(String[] args) {

        // La secuencia de Fibonacci consiste en obtener un número, sumando los dos anteriores
        int sumatoripar = 0;
        // Éste va a ser nuestro número anterior al actual
        int anterior = 1;
        // Y éste va a ser el actual, al que sumaremos el anterior para obvtener el número nuevo de la serie. Empezamos
        // directamente con el 2, ya que la secuencia 0, 1, 1 no nos da ningún par.
        int actual = 2;

        // Hacemos un bucle while con el que comprobar que el número actual sea divisible entre 2 y con el que ir actualizando
        // dicho número.
        while (actual <= 4000000) {
            // Aquí la comprobación par. Si lo es, se sumatoripar a nuestro sumatoriopar.
            if (actual % 2 == 0) {
                sumatoripar += actual;
            }
            // Ahora tenemos que castear nuestros números, para cambiarles los valores. El valor "nuevo" va a servir simplemente
            // de puente para hacer el casteo y poder actualizar el valor del actual.

            // nuevo va a ser nuestro actual dos pasos más alante, y lo obtenemos sumando el actual, y el anterior.
            int nuevo = anterior + actual;
            // el número que antes era el anterior, en la siguiente vuelta del bucle, será el que en éste momento es el actual, así que
            // lo casteamos para darle el nuevo valor.
            anterior = actual;
            // para terminar, el número "actual" de nuestra siguiente vuelta del bucle, lo casteamos con el "nuevo" para actualizar su valor.
            actual = nuevo;
        }
        System.out.println("La sumatoripar de los números pares de la secuencia de fibonacci menores o iguales anterior 4.000.000 es " + sumatoripar);
    }
}
