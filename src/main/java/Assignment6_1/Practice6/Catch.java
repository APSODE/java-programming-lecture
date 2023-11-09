package Assignment6_1.Practice6;

public class Catch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int x = a/b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
