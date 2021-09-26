import org.junit.Test;

public class T0004 {
    @Test
    public void test0() throws Exception {
        IOTest.create()
                .addToInputTXT("5")
                .runSolution(P0004.class)
                .checkInOutputTXT("594")
                .close();

        IOTest.create()
                .addToInputTXT("2")
                .runSolution(P0004.class)
                .checkInOutputTXT("297")
                .close();

        IOTest.create()
                .addToInputTXT("7")
                .runSolution(P0004.class)
                .checkInOutputTXT("792")
                .close();
    }
}
