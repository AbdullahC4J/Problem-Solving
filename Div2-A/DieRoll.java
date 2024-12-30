import java.util.Scanner;

public class DieRoll {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int y = input.nextInt();
        int w = input.nextInt();

        int p = Math.max(y, w);
    
        switch(p){
            case 1 -> System.out.println("1/1");
            case 2 -> System.out.println("5/6");
            case 3 -> System.out.println("2/3");
            case 4 -> System.out.println("1/2");
            case 5 -> System.out.println("1/3");
            case 6 -> System.out.println("1/6");
        };

        input.close();

    }
}

/*
 import java.util.Scanner;

public class DieRoll {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int y = input.nextInt();
        int w = input.nextInt();

        int p = Math.max(y, w); // Maximum of y and w
        int favorableOutcomes = 6 - p + 1; // Outcomes >= p
        int gcd = gcd(favorableOutcomes, 6); // Greatest Common Divisor for simplification

        System.out.println((favorableOutcomes / gcd) + "/" + (6 / gcd));

        input.close(); // Close the scanner
    }

    // Method to calculate the Greatest Common Divisor (GCD)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

 */