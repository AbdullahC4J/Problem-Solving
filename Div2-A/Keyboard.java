import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";

        Scanner scanner = new Scanner(System.in);

        String dir = scanner.nextLine();
        String seqChar = scanner.nextLine();

        for (int i = 0; i < seqChar.length(); i++) {
            int index = keyboard.indexOf(seqChar.charAt(i));

            if(dir.equals("R"))
                System.out.print(keyboard.charAt(index - 1));
            else
                System.out.print(keyboard.charAt(index + 1));
        }
        
        scanner.close();
    }
}