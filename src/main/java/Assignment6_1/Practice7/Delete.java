package Assignment6_1.Practice7;

import java.io.File;

public class Delete {
    public static void main(String... args) {
        try {
            // 간단한 실습을 위해 args[0]을 강제로 "deleteFile"으로 변경하였음
            String deleteFile = "deleteFile";
            File f = new File(deleteFile);

            if ( !f.exists() )
                throw new IllegalArgumentException("파일 없음: " + deleteFile);
            if ( !f.canWrite() )
                throw new IllegalArgumentException("쓰기 방지: " + deleteFile);
            if ( f.isDirectory() && f.list().length>0 )
                throw new IllegalArgumentException("빈 디렉토리 아님: " + deleteFile);
            if ( !f.delete() )
                throw new IllegalArgumentException("삭제 실패");
        } catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
    }
}
