package Assignment6_2.Practice6;


import java.io.*;
import java.util.Date;


public class ObjectInputDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(args[0])
        );
        System.out.println((Date) ois.readObject());

        char c = ois.readChar();
        boolean b = ois.readBoolean();
        double d = ois.readDouble();
        String s = ois.readUTF();

        ois.close();
    }
}
