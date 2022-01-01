package package1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ArraysHelper {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] ="Casio watch";
        productos[1] ="Asus notebook";
        productos[2] ="Cargador samsung";
        productos[3] ="Pc gamer";
        productos[4] ="Hp laptop 1021";
        productos[5] ="Heroku pro";
        productos[6] ="Mac Pro Air";

        String a = productos[0];
        String b = productos[1];
        String c = productos[2];
        String d = productos[3];
        String e = productos[4];
        String f = productos[5];
        String g = productos[6];


        //Arreglos de ordenamiento con sort
        Arrays.sort(productos);


        System.out.println("------------------------------------");
        System.out.println("Ordenando lista de palabras con sort");
        System.out.println("------------------------------------");
        for(String i :productos){
            System.out.println("Producto : "+i);
        }


        int[] num = new int[5];
        num[0] = 142;
        num[1] = 840;
        num[2] = 5;
        num[3] = 45;
        num[4] = 548;
        System.out.println("------------------");
        System.out.println(":: Lista de num ::");
        System.out.println("------------------");
        for(int i: num){
            System.out.println("i = " + i);
        }


        //Arreglos de ordenamiento con sort
        Arrays.sort(num);

        
        //Creo un nuevo arreglo para convertir el pasar num a String
        ArrayList<String> num1 = new ArrayList<>();
        //num1.add(Arrays.toString(num));
        System.out.println("-------------------------------------------------------");
        System.out.println("Agregando elementos de num a num1 y pasándolos a String");
        System.out.println("-------------------------------------------------------");
        for (int i: num) {
            num1.add(Integer.toString(i));
            System.out.println("i = " + i);
        }

        System.out.println("num1 = " + num1);

        
        Collections.reverse(num1);
        System.out.println("---------------------------------------------");
        System.out.println("Lista num1 en reversa con Collections.reverse");
        System.out.println("---------------------------------------------");
        
        for(String i : num1){
            System.out.println("Los números som : "+i);
        }
    }
}
