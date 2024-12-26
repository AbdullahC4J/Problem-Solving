import java.util.Scanner;


public class PetyaAndStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s1 = input.nextLine();
        String s2 = input.nextLine();

        int flag = 0;
        for (int i = 0; i < s1.length(); i++)
        {
            if(s1.equalsIgnoreCase(s2))
                continue;

            flag = s1.charAt(i) - s2.charAt(i);
        }

        System.out.println((flag > 0)? -1: 1));
    }
}