import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

public class P0011 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             PrintWriter pw = new PrintWriter("output.txt")) {
            String[] parts = br.readLine().split(" ");
            int K = Integer.parseInt(parts[0]);
            int N = Integer.parseInt(parts[1]);
            BigInteger[] array = new BigInteger[N];
            for (int i = 0; i < N; i++) {
                if (i < K) {
                    array[i] = BigInteger.ONE;
                } else {
                    array[i] = BigInteger.ZERO;
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = Math.max(0, i - K); j < i; j++) {
                    array[i] = array[i].add(array[j]);
                }
            }
            pw.println(array[N - 1]);
        }
    }
}
