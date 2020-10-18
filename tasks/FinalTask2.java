import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // сортировка Шелла
        for (int s: getSteps(arr.length)) {
            for (int i = s; i < arr.length; i++) {
                for (int j = i - s; j >= 0; j -= s) {
                    if (arr[j] > arr[j + s]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + s];
                        arr[j + s] = tmp;
                    }
                }
            }
        }
        System.out.println("Отсортированный массив:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    private static List<Integer> getSteps(int arrayLength) {
        // эмпирическая последовательность Марцина Циура
        List<Integer> stepsBest = Arrays.asList(1750, 701, 301, 132, 57, 23, 10, 4, 1);
        List<Integer> steps = new ArrayList<>(stepsBest);
        for (Integer s: stepsBest) {
            if (s >= arrayLength) {
                steps.remove(s);
            } else {
                break;
            }
        }
        return steps;
    }
}
