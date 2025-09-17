public class FinallySkipExample {

    public static void main(String[] args) {
        try {
            System.err.println("Try block");
            System.exit(0);
        }
        catch (Exception e) {
            System.out.println("catch block");
        }
        finally {
            System.err.println("Finally block");
        }
    }
}
