package package1;


import java.util.Arrays;
import java.util.Collections;

public class ArreglosForInverso {

    public static void main(String[] args) {


        String[] productos = new String[7];

        productos[0] ="Casio watch";
        productos[1] ="Asus notebook";
        productos[2] ="Cargador samsung";
        productos[3] ="Pc gamer";
        productos[4] ="Hp laptop 1021";
        productos[5] ="Heroku pro";
        productos[6] ="Mac Pro Air";

        System.out.println("----------------------");
        System.out.println("== for de reversa 1 ==");
        System.out.println("----------------------");
        //primer método de reversa
        int cont = 0;
        for(String i : productos){
            int a =productos.length - cont;
            System.out.println(productos[(a)-1]);
            cont++;
        }

        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println("== for de reversa 2 con r =(productos.length ) - (i+1); ==");
        System.out.println("----------------------------------------------------------");
        for (int i = 0 ; i < productos.length ;i++){
            int r =(productos.length ) - (i+1);
            //System.out.println((productos.length) -(i+1));
            System.out.println(productos[r]);

        }


        //reversa con colecciones y Arrays as list
        Collections.reverse(Arrays.asList(productos));
        
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("== reversa 3 con Collections ==");
        System.out.println("-------------------------------");
        for (String i:productos) {
            System.out.println(i);
        }

    }


}
