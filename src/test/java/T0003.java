import org.junit.Test;

public class T0003 {
    @Test
    public void test0() throws Exception {
        IOTest.create()
                .addToInputTXT("5")
                .runSolution(P0003.class)
                .checkInOutputTXT("25")
                .close();

        IOTest.create()
                .addToInputTXT("75")
                .runSolution(P0003.class)
                .checkInOutputTXT("5625")
                .close();

        IOTest.create()
                .addToInputTXT("4255")
                .runSolution(P0003.class)
                .checkInOutputTXT("18105025")
                .close();
    }

    @Test
    public void test1() throws Exception {
        IOTest.create()
                .addToInputTXT("399995")
                .runSolution(P0003.class)
                .checkInOutputTXT("159996000025")
                .close();
    }
}
