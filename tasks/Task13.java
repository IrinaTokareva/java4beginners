import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первая строка:");
        String s1 = scanner.nextLine();
        System.out.println("Вторая строка:");
        String s2 = scanner.nextLine();
        if (s1.length() == s2.length()) {
            System.out.println("Длины строк одинаковые");
        } else {
            System.out.println("Строка с наибольшей длиной:");
            System.out.println(s1.length() > s2.length()? s1 : s2);
        }
    }
}
