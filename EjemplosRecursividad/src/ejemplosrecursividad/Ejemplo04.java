/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package ejemplosrecursividad;

public class Ejemplo04 {

    public static void main(String[] args) {
        
        System.out.printf("%.2f\n", factorial(5));
    }

    public static double factorial(double numero) {
        if (numero <= 1) { // aquí se evalua el caso base
            return 1; // 0! = 1 
                      // 1! = 1
        } else { 
            // paso recursivo
            // numero = numero - 1 
            return numero * factorial(numero - 1);
        }
    }

}
