import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Main {
    public static void main(String[] args) {
        int input = 0, running = 0, deckRem = 8, cardsDealt = 0, toatcards = 0;
        Scanner scanner = new Scanner(System.in);

        while (input != -1)  {
            System.out.print("Card?: ");
            input = parseInt(scanner.next());
            if (input == 1) {
                running++;
                cardsDealt++;
                toatcards++;
            }
            if (input == 2) {
                cardsDealt++;
                toatcards++;
            }
            if (input == 3) {
                running--;
                cardsDealt++;
                toatcards++;
            }
            if (cardsDealt == 52) {
                deckRem--;
                cardsDealt = 0;
            }
            int tcount = running / deckRem;
            System.out.println("The Count is " + running);
            System.out.println("The true count is " + tcount);
        }
        System.out.println("The total cards dealt before shuffle was " + toatcards);
    }
}
