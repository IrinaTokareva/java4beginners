import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Конвертер валют");
        System.out.println("Введите курс доллара:");
        double course = scanner.nextDouble();
        System.out.println("Введите сумму в рублях:");
        double roubles = scanner.nextDouble();
        System.out.println("Сумма в долларах:");
        double scale = Math.pow(10, 2);
        System.out.println(Math.round(roubles / course * scale) / scale);
    }
}
