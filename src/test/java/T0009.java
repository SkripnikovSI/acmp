import org.junit.Test;

public class T0009 {
    @Test
    public void test0() throws Exception {
        IOTest.create()
                .addToInputTXT("5")
                .addToInputTXT("-7 5 -1 3 9")
                .runSolution(P0009.class)
                .checkInOutputTXT("17 -15")
                .close();

        IOTest.create()
                .addToInputTXT("8")
                .addToInputTXT("3 14 -9 4 -5 1 -12 4")
                .runSolution(P0009.class)
                .checkInOutputTXT("26 180")
                .close();

        IOTest.create()
                .addToInputTXT("10")
                .addToInputTXT("-5 1 2 3 4 5 6 7 8 -3")
                .runSolution(P0009.class)
                .checkInOutputTXT("36 5040")
                .close();
    }
}
