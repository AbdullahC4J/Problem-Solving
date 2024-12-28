import java.util.Scanner;


public class NightAtMuseum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        char curr = 'a';
        int res = 0, temp = 0;

        for(int i = 0; i < s.length(); i++)
        {
            temp = Math.abs(s.charAt(i) - curr);
            if(temp > 13) res += (26 - temp);
            else res += temp;

            curr = s.charAt(i);
        }

        System.out.println(res);
        input.close();
    }
}