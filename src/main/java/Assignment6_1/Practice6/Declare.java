package Assignment6_1.Practice6;

public class Declare {
    public static void main(String[] args) {
        int x = new Declare().divide(10, 0);
    }

    int divide(int a, int b) throws ArithmeticException{
        return a / b;
    }
}
