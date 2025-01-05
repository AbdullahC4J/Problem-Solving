import java.util.Scanner;

public class WannaBeGuy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        boolean[] levels = new boolean[n];

        int p = input.nextInt();
        for (int i = 0; i < p; i++) {
            levels[input.nextInt() - 1] = true;
        }

        int q = input.nextInt();
        for (int i = 0; i < q; i++) {
            levels[input.nextInt() - 1] = true;
        }
        input.close();

        for (boolean passed : levels) {
            if (!passed) {
                System.out.println("Oh, my keyboard!");
                return;
            }
        }

        System.out.println("I become the guy.");
    }
}
