import java.util.Scanner;


public class Pangram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.next();

        String word = input.next();
        input.close();
    }
}