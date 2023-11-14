package Assignment6_2.Practice2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void fileCopy(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(args[0]);
            out = new FileOutputStream(args[1]);

            int c;
            while ((c = in.read()) != -1)
                out.write(c);
        } finally {

            if (in != null) { in.close(); }
            if (out != null) { out.close(); }
        }
    }

    public static void main(String[] args) throws IOException {
        FileCopy.fileCopy(new String[]{"sourceFile", "targetFile"});
    }
}
