import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class GravityFlip{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        byte n = input.nextByte();
        ArrayList<Byte> a = new ArrayList<>(n);
        for(byte i = 0; i < n; i++)
        {
            a.add(input.nextByte());
        }

        Collections.sort(a);

        for(byte i = 0; i < n; i++)
            System.out.printf("%d ", a.get(i));

        input.close();
    }
}