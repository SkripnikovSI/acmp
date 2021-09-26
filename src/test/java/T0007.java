import org.junit.Test;

public class T0007 {
    @Test
    public void test0() throws Exception {
        IOTest.create()
                .addToInputTXT("5 7 3")
                .runSolution(P0007.class)
                .checkInOutputTXT("7")
                .close();

        IOTest.create()
                .addToInputTXT("987531 234 86364")
                .runSolution(P0007.class)
                .checkInOutputTXT("987531")
                .close();

        IOTest.create()
                .addToInputTXT("189285 283 4958439238923098349024")
                .runSolution(P0007.class)
                .checkInOutputTXT("4958439238923098349024")
                .close();
    }

    @Test
    public void test1() throws Exception {
        IOTest.create()
                .addToInputTXT("1 2 3")
                .runSolution(P0007.class)
                .checkInOutputTXT("3")
                .close();
    }

    @Test
    public void test2() throws Exception {
        IOTest.create()
                .addToInputTXT("10 2 3")
                .runSolution(P0007.class)
                .checkInOutputTXT("10")
                .close();
    }
}
