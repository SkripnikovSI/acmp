import org.junit.Test;

public class T0011 {
    @Test
    public void test0() throws Exception {
        IOTest.create()
                .addToInputTXT("1 3")
                .runSolution(P0011.class)
                .checkInOutputTXT("1")
                .close();

        IOTest.create()
                .addToInputTXT("2 7")
                .runSolution(P0011.class)
                .checkInOutputTXT("21")
                .close();

        IOTest.create()
                .addToInputTXT("3 10")
                .runSolution(P0011.class)
                .checkInOutputTXT("274")
                .close();
    }

    @Test
    public void test1() throws Exception {
        IOTest.create()
                .addToInputTXT("1 1")
                .runSolution(P0011.class)
                .checkInOutputTXT("1")
                .close();
    }

    @Test
    public void test2() throws Exception {
        IOTest.create()
                .addToInputTXT("2 2")
                .runSolution(P0011.class)
                .checkInOutputTXT("2")
                .close();
    }

    @Test
    public void test3() throws Exception {
        IOTest.create()
                .addToInputTXT("300 300")
                .runSolution(P0011.class)
                .checkInOutputTXT("1018517988167243043134222844204689080525734196832968125318070224677190649881668353091698688")
                .close();
    }
}
