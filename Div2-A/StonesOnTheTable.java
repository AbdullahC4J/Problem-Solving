import java.util.Scanner;


public class StonesOnTheTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String s = input.next();

        int res = 0;
        for(int i = 1; i < n; i++)
        {
            if(s.charAt(i) == s.charAt(i-1)) res++;
        }

        System.out.println(res);
        input.close();
    }
}