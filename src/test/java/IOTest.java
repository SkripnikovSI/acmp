import org.junit.Assert;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class IOTest {
    private PrintWriter pw;
    private BufferedReader br;

    private IOTest() throws Exception {
        pw = new PrintWriter("input.txt");
    }

    public static IOTest create() throws Exception {
        return new IOTest();
    }

    public IOTest addToInputTXT(String str) {
        pw.println(str);
        return this;
    }

    public IOTest runSolution(Class<?> clazz) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, FileNotFoundException {
        pw.close();
        clazz.getMethod("main", String[].class)
                .invoke(null, (Object) null);
        br = new BufferedReader(new FileReader("output.txt"));
        return this;
    }

    public IOTest checkInOutputTXT(String str) throws IOException {
        Assert.assertEquals(str, br.readLine());
        return this;
    }

    public void close() throws IOException {
        br.close();
    }
}
