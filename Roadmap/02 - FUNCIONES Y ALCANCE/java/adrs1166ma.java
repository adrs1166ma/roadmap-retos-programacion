public class adrs1166ma {
  
    int globalVariable = 666;

    public static void main(String[] args) {

        /* variable local */
        int localVariable = 1;

        greet();
        lenguaje("Java");
        suma(6,4);
        System.out.println(suma1(2,3));
        System.out.println(random());

        extra("m de 3", "m de 5");
    }

    /*
    * Funciones definidas por el usuario
    */

    // Simple
    public static void greet(){
        System.out.println("Hola, Java");
    }
    // Con argumento
    public static void lenguaje(String lenguaje) {
        System.out.println("Este ejercicio esta hecho en el lenguaje "+lenguaje);

    }
    // Con argumentos
    public static void suma(int a, int b) {
        System.out.println("La suma es: " + (a+b));
    }
    // Con un argumento predeterminado
    // none
    // Con argumentos y return
    public static int suma1(int n1, int n2){
        int r = n1 + n2;
        System.out.println("El resultado de la suma es : ");
        return r;
    }

    /*
    * Funcion dentro de una funcion
    */

    public static int random() {
        int x = (int) (Math.random()*10+1);
        System.out.println("El numero aleatorio entre 1 y 10 es: ");
        return x;
    }

    /*
    * Extra
    */
    private static int extra(String a, String b) {
        int contador = 0;
        for (int i = 1; i<=100; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println(i+" ["+a+"] + ["+b+"]");
            } else if (i % 3 == 0) {
                System.out.println(i+" ["+a+"]");
            } else if (i % 5 == 0) {
                System.out.println(i+" ["+b+"]");
            } else {
                System.out.println(i);
                contador++;
            }
        }
        System.out.println(" ");
        System.out.println("[ "+contador+ " numeros no tienen texto ]");
        return contador;
    }
}
