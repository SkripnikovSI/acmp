import org.junit.Test;

public class T0005 {
    @Test
    public void test0() throws Exception {
        IOTest.create()
                .addToInputTXT("5")
                .addToInputTXT("4 16 19 31 2")
                .runSolution(P0005.class)
                .checkInOutputTXT("19 31")
                .checkInOutputTXT("4 16 2")
                .checkInOutputTXT("YES")
                .close();

        IOTest.create()
                .addToInputTXT("8")
                .addToInputTXT("29 4 7 12 15 17 24 1")
                .runSolution(P0005.class)
                .checkInOutputTXT("29 7 15 17 1")
                .checkInOutputTXT("4 12 24")
                .checkInOutputTXT("NO")
                .close();
    }
}
