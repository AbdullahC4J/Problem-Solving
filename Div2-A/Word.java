import java.util.Scanner;


public class Word {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        
        int upperCount = 0;

        for(char i : str.toCharArray())
        {
            if(Character.isUpperCase(i)) upperCount++;
        }

        int lowerCount = str.length() - upperCount;
        System.out.println( (upperCount > lowerCount)? str.toUpperCase() : str.toLowerCase() );
        input.close();
    }
}