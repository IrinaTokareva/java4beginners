import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        String S = scanner.nextLine();
        int X;
        try {
            X = Integer.parseInt(S);
        } catch (NumberFormatException e) {
            System.out.println(S + " не является целым числом");
            return;
        }
        double Y = X;
        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);
    }
}
