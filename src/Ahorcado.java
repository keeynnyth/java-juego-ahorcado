import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int intentosMaximos = 10;
        int intentos = 0;
        String palabraSecreta = "inteligencia";
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = ' ';
            System.out.println(letrasAdivinadas[i]);
        }

        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " ("
                    + palabraSecreta.length() + " letras)");
            System.out.println("introduce una letra, porfavor");
            // usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {

                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }


            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorretcto! te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println(" Felicidades, has adivinado la palabra secreta:" + palabraSecreta);
            }

        }
        if (!palabraAdivinada) {
            System.out.println(" que pena te has quedado sin intentos! GAME OOVER");
        }

        scanner.close();

    }
}
