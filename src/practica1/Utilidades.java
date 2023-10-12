/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

import java.util.Random;

/**
 *
 * @author oscar
 */
public class Utilidades {
    public static void rellenarArrayAleatorio(int[] array){
        Random r = new Random();
        int maxValor = Integer.MAX_VALUE;
        int minValor = (int)(maxValor*0.9);
        
        for(int i=0; i<array.length; i++){
            array[i] = r.nextInt(maxValor - minValor + 1) + minValor;
        }
    }
    
    public static boolean naive(int n){
        for (int i=n-1;i>=2;i--){
            if(n % i==0){
                return false;
            }
        }
        return true;
    }
}
