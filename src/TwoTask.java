import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TwoTask {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String one = br.readLine();
            String two = br.readLine();
            String three = br.readLine();
            if (one.equals(">")) {
                a++;
                b--;
            } else if (one.equals("<")) {
                a--;
                b++;
            } else if (one.equals("=")) {
                a++;
                b++;
            }
            if (two.equals(">")) {
                a++;
                c--;
            } else if (two.equals("<")) {
                a--;
                c++;
            } else if (two.equals("=")) {
                a++;
                c++;
            }
            if (three.equals(">")) {
                b++;
                c--;
            } else if (three.equals("<")) {
                b--;
                c++;
            } else if (three.equals("=")) {
                b++;
                c++;
            }
            HashMap<String, Integer> hashMap = new HashMap<>();
            hashMap.put("a", a);
            hashMap.put("b", b);
            hashMap.put("c", c);
            hashMap.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue())
                    .forEach(entry -> {
                        System.out.print(entry.getKey());
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
