import java.util.Scanner;

public class BrainPhotos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(), m = input.nextInt();

        char color = 'Z';

        for(int i = 0; i < (n*m); i++)
        {
            color = input.next().charAt(0);
            
            if(color == 'C' || color == 'M' || color == 'Y')
            {
                System.out.println("#Color");
                input.close();
                return;
            }
        }

        System.out.println("#Black&White");
        input.close();
    }
}