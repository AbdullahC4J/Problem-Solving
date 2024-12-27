import java.util.Scanner;


public class PoliceRecruits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int inDuty = 0;
        int unResCrime = 0;
        int temp = 0;
        for(int i = 0; i < n; i++)
        {
            temp = input.nextInt();
            if(temp == -1 && inDuty == 0) unResCrime++;
            else inDuty += temp;
        }

        System.out.println(unResCrime);
        input.close();
    }
}