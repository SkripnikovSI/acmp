import java.io.*;
import java.util.regex.Pattern;

public class P0006 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             PrintWriter pw = new PrintWriter("output.txt")) {
            String m = br.readLine();
            if (Pattern.matches("^[A-H][1-8]-[A-H][1-8]$", m)) {
                int dx = Math.abs(m.charAt(0) - m.charAt(3));
                int dy = Math.abs(m.charAt(1) - m.charAt(4));
                if (dx == 1 && dy == 2 || dx == 2 && dy == 1) {
                    pw.println("YES");
                } else {
                    pw.println("NO");
                }
            } else {
                pw.println("ERROR");
            }
        }
    }
}
