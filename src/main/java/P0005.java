import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class P0005 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             PrintWriter pw = new PrintWriter("output.txt")) {
            int N = Integer.parseInt(br.readLine());
            List<String> oddList = new ArrayList<>();
            List<String> evenList = new ArrayList<>();
            for (String part : br.readLine().split(" ")) {
                int number = Integer.parseInt(part);
                if (number % 2 == 0) {
                    evenList.add(part);
                } else {
                    oddList.add(part);
                }
            }
            pw.println(String.join(" ", oddList));
            pw.println(String.join(" ", evenList));
            if (oddList.size() > evenList.size()) {
                pw.println("NO");
            } else {
                pw.println("YES");
            }
        }
    }
}
