import java.util.Random;

public class Main {


    public static void main(String[] args) {
        int nr;
        int upperBound=1000;
        Random number=new Random();
        nr=number.nextInt(upperBound);
        System.out.println("the number is "+nr);
        oddDigit(nr);
    }

    public static void oddDigit(int nr) {
        int digit;
        int digitCounter = 0;

        while (nr > 0) {
            digit = nr % 10;


            if (digit % 2 != 0) {
                digitCounter++;

            }else{
                digitCounter=0;
            }


            if (digitCounter == 3) {
                System.out.println("1");
                return;
            }
            nr/=10;

        }
        System.out.println("0");
    }
}
