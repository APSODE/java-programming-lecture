package Assignment6_2.Practice4;

import java.io.*;


public class SafeLineIO {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("in.txt"));
             PrintWriter out = new PrintWriter(new FileWriter("out.txt"))) {
            String s;
            while ((s = in.readLine()) != null) {    //라인 단위 입력; EOF 검사
                out.println(s);                        //라인 단위 출력
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}