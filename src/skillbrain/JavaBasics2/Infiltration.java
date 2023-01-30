public class Infiltration {

    public static void main(String[] args) {

        boolean knightIsAwake = true;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        boolean ananasDogIsPresent = true;


//        System.out.println(canFastAttack(knightIsAwake));
//        System.out.println(canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
//        System.out.println(canSignalPrisoner (archerIsAwake,prisonerIsAwake));
        System.out.println(canFreePrisoner (knightIsAwake, archerIsAwake, prisonerIsAwake, ananasDogIsPresent));
    }

    public static boolean canFastAttack(boolean knightIsAwake) {
        if(!knightIsAwake) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
//        if(knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true) {
//            return true;
//        } else {
//            return false;
//        }
        if(!knightIsAwake && archerIsAwake && !prisonerIsAwake) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (!archerIsAwake && prisonerIsAwake) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
//        if (petDogIsPresent == true && archerIsAwake == false){
//            return true;
//        } else if (petDogIsPresent == false && archerIsAwake == false  && knightIsAwake == false && prisonerIsAwake == true) {
//            return true;
//        } else {
//            return false;
//        }
        if(!knightIsAwake && !archerIsAwake && prisonerIsAwake && petDogIsPresent){
            return true;
        } else {
            return false;
        }
    }
}
