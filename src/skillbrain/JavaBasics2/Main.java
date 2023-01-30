import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {


////        System.out.println(array2[0]);
//        int counter = 0;
////
//        for(int i = 0; i < array2.length; i++) {
//            if(array2[i] == 13) {
//                System.out.println(array2[i]);
//                counter++;
//            }
//        }
//        System.out.println("Am gasit 13 in array de " +counter);
////
//        for(int altNumar: arrayNumere) {
//            System.out.println(altNumar);
//            sum += altNumar;
//        }
//        System.out.println("Suma = " + sum);

//        int varsta = 18;
//        boolean amPermisConducere =false;
//        boolean faceScoalaDeSoferi = true;
//
//        if(amPermisConducere && varsta >= 18) {
//            System.out.println("Are voie sa conduca!");
//        } else if(faceScoalaDeSoferi) {  // ! faceScoalaDeSoferi - verifica ca este fals!
//            System.out.println("Are voie sa conduca doar masina de scoala");
//        } else {
//            System.out.println("nu are voie sa conduca deloc");
//        }

        // SWITCH
//        String azi = "Joi";
//
//        switch (azi) {
//            case "Luni","Marti","Miercuri":
//                System.out.println("Mergem la munca");
//                break;
//            case "Joi":
//                System.out.println("mergem la bautura dupa munca :)");
//                break;
//            case "Vineri":
//                System.out.println("ne pregatim de weeken");
//                break;
//            default:
//                System.out.println("Posibil weekend ;)");
//                break;
//        }
//
//        int sum = 0;
//        int counter = 0;
//        // codul se executa cel putin o singura data!
//        do{
//            sum += 100;
//            System.out.println(sum);
//            counter ++;
//        } while (counter < 3);
//
//        System.out.println( sum < 200 ? "Adevarat":"Fals");

        // Arrays
//        int[] arrayNumere = {1, 10, -20, 13, 100, 99};
//        int[] array2 = new int[7];
//        array2[0] = 1;
//        array2[2] = -20;
//        array2[4] = 100;
//        array2[5] = 99;
//        array2[6] = 13;
//        System.out.println(array2[0]);
//
//        // Java Collections
//        List<String> listaText = new ArrayList<>();
//        listaText.add("Emil");  // index 0
//        listaText.add("Constantin");   // index 1
//        listaText.add("text random");  // index 2
//        listaText.add("Mihai");  // index 3
//        System.out.println(listaText);
//        listaText.add("Gigel");
//        System.out.println(listaText);
//        listaText.remove(0);
//        System.out.println(listaText);
//        listaText.stream().sorted().forEach(System.out::println);
//
//        // autoboxing / unboxing
//        List<Integer> listaNumere = Arrays.asList(Integer.valueOf(1),2,3,5,6, 15, -12, 13);
//
//        for(int i =0; i <listaNumere.size(); i++) {
//            System.out.println(listaNumere.get(i));
//        }


        Random randomNum = new Random();
        Scanner scanner = new Scanner(in);
        System.out.println("Introduceti un numar:");
        int numarTasta = scanner.nextInt();
        int numarAleatoriu = randomNum.nextInt(100);
        if(numarTasta < numarAleatoriu) {
            System.out.println("Numarul de la tastatura "+ numarTasta + " este mai mic decat "+numarAleatoriu +".");
        }

        int [][] arrayDublu = new int[3][5];
        arrayDublu[0][0] = 1;
        arrayDublu[0][1] = 2;

        int[] arrayGol = new int[0];
        for (int i=0 ; i <arrayGol.length-1; i++) {
            if (arrayGol.length == 0) {
                System.out.println("Array-ul este gol");
            } else if(arrayGol == null) {
                System.out.println("Array-ul este null");
            }
        }










    }
}