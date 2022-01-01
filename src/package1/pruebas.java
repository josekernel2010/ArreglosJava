package package1;

public class pruebas {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        // Para contar los milisegundos
        long inicio = System.currentTimeMillis();

        // Más eficiente y trabaja con clases
        StringBuilder sb = new StringBuilder(a);

        for (int i = 0; i < 11500; i++) {
            //c = c.concat(a).concat(b).concat("\n");
            sb.append(c).append(b).append("\n");
        }


        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);

        //System.out.println("sb : "+sb.toString());
    }
}
