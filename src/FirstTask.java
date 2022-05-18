import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            if (A > B || A > (B / N)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
