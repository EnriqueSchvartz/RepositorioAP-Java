public class Main {
    public static void main(String[] args) {
        //EJERCICIO 1.A: Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String
        String txt = "Este es el texto para usar en el TP 3"; //6 e, 3 t
        char letra = 't';
        int repetida = 0;

        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == letra) {
                repetida++;
            }
        }
        System.out.println("La cantidad de veces que aparece la letra \"" + letra + "\" es de: " + repetida);
        //System.out.println("The length of the txt string is: " + txt.length());

        //  EJERCICIO 1.C: Dado un vector de números, y un número X, que sume todos los números > X y
        //retorne el resultado
        int elementos[] = {2, 5, 1, 9, 7}; //la suma da 24
        int suma = 0;

        for (int i=0; i< elementos.length; i++ ) {
            suma= suma + elementos[i];
        }
        System.out.println("La suma de los elementos del vector da " + suma);

        //EJERCICIO 1.B:  Dados 3 números y un orden (ascendente o decreciente) que ordene los
        //mismos y los retorne en un vector de 3
        int vector1 []= {15, 2, 99, 24, 27};
        boolean EsAscendente = true;

        int vectorOrdenado []= vector1;
        

    }
}