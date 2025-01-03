import java.util.Scanner;

public class NewPassword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(), k = input.nextInt();

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < k; i++) {
            password.append((char) ('a' + i));
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(password.charAt(i % k));
        }

        System.out.println(result);

    }
}