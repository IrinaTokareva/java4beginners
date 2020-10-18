import java.io.*;

public class Task18 {
    public static void main(String[] args) {
        String filename = "C:/Users/USER/IdeaProjects/java4beginners/files/" +
                "textForTask18.txt";
        try {
            int numberOfLines = displayFileContent(filename);
            writeNumberOfLinesToFile(filename, numberOfLines);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int displayFileContent(String filename) throws IOException {
        int numberOfLines = 0;
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(filename));
        System.out.println("Текст из файла:");
        String s = bufferedReader.readLine();
        while (s != null) {
            numberOfLines++;
            System.out.println(s);
            s = bufferedReader.readLine();
        }
        return numberOfLines;
    }

    public static void writeNumberOfLinesToFile(String filename, int numberOfLines)
            throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("\nВведите текст для записи в файл. У вас " +
                "есть возможность ввести " + numberOfLines + " строк");
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numberOfLines; i++) {
            s.append(bufferedReader.readLine());
            if (i != numberOfLines - 1) {
                s.append("\n");
            }
        }
        FileWriter fileWriter = new FileWriter(filename, false);
        fileWriter.write(s.toString());
        fileWriter.flush();
        fileWriter.close();
    }
}