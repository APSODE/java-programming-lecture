package Assignment6_2.Practice10;


import java.io.*;


public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw")) {
            inout.setLength(0);

            for (int i = 0; i < 200; i++) {
                inout.writeInt(i);
            }
            System.out.println("현재 파일 길이 " + inout.length());

            inout.seek(0); System.out.println("1st: " + inout.readInt());
            inout.seek((5-1) * 4); System.out.println("5th: " + inout.readInt());
            inout.seek((7-1)*4); inout.writeInt(666);
            inout.seek(inout.length()); inout.writeInt(1111);
        }
    }
}
