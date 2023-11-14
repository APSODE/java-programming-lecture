package Assignment6_2.Practice8;

import java.io.*;
import java.util.*;

class FileInfo {
    public static void main(String[] args) throws IOException {
        File f = new File("./../io", "FileInfo.java");
        if (f.exists()) {
            if (f.isFile()) {
                System.out.println( f.getParent() );
                System.out.println( f.getName() );
                System.out.println( f.getPath() );
                System.out.println( f.getAbsolutePath() );
                System.out.println( f.getCanonicalPath() );
                System.out.println( f.length() );
                System.out.println(new Date(f.lastModified()));

            } else {
                String[] names = f.list();
                for (String x : names)
                    System.out.println(x);
            }
        }
    }
}

class FileInfo2 {
    public static void main(String[] args) throws IOException {
        File f = new File(args[0]);
        if (f.exists()) {
            if (f.isFile()) printProperty(f);
            else {
                File[] entries = f.listFiles();
                for (File x : entries) printProperty(x);
            }
        }
    }
    private static void printProperty(File f) throws IOException {
        System.out.print(f.getCanonicalPath());
        System.out.print("\t" + f.length());
        System.out.println("\t" + new Date(f.lastModified()));
    }
}