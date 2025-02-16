import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String remix = scanner.nextLine();
        scanner.close();

        System.out.println(remix.replace("WUB", " ").trim().replaceAll("\\s+", " "));
    }
}