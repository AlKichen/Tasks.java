import java.io.*;

public class NewClass2 {
    private static final String inputFile = "C:\\Users\\ASUS\\Desktop\\input.txt";
    private static final String outputFile = "C:\\Users\\ASUS\\Desktop\\output.txt";

    public static void main(String[] args) {
        try (BufferedReader fr = new BufferedReader(new FileReader(inputFile));
             FileWriter fw = new FileWriter(outputFile)) {
            String s = String.valueOf(fr.readLine());
            String[] strings = s.split(" ");
            int number1 = Integer.parseInt(strings[0]);
            int number2 = Integer.parseInt(strings[1]);
            int sum = number1 + number2;
            fw.write(Integer.toString(sum));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
