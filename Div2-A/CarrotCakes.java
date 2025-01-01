import java.util.Scanner;

public class CarrotCakes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int t = input.nextInt();
        int k = input.nextInt();
        int d = input.nextInt();

        int g = (n + k - 1) / k;
        int t1 = 0, t2 = d;

        for (int i = 0; i < g; i++) {
            if (t1 <= t2)
                t1 += t;
            else
                t2 += t;
        }

        System.out.println(((g * t) > Math.max(t1, t2)) ? "Yes" : "NO");
        input.close();
    }
}