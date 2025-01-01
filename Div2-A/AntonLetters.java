import java.util.Scanner;

public class AntonLetters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String set = input.nextLine();

        int distinct = 0;
        int length = set.length();
        if (length > 2) {
            for (int i = 1; i < length; i += 3) {
                for (int j = i + 3; j < length; j += 3) {
                    if (set.charAt(i) == set.charAt(j)) {
                        distinct--;
                        break;
                    }
                }
                distinct++;
            }
        }
        System.out.println(distinct);
        input.close();
    }
}