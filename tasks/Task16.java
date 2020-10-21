import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task16 {
    public static void main(String[] args) {
        String filename = "files/textForTask16.txt";
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(filename));
            System.out.println("Текст из файла:");
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
