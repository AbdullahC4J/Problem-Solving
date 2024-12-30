import java.util.Scanner;

public class ColorfulStones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        String t = input.nextLine();

        int index = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(index) == t.charAt(i))
                index++;
        }

        System.out.println(index+1);
        input.close();
    }
}