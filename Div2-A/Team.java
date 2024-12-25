import java.util.Scanner;

public class Team {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int res = 0;
        for (int i = 0; i < n; i++) {

            int count = input.nextInt() + input.nextInt() + input.nextInt();

            if (count >= 2)
                res++;
        }

        System.out.println(res);
        input.close();
    }
}