package Assignment6_2.Practice9;

import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("java FileCopy <소스파일> <목적파일>");
        } else {
            try {
                copy(args[0], args[1]);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void copy(String from, String to) throws IOException {
        File fromFile = new File(from);
        File toFile = new File(to);

        if (!fromFile.exists()) {
            throw new IOException("파일 존재하지 않음: " + from);
        }
        if (!fromFile.isFile()) {
            throw new IOException("디렉토리 복사 불가: " + from);
        }
        if (!fromFile.canRead()) {
            throw new IOException("파일 읽기 불가: " + from);
        }

        if (toFile.isDirectory()) {
            toFile = new File(toFile, fromFile.getName());
        }

        if (toFile.exists()) {
            if ( !toFile.canWrite() ) {
                abort("목적 파일 쓰기 불가: " + to);
            }
            System.out.println("덮어쓸까요? " + to + " (Y/N): ");


            Scanner s = new Scanner(System.in);
            String response = s.next();
            if (!response.equals("Y") && !response.equals("y")) {
                abort("덮어 쓰지 않고 마침니다.");
            }
        } else {
            String parent = toFile.getParent();
            if (parent == null) parent = System.getProperty("user.dir");
            File dir = new File(parent);

            if (!dir.exists()) {
                abort("목적 디렉토리가 존재하지 않음: " + parent);
            }
            if (dir.isFile()) {
                abort("목적지가 디렉토리가 아님: " + parent);
            }
            if (!dir.canWrite()) {
                abort("목적 디렉토리 쓰기 불가: " + parent);
            }
        }

        try ( FileInputStream in = new FileInputStream(fromFile);
              FileOutputStream out = new FileOutputStream(toFile) ) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }
    }

    private static void abort(String msg) throws IOException {
        throw new IOException(
                "FileCopy: " + msg);
    }
}
