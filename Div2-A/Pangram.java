import java.util.Scanner;


public class Pangram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        String word = input.next();
        input.close();

        if (n < 26) {
            System.out.println("NO");
        }else{
            
            int[] count = new int[26];
            word = word.toLowerCase();

            for(int i = 0; i < word.length(); i++)
                count[word.charAt(i) - 'a']++;

            for(int i: count){
                if(i == 0){
                    System.out.println("NO");
                    return;
                }
            }

            System.out.println("YES");
        }
    }
}