import java.util.Scanner;

import static java.lang.System.in;

public class AplicatieBancara {


    public static void main(String[] args) {

        boolean cardBlocat = false;
        int numarIncercari = 3;
        int pin = 1234;

        while (numarIncercari > 0) {
            Scanner scanner = new Scanner(in);
            System.out.println("================================");
            System.out.println("Va rugam sa introduceti codul PIN");
            int codPin = scanner.nextInt();
            if( codPin == pin) {
                System.out.println("Bun venit!");
                break;
            } else {
                System.out.println("Codul PIN introdus este incorect, va rugam sa incercati din nou");
                numarIncercari--;
                System.out.println("Mai aveti " + numarIncercari + " incercari");
            }

            if(numarIncercari == 0) {
                cardBlocat = true;
                System.out.println("Cardul a fost blocat, contactati banca");
            }
        }


    }




}
