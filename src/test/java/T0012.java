import org.junit.Test;

public class T0012 {
    @Test
    public void test0() throws Exception {
        IOTest.create()
                .addToInputTXT("3")
                .addToInputTXT("6 6 3 6 6 9 8 7 5 4")
                .addToInputTXT("13 5 9 2 9 8 12 8 12 2")
                .addToInputTXT("3 2 2 1 2 3 6 3 6 1")
                .runSolution(P0012.class)
                .checkInOutputTXT("2")
                .close();

    }

    @Test
    public void test1() throws Exception {
        IOTest.create()
                .addToInputTXT("1")
                .addToInputTXT("1 0 0 0 0 2 2 2 2 0")
                .runSolution(P0012.class)
                .checkInOutputTXT("1")
                .close();

    }

    @Test
    public void test2() throws Exception {
        IOTest.create()
                .addToInputTXT("1")
                .addToInputTXT("0 0 0 0 0 0 2 0 2 0")
                .runSolution(P0012.class)
                .checkInOutputTXT("1")
                .close();

    }
}
