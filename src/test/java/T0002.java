import org.junit.Test;

public class T0002 {
    @Test
    public void test0() throws Exception {
        IOTest.create()
                .addToInputTXT("5")
                .runSolution(P0002.class)
                .checkInOutputTXT("15")
                .close();
    }

    @Test
    public void test1() throws Exception {
        IOTest.create()
                .addToInputTXT("10000")
                .runSolution(P0002.class)
                .checkInOutputTXT("50005000")
                .close();
    }

    @Test
    public void test2() throws Exception {
        IOTest.create()
                .addToInputTXT("-3")
                .runSolution(P0002.class)
                .checkInOutputTXT("-5")
                .close();
    }

    @Test
    public void test3() throws Exception {
        IOTest.create()
                .addToInputTXT("-10000")
                .runSolution(P0002.class)
                .checkInOutputTXT("-50004999")
                .close();
    }

    @Test
    public void test4() throws Exception {
        IOTest.create()
                .addToInputTXT("0")
                .runSolution(P0002.class)
                .checkInOutputTXT("1")
                .close();
    }
}
