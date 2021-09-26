import java.io.*;
import java.util.Arrays;

public class P0007 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             PrintWriter pw = new PrintWriter("output.txt")) {
            String[] parts = br.readLine().split(" ");
            Arrays.sort(parts, (s1, s2) -> {
                if (s1.length() != s2.length()) {
                    return s2.length() - s1.length();
                } else {
                    for (int i = 0; i < s1.length(); i++) {
                        if (s1.charAt(i) != s2.charAt(i)) {
                            return s2.charAt(i) - s1.charAt(i);
                        }
                    }
                }
                return 0;
            });
            pw.println(parts[0]);
        }
    }
}
