import java.util.Scanner;


public class HelpfulMaths{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        char[] s = input.nextLine().toCharArray();

        char temp;
        
        for(int i = 0; i < s.length-2; i+=2)
        {
            for(int j = i + 2; j < s.length; j+=2)
            {
                if(s[i] > s[j]){
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

        System.out.println(s);
        input.close();
    }
}