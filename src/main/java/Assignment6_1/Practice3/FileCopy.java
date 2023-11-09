package Assignment6_1.Practice3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        // args[0] => sourceFile
        // args[1] => targetFile
        try (FileInputStream in = new FileInputStream("sourceFile");
             FileOutputStream out = new FileOutputStream("targetFile")) {

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}