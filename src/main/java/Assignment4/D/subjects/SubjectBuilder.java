package Assignment4.D.subjects;

public class SubjectBuilder {
    private int grade = 0;
    private int semester = 1;
    private boolean essential = false;
    private String code = "CS0000";
    private String name = "과목 지정 안됨";
    private SubjectCredit credit = SubjectCreditBuilder.createBuilder().build();

    public static SubjectBuilder createBuilder() {
        return new SubjectBuilder();
    }

    public SubjectBuilder grade(int grade) {
        this.grade = grade;
        return this;
    }

    public SubjectBuilder semester(int semester) {
        this.semester = semester;
        return this;
    }

    public SubjectBuilder essential(boolean essential) {
        this.essential = essential;
        return this;
    }

    public SubjectBuilder code(String code) {
        this.code = code;
        return this;
    }

    public SubjectBuilder name(String name) {
        this.name = name;
        return this;
    }

    public SubjectBuilder credit(SubjectCredit subjectCredit) {
        this.credit = subjectCredit;
        return this;
    }

    public Subject build() {
        return new Subject(
                this.grade,
                this.semester,
                this.essential,
                this.code,
                this.name,
                this.credit
        );
    }
}
