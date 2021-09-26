import java.io.*;

public class P0001 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             PrintWriter pw = new PrintWriter("output.txt")) {
            String[] parts = br.readLine().split(" ");
            pw.print(Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]));
        }
    }
}
