import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class P0002 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             PrintWriter pw = new PrintWriter("output.txt")) {
            int N = Integer.parseInt(br.readLine());
            int sum = 0;
            if (N >= 1) {
                for (int i = 1; i <= N; i++) {
                    sum += i;
                }
            } else {
                for (int i = 1; i >= N; i--) {
                    sum += i;
                }
            }
            pw.println(sum);
        }
    }
}
