import java.util.Scanner;


public class Magnets {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = input.nextInt();

        int currCount = 1, maxCount = 1; 
        for(int i = 1; i < n; i++)
        {
            if(a[i] == a[i-1])
            {
                currCount++;
            }else{
                maxCount = Math.max(maxCount, currCount);
                currCount = 1;
            } 
        }
        
        maxCount = Math.max(maxCount, currCount);
        System.out.println(maxCount);
        input.close();
    }
}