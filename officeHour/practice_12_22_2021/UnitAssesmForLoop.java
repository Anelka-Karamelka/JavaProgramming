package practice_12_22_2021;

public class UnitAssesmForLoop {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
