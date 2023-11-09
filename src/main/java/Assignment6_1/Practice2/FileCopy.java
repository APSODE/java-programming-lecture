package Assignment6_1.Practice2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy { // 예외 처리 방법(1) - 예외 처리기
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            //sourceFile targetFile
            // in = new FileInputStream(args[0]);
            in = new FileInputStream("sourceFile");
            // out = new FileOutputStream(args[1]);
            out = new FileOutputStream("targetFile");

            int c;
            while ((c = in.read()) != -1) { out.write(c); }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getStackTrace());

        } finally {
            try {
                if (in != null) in.close(); if (out != null) out.close();
            } catch (IOException e) {

            }
        }
    }
}