import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FiveTask {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int k = Integer.parseInt(br.readLine());
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = i + 1;
            }
            List<String> stringList = ordersAsStrings(ar);
            int count = 0;
            for (String s : stringList) {
                int sum = Sum(s);
                if (sum % k == 0) {
                    count++;
                }
            }
            System.out.println(count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int Sum(String str) {
        int[] numArr = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            sum = sum + (numArr[i] * i);
        }
        return sum;
    }

    public static Set<String> filter(int[] arr) {
        Set<String> s = new HashSet<String>();
        for (StringBuilder sb : orders(arr)) {
            s.add(sb.toString());
        }
        return s;
    }

    public static List<String> ordersAsStrings(int[] arr) {
        List<String> l = new ArrayList<String>();
        for (StringBuilder sb : orders(arr)) {
            l.add(sb.toString());
        }
        return l;
    }

    public static List<StringBuilder> orders(int[] arr) {
        if (arr.length == 2) {
            StringBuilder sb1 = new StringBuilder();
            sb1.append(arr[0]);
            sb1.append(arr[1]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(arr[1]);
            sb2.append(arr[0]);
            return Arrays.asList(sb1, sb2);
        } else {
            List<StringBuilder> l = new ArrayList<StringBuilder>();

            for (int i = 0; i < arr.length; i++) {
                for (StringBuilder sb : orders(excCopy(arr, i))) {
                    l.add(sb.insert(0, arr[i]));
                }
            }
            return l;
        }
    }

    private static int[] excCopy(int[] arr, int idx) {
        int[] result = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != idx) {
                result[j++] = arr[i];
            }
        }
        return result;
    }
}


