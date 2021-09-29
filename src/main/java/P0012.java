import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class P0012 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             PrintWriter pw = new PrintWriter("output.txt")) {
            int answer = 0;
            for (int N = Integer.parseInt(br.readLine()); N > 0; N--) {
                String[] parts = br.readLine().split(" ");
                int x = Integer.parseInt(parts[0]);
                int y = Integer.parseInt(parts[1]);
                int[] array = new int[10];
                for (int i = 0; i < 8; i++) {
                    array[i] = Integer.parseInt(parts[i + 2]);
                }
                array[8] = array[0];
                array[9] = array[1];
                boolean left = false;
                boolean right = false;
                for (int i = 0; i < 7; i += 2) {
                    long side = side(array[i], array[i + 1], array[i + 2], array[i + 3], x, y);
                    if (side > 0) {
                        left = true;
                    } else if (side < 0) {
                        right = true;
                    }
                }
                if (!left || !right) {
                    answer++;
                }
            }
            pw.println(answer);
        }
    }

    public static long side(long x1, long y1, long x2, long y2, long x, long y) {
        return (y - y1) * (x2 - x1) - (x - x1) * (y2 - y1);
    }
}
