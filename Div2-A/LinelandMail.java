import java.util.Scanner;

public class LinelandMail {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(),i;

        int[] x = new int[n];
        for(i = 0; i < n; i++)
            x[i] = input.nextInt();

        input.close();

        for(i = 0; i < n; i++)
        {
            if(i == 0){
                System.out.println(Math.abs(x[i] - x[i+1]) + " " + Math.abs(x[i] - x[n-1]));
                continue;
            }

            if(i == n-1){
                System.out.println(Math.abs(x[i] - x[i - 1]) + " " + Math.abs(x[i] - x[0]));
                return;
            }

            System.out.println(Math.min(Math.abs(x[i] - x[i - 1]) , Math.abs(x[i] - x[i + 1])) + " " + Math.max(Math.abs(x[i] - x[0]) , Math.abs(x[i] - x[n - 1])) );
        }
    }
}