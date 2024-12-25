import java.util.Scanner;

public class AntonAndDanik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine(); // Consume the newline character
        String str = input.nextLine(); 

        int A = 0, D = 0;

        // Count occurrences of 'A' and 'D'
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'A')
                A++;
            else if (str.charAt(i) == 'D')
                D++;
        }

        // Print the result based on counts
        if (A > D) {
            System.out.println("Anton");
        } else if (D > A) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }

        input.close();
    }
}

/* My Note
 * 
 * When you use nextInt(), it reads the integer but does not consume the newline character (\n) that is generated when the user presses "Enter."
   If you immediately call nextLine() after nextInt(), the nextLine() method reads this leftover newline instead of waiting for user input.
 * 
 */
