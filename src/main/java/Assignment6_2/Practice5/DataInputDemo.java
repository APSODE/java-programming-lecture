package Assignment6_2.Practice5;

import java.io.*;

public class DataInputDemo {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(args[0])
                )
        );


        System.out.println( dis.readUTF() );
        System.out.println( dis.readChar() );
        System.out.println( dis.readInt() );
        System.out.println( dis.readFloat() );
        System.out.println( dis.readBoolean() );


        dis.close();
    }
}
