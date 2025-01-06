import java.util.Scanner;


public class IsRated {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] rateAfter = new int[n];

        int rateBefore;
        
        for(int i = 0; i < n; i++)
        {
            rateBefore = input.nextInt(); 
            rateAfter[i] = input.nextInt(); 
            
            if(rateBefore != rateAfter[i]){
                System.out.println("rated");
                input.close();
                return;
            }
        }

        for(int i = 1; i < n; i++)
        {
            if(rateAfter[i] > rateAfter[i-1]){
                System.out.println("unrated");
                input.close();
                return;
            }
        }

        System.out.println("maybe");
        input.close();
    }
}