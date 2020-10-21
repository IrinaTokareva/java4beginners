import java.io.*;

public class Task17 {
    public static void main(String[] args) {
        String filename = "files/textForTask17.txt";
        try {
            FileWriter fileWriter = new FileWriter(filename, false);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println("Введите текст для записи в файл. Запись будет " +
                    "вестись построчно до тех пор, пока не будет введена команда " +
                    "\"стоп\" в консоли");
            String s;
            while (!(s = bufferedReader.readLine()).toLowerCase().equals("стоп")) {
                fileWriter.write(s + "\n");
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
