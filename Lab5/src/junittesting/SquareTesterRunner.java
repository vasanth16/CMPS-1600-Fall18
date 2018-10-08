package junittesting;

public class SquareTesterRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(SquareTester.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}