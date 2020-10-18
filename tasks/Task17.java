import java.io.*;

public class Task17 {
    public static void main(String[] args) {
        String filename = "C:/Users/USER/IdeaProjects/java4beginners/files/" +
                "textForTask17.txt";
        try {
            FileWriter fileWriter = new FileWriter(filename, false);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println("Введите текст для записи в файл. Запись будет " +
                    "вестись построчно до тех пор, пока не будет введена команда " +
                    "\"стоп\" в консоли");
            String s = bufferedReader.readLine();
            while (!s.toLowerCase().equals("стоп")) {
                fileWriter.write(s + "\n");
                s = bufferedReader.readLine();
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
