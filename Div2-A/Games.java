import java.util.Scanner;


public class Games {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int n = input.nextInt();
        int[] h = new int[n];
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        {
            h[i] = input.nextInt();
            a[i] = input.nextInt();
        }

        int res = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
                if(h[i] == a[j]) res++;
        }

        System.out.println(res);
        input.close();

    }
}