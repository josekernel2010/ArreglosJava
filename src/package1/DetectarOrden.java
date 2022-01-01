package package1;

import java.util.Scanner;


public class DetectarOrden {
    public static void main(String[] args) {

        // variables boolean para comparar condiciones
        boolean ascent = false;
        boolean descent = false;

        int[] number = new int[4];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < number.length; i++) {
            System.out.println("Ingrese un número: ");
            number[i] = sc.nextInt();
        }

        // for con length -1 para no salir de rango en la
        // comparación del primero con el siguiente
        for(int i =0; i< number.length -1; i++){
            System.out.println("i = " + i);

            // condiciones de cambio a true
            if(number[i] < number[i+1]){
                descent = true;
            }
            if(number[i] > number[i+1]){
                ascent = true;
            }
        }

        // condiciones donde selecciona que tipo de arreglo es
        if(descent == true && ascent == true){
            System.out.println("Arreglo desordenado");
        }
        if(descent == false && ascent == false){
            System.out.println("Arreglo donde son todos iguales");
        }
        if(!descent && ascent){
            System.out.println("Arreglo descendente");
        }
        if(descent && ascent == false){
            System.out.println("Arreglo ascendente");
        }
    }
}
