public class Lasagna2 {
    public static void main(String[] args) {
        expectedMinutesInOven();
        System.out.println(remainingMinutesInOven(30));
        System.out.println("Timp total de preparare: " + totalTimpePreparationInMInutes(3, 20));



        // DRY   - DO NOT REPEAT YOURSELF !!!!!

    }

    static int expectedMinutesInOven(){
        int minute = 40;
        System.out.println("timpul standard in cuptor este " +minute);
        return minute;
    }

    static int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }

    static int preparationTimeInMinutes(int layers) {
        return layers *2;
    }

    static int totalTimpePreparationInMInutes(int layers, int minutesInOven) {
        return remainingMinutesInOven(minutesInOven) + preparationTimeInMinutes(layers);
    }




}
