import java.util.Arrays;
import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = input.nextInt();

        int left = 0, right = n - 1;
        int sereja = 0, dima = 0;

        for (int i = 0; i < n; i++) {
            if (a[left] >= a[right]) {
                if (i % 2 == 0)
                    sereja += a[left];
                else
                    dima += a[left];

                left++;

            } else {
                if (i % 2 == 0)
                    sereja += a[right];
                else
                    dima += a[right];

                right--;
            }
        }

        System.out.println(sereja + " " + dima);
        input.close();
    }
}