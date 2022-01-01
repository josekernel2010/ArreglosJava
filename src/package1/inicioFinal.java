package package1;

public class inicioFinal {

    public static void main(String[] args) {

        // creamos arreglo de enteros
        int[] num = new int[10];

        // recorrido con for para asignar el valor a cada posición de arreglo
        for(int i = 0; i < num.length; i++){
            num[i] = i +1;
        }

        // imprimiendo todos los valores con un foreach
        for(int i:num){
            System.out.println("i = " + i);
        }

        // creando un efecto espejo del arreglo
        // variable auxiliar con post incremento donde la variable se asigna y luego se incrementa
        int aux = 1;
        for(int i = 0; i < num.length/2; i++){
            System.out.println("inicio y final ¯|_(ツ)_/¯ = "+" "+(aux++)+" " + (num.length -i));
        }
    }
}
