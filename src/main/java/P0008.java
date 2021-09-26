import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class P0008 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             PrintWriter pw = new PrintWriter("output.txt")) {
            String[] parts = br.readLine().split(" ");
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);
            int C = Integer.parseInt(parts[2]);
            if (A * B == C) {
                pw.println("YES");
            } else {
                pw.println("NO");
            }
        }
    }
}
