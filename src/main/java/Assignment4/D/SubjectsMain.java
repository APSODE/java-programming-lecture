package Assignment4.D;

import Assignment4.D.subjects.Subject;
import Assignment4.D.subjects.SubjectBuilder;
import Assignment4.D.subjects.SubjectCredit;
import Assignment4.D.subjects.SubjectCreditBuilder;

public class SubjectsMain {
    public static void main(String[] args) {
        // 총학점 = Σ(이론)+(설계)+(0.5*실험/실습)
        // 총학점은 위의 계산식으로 Builder에서 계산해서 자동으로 지정되므로 따로 지정하는 함수가 존재하지 않음.
        SubjectCredit 테스트_학점 = SubjectCreditBuilder.createBuilder()
                .theory(2)
                .design(3)
                .experiment(4)
                .build();
        System.out.println("테스트 학점 : " + 테스트_학점);

        Subject 지도교수상담 = SubjectBuilder.createBuilder()
                .grade(0)
                .semester(1)
                .essential(false)
                .code("FP0001")
                .name("지도교수상담")
                .build();

        System.out.println(지도교수상담);
    }
}
