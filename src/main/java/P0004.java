import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class P0004 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             PrintWriter pw = new PrintWriter("output.txt")) {
            int K = Integer.parseInt(br.readLine());
            pw.print(K);
            pw.print(9);
            pw.println(9 - K);
        }
    }
}
