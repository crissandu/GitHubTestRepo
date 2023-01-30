public class BirdLoopsBonus {

    public static void main(String[] args) {

        final int[] pasariPeSaptamana = {2, 5, 0, 7, 4, 1, 10, 11};
        System.out.println(getToday(pasariPeSaptamana));
        getLatsWeek(pasariPeSaptamana);
        System.out.println(incrementTodaysCount(pasariPeSaptamana));
        System.out.println(hasDayWithoutBirds(pasariPeSaptamana));
        System.out.println(getCountForFistDay(pasariPeSaptamana, 4));
        System.out.println("Number of busy days = " + getBusyDays(pasariPeSaptamana));

        
    }


    static int getBusyDays(int[] array) {
        int busyDays = 0;
        for(int i=0; i< array.length-1; i++) {
            if(array[i] >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }

    static int getCountForFistDay(int[] array, int days) {
        int sum = 0;
        for (int i =0; i < days; i++) {
            sum += array[i];
        }
        return sum;
    }

    static void getLatsWeek(int[] array) {
        for(int i =0; i< array.length-1; i++) {
            System.out.println(array[i]);
        }
    }


    static int getToday(int[] array) {
        return array[array.length - 1];
    }

    static int incrementTodaysCount(int[] array){
//        int increment = array[array.length-1] +1;
        // Echivalent
        return ++array[array.length-1];
    }

    static boolean hasDayWithoutBirds(int[] array) {
        for (int i = 0; i <array.length-1; i++) {
            if(array[i] == 0) {
                return true;
            }

        }
        return false;
    }


}
