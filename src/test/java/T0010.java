import org.junit.Test;

public class T0010 {
    @Test
    public void test0() throws Exception {
        IOTest.create()
                .addToInputTXT("1 -3 0 0")
                .runSolution(P0010.class)
                .checkInOutputTXT("0 3")
                .close();

        IOTest.create()
                .addToInputTXT("3 -15 18 0")
                .runSolution(P0010.class)
                .checkInOutputTXT("0 2 3")
                .close();

        IOTest.create()
                .addToInputTXT("1 -7 -33 135")
                .runSolution(P0010.class)
                .checkInOutputTXT("-5 3 9")
                .close();
    }
}
