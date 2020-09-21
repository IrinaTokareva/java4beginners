import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число строк в матрице:");
        int m = scanner.nextInt();
        System.out.println("Введите число столбцов в матрице:");
        int n = scanner.nextInt();
        int [][] arr = new int[m][n];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < m; i++) {
            System.out.println("Строка №" + (i + 1));
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("Первая строка матрицы, где все элементы умножены на 3:");
        for (int j : arr[0]) {
            System.out.print((j * 3) + " ");
        }
    }
}
