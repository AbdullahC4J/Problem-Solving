import java.util.Scanner;


public class Presents {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int p = 0,i;
        int[] res = new int[n];
        
        for(i = 0; i < n; i++){
            p = input.nextInt();
            res[p - 1] = i+1;
        }
        
        input.close();

        for(i = 0; i < n; i++)
            System.out.print(res[i] + " ");
    }
}