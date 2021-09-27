import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class P0010 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             PrintWriter pw = new PrintWriter("output.txt")) {
            String[] parts = br.readLine().split(" ");
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);
            int C = Integer.parseInt(parts[2]);
            int D = Integer.parseInt(parts[3]);
            boolean first = true;
            for (long x = -100; x <= 100; x++) {
                long xx = x * x;
                long xxx = xx * x;
                if (A * xxx + B * xx + C * x + D == 0) {
                    if (first) {
                        first = false;
                    } else {
                        pw.print(" ");
                    }
                    pw.print(x);
                }
            }
        }
    }
}
