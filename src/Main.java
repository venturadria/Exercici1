import java.util.Scanner;

public class Main {
    void main(){

        Scanner llegir = new Scanner(System.in);
        int[] numerosentrada = new int[5];


        for (int i = 0; i < numerosentrada.length; i++) {
            System.out.println("Introdueix l'enter número " + (i+1) + ".");
            numerosentrada[i] = llegir.nextInt();
        }



    }
}

