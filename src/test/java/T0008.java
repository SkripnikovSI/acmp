import org.junit.Test;

public class T0008 {
    @Test
    public void test0() throws Exception {
        IOTest.create()
                .addToInputTXT("8 54 432")
                .runSolution(P0008.class)
                .checkInOutputTXT("YES")
                .close();

        IOTest.create()
                .addToInputTXT("16 19 777")
                .runSolution(P0008.class)
                .checkInOutputTXT("NO")
                .close();
    }
}
