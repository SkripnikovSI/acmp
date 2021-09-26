import org.junit.Test;

public class T0006 {
    @Test
    public void test0() throws Exception {
        IOTest.create()
                .addToInputTXT("C7-D5")
                .runSolution(P0006.class)
                .checkInOutputTXT("YES")
                .close();

        IOTest.create()
                .addToInputTXT("E2-E4")
                .runSolution(P0006.class)
                .checkInOutputTXT("NO")
                .close();

        IOTest.create()
                .addToInputTXT("BSN")
                .runSolution(P0006.class)
                .checkInOutputTXT("ERROR")
                .close();
    }
}
