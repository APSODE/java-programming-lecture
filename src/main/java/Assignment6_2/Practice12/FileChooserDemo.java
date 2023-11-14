package Assignment6_2.Practice12;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileChooserDemo {
    public static void main(String... args) throws IOException {
        JFileChooser fc = new JFileChooser();
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                System.out.println(input.nextLine());
            }

            input.close();
        } else {
            System.out.println("No file selected");
        }
    }
}
