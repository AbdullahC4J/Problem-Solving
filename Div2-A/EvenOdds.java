import java.util.Scanner;


public class EvenOdds {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long n = input.nextLong(), k = input.nextLong();

        long roundedResult = (long) Math.ceil(n / 2.0);

        if(k <= roundedResult)
        {
            System.out.println( k + (k-1));
        }else
        {
            System.out.println((k - roundedResult) * 2);
        }
    }
}