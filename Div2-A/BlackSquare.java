import java.util.Scanner;


public class BlackSquare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[4];
        for(int i = 0; i < 4; i++)
            a[i] = input.nextInt();

        String s = input.next();
        int totalCal = 0;


        for(int i = 0; i< s.length(); i++){
            totalCal += a[s.charAt(i) - 49];
        }


        System.out.println(totalCal);
        input.close();

    }
}


/*
 * Using the wrapper class Character to get the numeric value of character is another solution 
            
    for (char ch : sequence.toCharArray()) {
            int index = Character.getNumericValue(ch) - 1;
            totalCalories += calorieValues[index];
        }
 */