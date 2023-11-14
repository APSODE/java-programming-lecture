package Assignment6_2.Practice5;


import java.io.*;


public class DataOutputDemo {
    public static void main(String[] args) throws IOException {
        // 출력 데이터 스트림 생성
        DataOutputStream dos = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(args[0])
                )
        );

        // 쓰기 연산 수행
        dos.writeUTF( "홍길동" );
        dos.writeChar( 'M' );
        dos.writeInt( 20221001 );
        dos.writeFloat( 0.8F );
        dos.writeBoolean( true );

        // 스트림 닫기
        dos.close();
    }
}