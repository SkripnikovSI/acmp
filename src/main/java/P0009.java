import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class P0009 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             PrintWriter pw = new PrintWriter("output.txt")) {
            br.readLine();
            String[] parts = br.readLine().split(" ");
            int[] array = new int[parts.length];
            int sum = 0;
            int product = 1;
            int indexMax = 0;
            int indexMin = 0;
            for (int i = 0; i < parts.length; i++) {
                array[i] = Integer.parseInt(parts[i]);
                if (array[i] > 0) {
                    sum += array[i];
                }
                if (array[i] > array[indexMax]) {
                    indexMax = i;
                }
                if (array[i] < array[indexMin]) {
                    indexMin = i;
                }
            }
            int start = Math.min(indexMax, indexMin) + 1;
            int end = Math.max(indexMax, indexMin);
            for (int i = start; i < end; i++) {
                product *= array[i];
            }
            pw.println(String.format("%d %d", sum, product));
        }
    }
}
