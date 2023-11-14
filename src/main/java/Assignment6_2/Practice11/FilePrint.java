package Assignment6_2.Practice11;


import java.io.*;


class FilePrint {
    public static void main (String[] args) throws IOException {
        char c;

        RandomAccessFile file = new RandomAccessFile (args[0], "rw");

        while ( file.getFilePointer() < file.length() ) {
            System.out.println(file.readLine());
        }
    }
}
