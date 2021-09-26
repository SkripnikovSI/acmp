import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class P0003 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             PrintWriter pw = new PrintWriter("output.txt")) {
            long A = Long.parseLong(br.readLine());
            pw.println(A*A);
        }
    }
}
