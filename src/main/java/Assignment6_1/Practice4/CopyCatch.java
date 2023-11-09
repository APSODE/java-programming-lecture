package Assignment6_1.Practice4;

import java.io.*;
public class CopyCatch {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("sourceFile");
            out = new FileWriter("targetFile");

            int c;
            while ((c = in.read()) != -1) { // EOF 검사
                out.write(c);
            }
            in.close();
            out.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}