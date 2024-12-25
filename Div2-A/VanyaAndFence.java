import java.util.Scanner;


public class VanyaAndFence{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int h = input.nextInt();

        int height;
        int res = 0;

        for(int i = 0; i < n; i++)
        {
            height = input.nextInt();

            res += (height > h)? 2 : 1;
        }

        System.out.println(res);
        input.close();
    }
}

/* My Note: 
 * 
 *  - The ternary operator (height > h) ? 2 : 1 makes the condition concise and avoids unnecessary branching
 * 
*/