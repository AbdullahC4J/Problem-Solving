import java.util.Scanner;


public class LongestUncommonSubsequence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        String b = input.nextLine();
        input.close();

        if(a.equals(b))
            System.out.println(-1);
        else
            System.out.println(Math.max(a.length(), b.length()));
    }
}