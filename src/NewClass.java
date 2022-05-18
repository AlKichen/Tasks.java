import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewClass {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String s = br.readLine();
            String [] strings = s.split(" ");
            int number1 = Integer.parseInt(strings[0]);
            int number2 = Integer.parseInt(strings[1]);
            int sum = number1 + number2;
            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
