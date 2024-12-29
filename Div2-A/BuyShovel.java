import java.util.Scanner;


public class BuyShovel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k = input.nextInt();
        int r = input.nextInt();

        int i = 1;
        int cost;
        while (true) {
            cost = k * i;
            
            if (cost % 10 == r || cost % 10 == 0) 
                break;

            i++;
        }

        System.out.println(i);
        input.close();
    }
}