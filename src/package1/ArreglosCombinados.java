package package1;

public class ArreglosCombinados {

    public static void main(String[] args) {


        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        System.out.println("-------------");
        System.out.println("Arreglo de a ");
        System.out.println("-------------");

        for (int i = 0; i < b.length; i++) {
            a[i] = i + 1;
        System.out.println("a = " + a[i]);
    }
        System.out.println("-------------");
        System.out.println("Arreglo de b ");
        System.out.println("-------------");

        for (int i = 0; i < b.length; i++) {
            b[i] = (i+1) * 5;
            System.out.println("b = " + b[i]);
        }
        System.out.println("----------------------------------------");
        System.out.println("Combinación de c con el arreglo a  y  b");
        System.out.println("con asignación de valores intercalados.");
        System.out.println("----------------------------------------");

        /*
        Utilizando la variable aux con post incremento para
        intercalar el arreglo combinado en c
         */
        int aux = 0;
        for (int i = 0; i< b.length;i++){
            c[aux++] = a[i];
            c[aux++] = b[i];
        }

        for (int i = 0; i < c.length; i++){
            System.out.println("c[i] = " + c[i]);
        }


        System.out.println("----------------------------------------");
        System.out.println("Combinación de c con el arreglo a  y  b");
        System.out.println(":::   incrementando de dos en dos   :::");
        System.out.println("----------------------------------------");

        /*
        arreglos según el múltiplo del cuál se quiera iterar
         */

        int aux1 = 0;
        for (int i = 0; i< b.length ;i+=2){

            for (int j = 0; j<2; j++){
                c[aux1++] = a[i+j];
            }
            for (int j = 0; j<2; j++){
                c[aux1++] = b[i+j];
            }
        }

        for (int i = 0; i < c.length; i++){
            System.out.println(i+": "+ c[i]);
        }
        
        
        
        
        
    }
}