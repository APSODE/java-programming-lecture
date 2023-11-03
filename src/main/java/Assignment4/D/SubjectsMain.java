package Assignment4.D;

import Assignment4.D.subjects.Subject;
import Assignment4.D.subjects.SubjectBuilder;
import Assignment4.D.subjects.SubjectCredit;
import Assignment4.D.subjects.SubjectCreditBuilder;

public class SubjectsMain {
    public static void main(String[] args) {
        SubjectCredit 지도교수상담_학점 = SubjectCreditBuilder.createBuilder().build();

        Subject 지도교수상담 = SubjectBuilder.createBuilder()
                .grade(0)
                .semester(1)
                .essential(false)
                .code("FP0001")
                .name("지도교수상담")
                .credit(지도교수상담_학점)
                .build();

        System.out.println(지도교수상담);
    }
}
