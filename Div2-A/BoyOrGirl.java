import java.util.Scanner;



public class BoyOrGirl {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        boolean[] seen = new boolean[26];
        int count = 0;
        int indx;

        for(char t : str.toCharArray())
        {
            indx = t-'a';
            if(seen[indx] == false)
            {
                seen[indx] = true;
                count++;
            }
        }

        System.out.println((count%2 == 0)? "CHAT WITH HER!" : "IGNORE HIM!");
        input.close();
    }
}

/*
    char[] java.lang.String.toCharArray()
    Converts this string to a new character array.

    Returns:
    a newly allocated character array whose length is the length of this string and whose contents are initialized to contain the character sequence represented by this string.
 */