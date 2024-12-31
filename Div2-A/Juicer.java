import java.util.Scanner;

public class Juicer{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int b = input.nextInt();
        int d = input.nextInt();

        int container = 0, count = 0, a; 
        for(int i = 0; i < n; i++)
        {
            a = input.nextInt();
            if(a > b)
                continue;
            
            container += a;

            if(container > d)
            {
                count++;
                container = 0;
            }
        }
        System.out.println(count);
        input.close();
    }
}