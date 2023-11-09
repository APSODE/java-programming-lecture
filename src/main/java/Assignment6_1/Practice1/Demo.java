package Assignment6_1.Practice1;
import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        int[] units = {12, 8, 13, 29, 50};
        DataOutputStream out = new DataOutputStream(new FileOutputStream("fileX"));

        // ✓파일 입출력 時 예외 발생 가능
        // ✓배열 접근 時 예외 발생 가능
        for (int i=0; i<100; i ++) out.writeInt( units[i] );
    }
}