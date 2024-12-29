import java.util.Scanner;


public class HorseShoes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] s = new int[4];
        for(int i = 0; i < 4; i++)
            s[i] = input.nextInt();


       int uniqueCount = 0; 
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (s[i] == s[j]) {
                    uniqueCount++;
                    break;
                }
            }
        }

        System.out.println(uniqueCount);
        input.close();
    }
}