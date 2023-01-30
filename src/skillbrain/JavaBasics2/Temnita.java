import java.util.Random;
import java.util.Scanner;

public class Temnita {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        // variabile protagonist
        int sanatate = 100;
        int atacDeteriorare = 50;
        int potiuni = 3;
        int valoareRegerarePotiune = 30;
        int sansaPotiune = 50; // sansa de a castiga o potiune daca invinge un inamic


        // variabile inamic
        String[] inamici = {"zombie", "schelet", "razboinic", "asasin"};
        int maxSanatateInamici = 100;
        int inamicDeteriorare = 25;


        boolean running = true;
        System.out.println("Bun venit in Temnita");

        // definim un label jocului
        JOC:
        while (running) {
            System.out.println("==================================");

            // va returna un numar intre 0 si valoarea maxima definita de noi (75)
            int sanatateInamic = random.nextInt(maxSanatateInamici);
            String inamic = inamici[random.nextInt(inamici.length)];
            System.out.println("\t#A aparut un " + inamic);

            while (sanatateInamic > 0) {
                // scriem logica in care luptam cu inamicul
                System.out.println("\tSanatatea naostra este: " + sanatate);
                System.out.println("\tSanatatea inamicului este: " + sanatateInamic);
                System.out.println("\t Ce ai de gand sa faci?");
                System.out.println("\t 1. Ataca");
                System.out.println("\t 2. Bea o potiune");
                System.out.println("\t 3. Fugi!");
                System.out.println("\t 4.Iesiti din joc");
                String input = in.nextLine();
                if (input.equals("1")) {
                    int deteriorareProdusa = random.nextInt(atacDeteriorare);
                    int deteriorarePrimita = random.nextInt(inamicDeteriorare);
                    sanatate -= deteriorarePrimita;
                    sanatateInamic -= deteriorareProdusa;
                    System.out.println("\tL-ai lovit pe " + inamic + " cu " + deteriorareProdusa + " puncte de deteriorare");
                    System.out.println("\tAi primit " + deteriorarePrimita + " puncte de deteriorare");
                    if (sanatate <= 0) {
                        System.out.println("\tAi fost lovit fatal. GAME OVER!");
                        break;
                    } else if (sanatateInamic <= 0) {
                        System.out.println("Inamicul a fost invins!");
                    }
                } else if (input.equals("2")) {
                    if (potiuni > 0) {
                        sanatate += valoareRegerarePotiune;
                        potiuni--;
                        System.out.println("\tAi baut o potiune. Mai ai " + potiuni + " potiuni. Viata ta este acum " + sanatate);
                    } else {
                        System.out.println("Nu mai ai potiuni! Ai sansa sa dobandesti o potiune daca invingi un inamic.");
                    }

                } else if (input.equals("3")) {
                    System.out.println("\tAi fugit de " + inamic +"!");
                    continue JOC;
                } else if(input.equals("4")) {
                    System.out.println("Quitting game...");
                    break JOC;
                } else {
                    System.out.println("Te rog sa introduci una din optiunile valide");
                }

            }
            if(sanatate <1) {
                System.out.println("Ai fost batut in temnita, trebuie sa devii mai puternic.");
                break;
            }

            System.out.println("===============================================");
            System.out.println("# " + inamic +" a fost invins! # ");
            System.out.println("Mai ai " + sanatate + " puncte de sanatate.");

            // codul pentru a genera o potiune cand invingem un inamic
            if(random.nextInt(100) < sansaPotiune) {
                potiuni++;
                System.out.println("Ai primit o potiune!");
                System.out.println("Mai ai " + potiuni + " potiuni.");
            }
            System.out.println("Ce ai vrea sa faci in continuare?");
            System.out.println("\t1 Continui lupta!");
            System.out.println("\t2 Termini jocul");
            String input = in.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Comanda Invalida");
                System.out.println("Ce ai vrea sa faci in continuare?");
                System.out.println("\t1 Continui lupta!");
                System.out.println("\t2 Termini jocul");
                input = in.nextLine();
            }

            switch (input) {
                case "1":
                    System.out.println("=======================================");
                    System.out.println("Aventira continua");
                    break;
                case "2": {
                    System.out.println("\tAi ales sa iesi din temnita. Drum bun");
                    break JOC;
                }
            }
        }

    }


}
