import java.util.Scanner;


public class ShaassOskols {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = input.nextInt();

        int m = input.nextInt();
        for(int i = 0; i < m; i++)
        {
            int x = input.nextInt() - 1;
            int y = input.nextInt() - 1;

            if(x-1 >= 0)
                a[x-1] += (y);

            if(x+1 < n)
                a[x+1] += (a[x] - y - 1);

            a[x] = 0;
        }

        for(int i: a)
            System.out.println(i);

        input.close();
    }
}