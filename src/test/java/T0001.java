import org.junit.Test;

public class T0001 {
    @Test
    public void test0() throws Exception {
        IOTest.create()
                .addToInputTXT("2 3")
                .runSolution(P0001.class)
                .checkInOutputTXT("5")
                .close();
    }

    @Test
    public void test1() throws Exception {
        IOTest.create()
                .addToInputTXT("1 2")
                .runSolution(P0001.class)
                .checkInOutputTXT("3")
                .close();
    }

    @Test
    public void test2() throws Exception {
        IOTest.create()
                .addToInputTXT("-4 -26")
                .runSolution(P0001.class)
                .checkInOutputTXT("-30")
                .close();
    }
}
