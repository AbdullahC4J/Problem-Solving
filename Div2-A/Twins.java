import java.util.Scanner;
import java.util.Arrays;

public class Twins {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        
        int[] coins = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++){
            coins[i] = input.nextInt();
            sum += coins[i];
        }
        input.close();

        Arrays.sort(coins);

        int count = 0, token = 0;
        for(int i = n-1; i >= 0; i--)
        {
            if(token > sum/2)
                break;

            count++;
            token += coins[i];
        }

        System.out.println(count);
    }
}