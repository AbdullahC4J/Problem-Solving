import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        String str;
        int length = 0;

        for(int i = 0; i < n; i++){
            str = input.nextLine();
            length = str.length();
            if(length <= 10){
                System.out.println(str);
            }else{
                System.out.println(str.charAt(0) + "" + (length-2) + "" + str.charAt(length-1));
            }
        }

        input.close();
    }
}