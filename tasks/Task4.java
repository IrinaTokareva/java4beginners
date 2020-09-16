import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате (не больше 10 знаков):");
        int n_bin;
        try {
            n_bin = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("В числе должно быть не больше 10 знаков");
            return;
        }
        if (!verifyBinary(n_bin)) {
            System.out.println("Число должно содержать только нули и единицы");
            return;
        }
        int n_dec = 0;
        int i = 0;
        while (n_bin != 0) {
            n_dec += n_bin % 10 * Math.pow(2, i);
            n_bin = n_bin / 10;
            i++;
        }
        System.out.println("Число в десятичном формате: " + n_dec);
    }

    public static boolean verifyBinary(int n) {
        return Integer.toString(n)
                .replace("1", "")
                .replace("0", "")
                .equals("");
    }
}
