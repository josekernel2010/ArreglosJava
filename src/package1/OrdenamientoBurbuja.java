package package1;

import java.util.Arrays;



public class OrdenamientoBurbuja {

    public static void    Burbuja(Object[] arreglo) {
        System.out.println("--------------------");
        System.out.println("ordenamiento burbuja");
        System.out.println(":: Método estatico ::");
        System.out.println("--------------------");
        int cont1 = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                // Utilizo [ Comparable ]
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0) {
                    //algoritmo de burbuja
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;

                }
                cont1++;

            }
        }
        System.out.println(cont1);

    }



    public static void main(String[] args) {


        //Arreglos Ordenamiento de burbuja

        System.out.println("----------------------------");
        System.out.println("::     Lista de String    ::");
        System.out.println("----------------------------");
        String[] productos = new String[7];

        productos[0] ="Casio watch";
        productos[1] ="Asus notebook";
        productos[2] ="Cargador samsung";
        productos[3] ="Pc gamer";
        productos[4] ="Hp laptop 1021";
        productos[5] ="Heroku pro";
        productos[6] ="Mac Pro Air";

        int a =0;
        for (String i: productos) {
            System.out.println("producto -> "+i);
            a++;

        }

        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("== Ordenamiento de burbuja ==");
        System.out.println("-----------------------------");

        long inicio1 = System.currentTimeMillis();
        /*
        int cont =0;
        for (int i = 0; i < productos.length;i++){
            for (int j = 0; j < productos.length ;j++){
                if ( productos[i].compareTo(productos[j]) < 0) {
                    //algoritmo de burbuja
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;

                }
                cont++;

            }
        }

        System.out.println("cont = " + cont);

         */

        Burbuja(productos);
        for (String s : productos) {
            System.out.println("\ts = " + s);
        }
        long fin1 = System.currentTimeMillis();
        System.out.println("Tiempo1: "+(fin1 - inicio1));



        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("== Ordenamiento de burbuja Optimizado ==");
        System.out.println("----------------------------------------");
        long inicio2 = System.currentTimeMillis();
        int cont1 =0;
        for (int i = 0; i < productos.length;i++){
            for (int j = 0; j < productos.length -1 -i;j++){
                if ( productos[j+1].compareTo(productos[j]) < 0) {
                    //algoritmo de burbuja
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;

                }
                cont1++;

            }
        }

        System.out.println("cont = " + cont1);
        for (String s : productos) {
            System.out.println("\ts = " + s);
        }
        long fin2 = System.currentTimeMillis();
        System.out.println("Tiempo2: "+(fin2 - inicio2));


        Integer[] num = new Integer[7];
        num[0] =41;
        num[1] =788;
        num[2] =15;
        num[3] =325;
        num[4] =1021;
        num[5] =15;
        num[6] =55;


        System.out.println("------------------------------------------");
        System.out.println("Ordenar un arreglo de enteros con burbuja ");
        System.out.println("------------------------------------------");

    /*

        int cont2 =0;
        for (int i = 0; i < num.length;i++){
            for (int j = 0; j < num.length -1 -i;j++){

                // casteo de int  a Integer para utilizar el método compareTo
                //aunque el ide siempre ofrece sugerencias para mejorar el código

                if ( ((Comparable) num[j+1]).compareTo(num[j]) < 0) {
                    //algoritmo de burbuja
                    int auxiliar = num[j];
                    num[j] = num[j+1];
                    num[j+1] = auxiliar;

                }
                cont2++;

            }
        }

    */


        Burbuja(num);
        for (int i: num) {
            System.out.println("i = " + i);
        }

    }
}
