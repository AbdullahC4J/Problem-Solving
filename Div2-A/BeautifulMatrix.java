import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int res = 0;

        lab: {
            for (int i = 1; i < 6; i++) {
                for (int j = 1; j < 6; j++) {
                    if (1 == input.nextInt()) {
                        res = Math.abs(3 - i) + Math.abs(3 - j);
                        break lab;
                    }
                }
            }
        }

        System.out.println(res);
        input.close();
    }
}