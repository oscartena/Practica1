/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

/**
 *
 * @author oscar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Utilidades.rellenarArrayAleatorio(numeros);
        boolean noPrimo;

        long startTime = System.nanoTime();

        for (int n : numeros) {
            noPrimo = Utilidades.naive(n);
            if (noPrimo) {
                System.out.println(n + " no es primo");
            } else {
                System.out.println(n + " es primo");
            }

        }
        long endTime = System.nanoTime();
        
        long elapsedTimeNanos = endTime - startTime;
        long elapsedTimeMillis = elapsedTimeNanos / 1_000_000;
        long elapsedTimeSeconds = elapsedTimeMillis / 1_000;
        
        System.out.println("Tiempo transcurrido en nanosegundos: " + elapsedTimeNanos);
        System.out.println("Tiempo transcurrido en milisegundos: " + elapsedTimeMillis);
        System.out.println("Tiempo transcurrido en segundos: " + elapsedTimeSeconds);
    }

}
