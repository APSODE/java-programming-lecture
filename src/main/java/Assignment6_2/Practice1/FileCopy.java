package Assignment6_2.Practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void fileCopy(String[] args) {
        FileInputStream in = null; FileOutputStream out = null;
        try {
            in = new FileInputStream(args[0]);
            out = new FileOutputStream(args[1]);

            int c;
            while ((c = in.read()) != -1)
                out.write(c);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (in != null)
                    in.close();
            } catch (IOException e) {}

            try {
                if (out != null)
                    out.close();
            } catch (IOException e) {}
        }
    }

    public static void main(String[] args) {
        FileCopy.fileCopy(new String[]{"sourceFile", "targetFile"});
    }
}
