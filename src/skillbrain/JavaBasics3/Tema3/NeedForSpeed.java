package skillbrain.JavaBasics3.Tema3;

public class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int battery;
    private int distanceCovered;

    public static void main(String[] args) {
        NeedForSpeed car1 = new NeedForSpeed(5, 2);
        RaceTrack monaco = new RaceTrack(1200);
        car1.drive();
        car1.drive();
        System.out.println(car1.battery);
        System.out.println(car1.distanceCovered);
        System.out.println(car1.isDrained());
        NeedForSpeed nitroCar = NeedForSpeed.nitro();
        for (int i = 0; i < 25; i++) {
            nitroCar.drive();
        }
        System.out.println(nitroCar.distanceCovered);
        System.out.println(nitroCar.battery);
//        System.out.println(monaco.canFinish(car1));
//        System.out.println("Can nitro car finish? "+monaco.canFinish(nitroCar));
        System.out.println("Can nitro car finish?" + monaco.canFinishRace(nitroCar));

    }


    public int getDistanceCovered() {
        return distanceCovered;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    boolean isDrained() {
        if(battery <= 0) {
            return true;
        }
        return false;
    }

    public void drive() {
        if(battery > 0) {
            distanceCovered += speed;
            battery -= batteryDrain;
        }
    }

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = 100;
    }
}

class RaceTrack{

    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

//    public boolean canFinish(NeedForSpeed car) {
//        while (!car.isDrained()) {
//            return true;
//        }
//        return false;
//    }

    public boolean canFinishRace(NeedForSpeed car) {
        if((car.getDistanceCovered() >= distance) && !car.isDrained()) {
            return true;
        }
        return false;
    }
}