package skillbrain.JavaBasics3.Tema3;

import java.util.Arrays;

public class BirdWatcher {

    private int[] array;
    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 3, 8, 4};
        BirdWatcher bw = new BirdWatcher(arr);
        System.out.println(bw.getBusyDays());
        System.out.println(bw.getCountForFistDay(3));
        System.out.println(bw.incrementTodaysCount());
        System.out.println(bw.getToday());
        System.out.println(Arrays.toString(arr));
    }

    public BirdWatcher(int[] array) {
        this.array = array;
    }

     int getBusyDays() {
        int busyDays = 0;
        for(int i=0; i< array.length-1; i++) {
            if(array[i] >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }

    int getCountForFistDay( int days) {
        int sum = 0;
        for (int i =0; i < days; i++) {
            sum += array[i];
        }
        return sum;
    }

    void getLatsWeek() {
        for(int i =0; i< array.length-1; i++) {
            System.out.println(array[i]);
        }
    }


    int getToday() {
        return array[array.length - 1];
    }
    int incrementTodaysCount(){
//        int increment = array[array.length-1] +1;
        // Echivalent
        return ++array[array.length-1];
    }

     boolean hasDayWithoutBirds() {
        for (int i = 0; i <array.length-1; i++) {
            if(array[i] == 0) {
                return true;
            }

        }
        return false;
    }



}
