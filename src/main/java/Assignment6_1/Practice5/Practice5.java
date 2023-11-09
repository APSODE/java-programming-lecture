package Assignment6_1.Practice5;

public class Practice5 {
    public static void main(String[] args) {
        new Practice5().mX();
    }

    int mX() {
        try {
            // 실습을 위해 강제로 Exception 발생이 가능하도록 만들었음
            return FindX.findX(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class FindX {
    public static int findX(boolean directThrow) throws Exception {
        if (directThrow) {
            throw new Exception("에러!");
        } else {
            return 10;
        }
    }
}
