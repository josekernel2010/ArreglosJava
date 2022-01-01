package package1;


public class Main {
    public static void main(String[] args) {
        //Arreglos
        int[] numbers;

        System.out.println("----------------------------");
        System.out.println("::    Lista de enteros    ::");
        System.out.println("----------------------------");
        numbers = new int[3];
        numbers[0] = 4;
        numbers[1] = 15;
        numbers[2] = 75;
        for(int i : numbers){
            System.out.println("arreglo de números: "+i);
        }


        System.out.println("----------------------------");
        System.out.println("::    Lista de nombres    ::");
        System.out.println("----------------------------");
        String[] names = new String[3];
        names[0] = "Maria";
        names[1] = "Ícaro";
        names[2] = "Jose";
        for(String i : names){
            System.out.println("arreglo de nombres: "+i);
        }


        System.out.println("----------------------------");
        System.out.println("::     Lista de Clases    ::");
        System.out.println("----------------------------");
        Producto[] producto = new Producto[3];
        producto[0] = new Producto("maria");
        producto[1] = new Producto("ícaro");
        producto[2] = new Producto("jose");

        //for each con la clase Producto
        for (Producto i : producto){
            System.out.println("Nombre desde la clase Producto : "+i.name);
        }

        Producto[] producto2 = {new Producto("maria"),
                                new Producto("ícaro"),
                                new Producto("jose")
                                };
        for(Producto i : producto2){
            System.out.println("producto2: "+i.name);
        }


        System.out.println("-----------------------------------------");
        System.out.println("::    Lista de enteros y aleatorios    ::");
        System.out.println("-----------------------------------------");
        int[] lista ={12,45,74,58,63,52,41};
        for(int i : lista){

            //función math para generar números aleatorios
            int num = (int) (Math.random() * 1000);
            System.out.println("Numero de la lista :"+i+"  números aleatorios: "+num);

        }



    }

}
