public class Bucle {


    public static void main(String[] args) {

        bucla_exterioara:   // label simplu
        while (true) {
            int z = 0;
            while (true) {
                if( z >= 10) {
                    break bucla_exterioara;
                } else {
                    System.out.println(z++);
                }
            }
        }
    }
}
