import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = scanner.nextLine();
        System.out.println("Введенная строка без пробелов:");
        System.out.println(s.replaceAll("\\s+", ""));
    }
}
