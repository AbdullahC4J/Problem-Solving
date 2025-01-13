import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        if (n <= 2) {
            System.out.println(input.nextLine());
            input.close();
            return;
        }


        int team1 = 1, team2 = 0;
        String firstTeam = input.nextLine();
        String secTeam = null;

        for (int i = 1; i < n; i++) {
            String temp = input.nextLine();
            if (firstTeam.equals(temp)) {
                team1++;
            } else {
                if (secTeam == null) {
                    secTeam = temp;
                }
                team2++;
            }
        }

        input.close();

        System.out.println((team1 > team2) ? firstTeam : secTeam);
    }
}
