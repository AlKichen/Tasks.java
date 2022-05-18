import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/*Даны две строки строчных латинских символов: строка J и строка S.
Символы, входящие в строку J, — «драгоценности», входящие в строку S — «камни».
Нужно определить, какое количество символов из S одновременно являются «драгоценностями».
Проще говоря, нужно проверить, какое количество символов из S входит в J.*/

public class SearchForAllOccurrences {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String H = br.readLine();
            Set<Character> set = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            for (char c : H.toCharArray()) {
                if (!set.contains(c)) {
                    set.add(c);
                    sb.append(c);
                }
            }
            String J = sb.toString();
            String S = br.readLine();
            int count = 0;
            for (int i = 0; i < J.length(); i++) {
                count += numMatches(S, String.valueOf(J.charAt(i)));
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int numMatches(String str, String query) {
        int index = str.indexOf(query);
        if (index == -1)
            return 0;
        else
            return 1 + numMatches(str.substring(index + query.length()), query);
    }
}
