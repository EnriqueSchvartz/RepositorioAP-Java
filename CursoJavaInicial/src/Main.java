public class Main {
   public static void main(String[] args) {
        int numeros [] = new int[5];     //defino vector de 5 elementos enteros
        char letras [] = {'a','b','c','d','e'};

        for (int i=0; i < numeros.length; i++){
            numeros[i] = i*10;
            System.out.println(numeros[i]);
        }
        for(char letra : letras) {
            System.out.println(letra);
       }

       String texto1 = "Hola!";
       String texto2 = "Chau!";

       int st = texto1.length();
       System.out.println(st);

       System.out.println(texto1.charAt(4)) ;
       System.out.println(texto1+" "+texto2) ;

       String texto3 = "Pedro\t18\tprogramador\n"; //agrega tabulación
       System.out.println(texto3);

           }
}