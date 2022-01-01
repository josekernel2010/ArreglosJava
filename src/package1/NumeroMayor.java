package package1;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {

        int[] number = new int[5];
        Scanner s = new Scanner(System.in);
        
        
        for (int i =0; i< number.length; i++){
            System.out.println("Ingrese un número: ");
            number[i] = s.nextInt();
        }
        int aux = 0;
        for(int i: number){
            System.out.println("i = " + i);

            // función de Math max que opera un ternario  (aux >= i)? aux : i;
            aux = Math.max(aux, i);
        }
        System.out.println("el valor máximo es = " + aux);
    }
}
