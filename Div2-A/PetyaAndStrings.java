import java.util.Scanner;


public class PetyaAndStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s1 = input.nextLine();
        String s2 = input.nextLine();

        int i = s1.compareToIgnoreCase(s2);
        System.out.println( (i == 0)? 0 : (i < 0)? -1: 1 );
        input.close();
    }
}

/* 
    s1.compareToIgnoreCase(s2)    

    0: If the two strings are equal, ignoring case.
    Negative integer: If s1 is lexicographically less than s2, ignoring case.
    Positive integer: If s1 is lexicographically greater than s2, ignoring case. 
    
*/