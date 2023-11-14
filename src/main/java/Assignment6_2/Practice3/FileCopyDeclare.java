package Assignment6_2.Practice3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDeclare {
    public static void fileCopy(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream(args[0]);
             FileOutputStream out = new FileOutputStream(args[1])) {
            int c;
            while ((c = in.read()) != -1) out.write(c);
        }
    }

    public static void main(String[] args) throws IOException {
        FileCopyDeclare.fileCopy(new String[]{"sourceFile", "targetFile"});
    }
}
