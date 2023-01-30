import java.util.*;

public class Tema2Cristian {

    private static int i;

    public static void main(String[] args) {

//        exe1();
//          exe2();
//        exe3();
//          exe4();
//          exe5();
//          exe6();     // de verificat
//          exe7();
          exe8();

    }

    // Aici incepe exercitiul 1 -------------------------------------------------------------------------------------
    static void exe1() {
        System.out.println("\n" + "Introducti nr de la tastatura si compara cu Random");
        Scanner A = new Scanner(System.in);
        int A1 = A.nextInt();
        System.out.println("Am introdus numarul " + A1);
        Random Numar = new Random();
        int B = Numar.nextInt(100);
        System.out.println(B + " este aleatoriu");
        if (A1 < B) {
            System.out.println("Numarul introdus este mai mic decat Random " + A1 + " < " + B);
        } else {
            System.out.println("Numarul introdus este mai mare decat Random " + B + "\n");
        }
    }

    // Aici incepe exercitiul 2 -------------------------------------------------------------------------------------
    static void exe2() {
        System.out.println("\n" + "Introducti un caracter si 2 nr de la tastatura si comparati acestea cu valorile oferite");
        Scanner A = new Scanner(System.in);
        String A1 = A.next();
        System.out.println("Am introdus caracterul = " + A1);
        Scanner B = new Scanner(System.in);
        int B1 = B.nextInt();
        System.out.println("Am introdus primul numar = " + B1);
        Scanner C = new Scanner(System.in);
        int C1 = C.nextInt();
        int D;   // rezultatul final
        System.out.println("Am introdus al doilea numar = " + C1);

        switch (A1) {
            case "a":
                D = B1 + C1;
                System.out.println("Adaugare valoare = " + D);
                break;  // pentru a iesi din blocul switch()
            case "s":
                D = B1 - C1;
                System.out.println("Scadere valoare = " + D);
                break;
            case "i":
                D = B1 * C1;
                System.out.println("Inmultire valoare = " + D);
                break;
            case "p":
                D = B1 / C1;
                System.out.println("Impartire valoare = " + D);
                break;
            case "m":
                D = B1 % C1;
                System.out.println("Modul valoare = " + D);
                break;
            default:
                System.out.println("Nu avem valoarea corecta");
        }
    }

    // Aici incepe exercitiul 3 -------------------------------------------------------------------------------------
    static void exe3() {
        System.out.println("\n" + "Tiparim valorile extremitatilor unei matrice de 3 cu 5");
        String[][] matr_2_dim = new String[3][5];  // [linie][coloana] array multi-dimensional
        matr_2_dim[0][0] = "prima valoare de pe primul rand";
        matr_2_dim[0][4] = "ultima valoare de pe primul rand";
        matr_2_dim[2][0] = "prima valoare de pe ultimul rand";
        matr_2_dim[2][4] = "ultima valoare de pe ultimul rand";
        System.out.println(matr_2_dim[0][0]);
        System.out.println(matr_2_dim[0][4]);
        System.out.println(matr_2_dim[2][0]);
        System.out.println(matr_2_dim[2][4]);
    }

    // Aici incepe exercitiul 4 -------------------------------------------------------------------------------------
    static void exe4() {
        System.out.println("\n" + "Tiparim valorile termenilor secundari din lista de caractere");
        char[] arrayChar = new char[4];
        arrayChar[0] = 'a';
        arrayChar[1] = 'z';
        arrayChar[2] = 'b';
        arrayChar[3] = 'x';
        for (int i = 0; i < arrayChar.length - 1; i++) {
            if (i % 2 == 0) {
                System.out.println(arrayChar[i]);
            }
        }
//        List<String> obiecte = new ArrayList<>();
//        String[] array = {"1", "3", "5", "7"};
////      obiecte.add("2");
//        System.out.println(array[1]);
    }

    // Aici incepe exercitiul 5 -------------------------------------------------------------------------------------
    static void exe5() {
        System.out.println("\n" + "Tiparim valorile unei matrice pe care o iteram pt a determina valorile ei ");
        double[] exercitiu = {-20, 15, -3, 4.3, 5, 3.2, 4.5, 6, 9};
        // sortam inainte array-ul
        for (int UltimulElement = exercitiu.length - 1; UltimulElement >= 0; UltimulElement--) {
            for (int i = 0; i < UltimulElement; i++) {
                if (exercitiu[i] > exercitiu[i + 1]) {
                    swap(exercitiu, i, i + 1);
                }
            }
        }
        for (int i = 0; i < exercitiu.length; i++) {
            System.out.println(exercitiu[i]);
        }
        for (int i = 0; i < exercitiu.length-1; i++) {
            double Numar = 4.5;
            if (Numar > exercitiu[i]) {
                System.out.println(" Avem element mai mica ca 4.5 " + exercitiu[i]);
            } else if (Numar == exercitiu[i]) {
                System.out.println("\n Avem element egala cu 4.5 " + exercitiu[i] + "\n");
            } else {
                System.out.println(" Elemente mai mare sau egal ca 5 " + exercitiu[i]);
            }
        }
    }

    static void swap(double[] array, int i, int j) {
        if (i == j) {
            return;
        }
        double temporar = array[i];
        array[i] = array[j];
        array[j] = temporar;
    }

    // Aici incepe exercitiul 6 -------------------------------------------------------------------------------------
    static void exe6() {
        System.out.println("\n" + "Avem un sir de 9 element si sarim elementul 2 ");
        int[] exercitiu = {10, -9, 3, 6, -3, 5, 7, 2, -10};

        for (int LastElement = exercitiu.length - 1; LastElement >= 0; LastElement--) {
            for (int i = 0; i < LastElement; i++) {
                if (exercitiu[i] > exercitiu[i + 1]) {
                    swap(exercitiu, i, i + 1);
                }
            }
        }
        for (int i = 0; i < exercitiu.length; i++) {
            System.out.println(exercitiu[i]);
        }
        for (int i = 0; i < exercitiu.length-1; i++) {
            int iteratie = i;
            if (iteratie == 1) {   // 1 = index 2
                System.out.println("Termen sarit");
                continue;
            } else if (iteratie == 6) {
                System.out.println("Iteratie oprita");
                break;
            } else {
                System.out.println(" Index valid ");
            }
        }
    }

    static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temporar = array[i];
        array[i] = array[j];
        array[j] = temporar;
    }


    // Aici incepe exercitiul 7 -------------------------------------------------------------------------------------
    static void exe7() {
        List<Integer> listInteger = Arrays.asList(1, 5, 10, 20, 100);
        // echivalent
//        List<Integer> integerList2 = new ArrayList<>();
//        listInteger.add(200);
        int sum = 0;
        for(Integer numarul: listInteger) {
            sum += numarul;
        }
        //       ECHIVALENT
        for (int i=0; i<listInteger.size(); i++) {
            sum += listInteger.get(i);
        }
        System.out.println("Suma =" + sum);

    }

    static void exe8() {
        List<String> listText = new ArrayList<>();
        listText.add("un element");
        System.out.println(listText.isEmpty());
    }
}
