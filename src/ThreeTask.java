import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeTask {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String s = br.readLine();
            Long num = Long.parseLong(s);
            int count = 0;
            while ((num % 10) == 0) {
                num = num / 10;
                count++;
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
