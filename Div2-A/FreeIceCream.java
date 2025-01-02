import java.util.Scanner;


public class FreeIceCream {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        long x = input.nextInt();

        int distress = 0;
        String op;
        int d = 0;

        for(int i = 0; i < n; i++){
            op = input.next();
            d = input.nextInt();

            switch(op){
                case "+": x += d; break;
                
                case "-":
                        if(d <= x) x -= d;
                        else distress++;
                        break;
            }
        }

        System.out.println(x +" "+distress);
        input.close();
    }
}