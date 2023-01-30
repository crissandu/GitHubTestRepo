public class Algoritm {


    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        //                 0   1    2   3  4   5   6   7 ?
        // daca i > i+1
        // Bubble sort
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        for (int ultimulIndexNesortat = intArray.length - 1; ultimulIndexNesortat > 0; ultimulIndexNesortat--) {
            for (int i = 0; i < ultimulIndexNesortat; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    // metoda de a schimba valorile intre i si i+1
                    swap(intArray, i, i + 1);
                }
            }
        }
        System.out.println("=================================================");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    static void swap(int[] array, int i, int j) {
        // j este i+1
        if (i == j) {
            return;
        }
        // definim o variabila temporara
        // trebuie sa memorez valoarea lui i
        int temp = array[i];  // memorez valoarea lui
        array[i] = array[j];  // i ia valoarea lui i+1
        array[j] = temp;  // i+1 ia valoarea lui i
    }


}
