import java.util.Scanner;

public class Main {
    void main(){

        Scanner llegir = new Scanner(System.in);
        int[] numerosentrada = new int[5];


        for (int i = 0; i < numerosentrada.length; i++) {
            System.out.println("Introdueix l'enter número " + (i+1) + ".");
            numerosentrada[i] = llegir.nextInt();
        }

        for (int i = 0; i < numerosentrada.length; i++) {
            System.out.println(i + ": " + numerosentrada[i]);
        }
        System.out.println("La longitud total és " + numerosentrada.length + ". El primer valor és " + numerosentrada[0] + " i l'últim és el " + numerosentrada[numerosentrada.length-1]);

    }
}

