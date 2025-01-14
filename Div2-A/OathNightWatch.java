import java.util.Arrays;
import java.util.Scanner;


public class OathNightWatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = input.nextInt();

        input.close();

        Arrays.sort(a);
        int count = 0;
        
        for(int i = 1; i < n-1; i++)
        {
            if(a[i] > a[0] && a[i] < a[n-1])
                count++;
        }

        System.out.println(count);
    }
}