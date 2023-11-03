package Assignment4.D.subjects;

public class Subject {
    private final int grade;
    private final int semester;
    private final boolean essential;
    private final String code;
    private final String name;
    private final SubjectCredit credit;

    protected Subject(int grade, int semester, boolean essential, String code, String name, SubjectCredit credit) {
        this.grade = grade;
        this.semester = semester;
        this.essential = essential;
        this.code = code;
        this.name = name;
        this.credit = credit;
    }

    public int getGrade() {
        return grade;
    }

    public boolean isEssential() {
        return essential;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public SubjectCredit getCredit() {
        return credit;
    }

    public int getSemester() {
        return semester;
    }

    private String getGradeWithStringFormat() {
        return (this.grade == 0 ? "전" : this.grade) + "학년";
    }

    private String getEssentialWithStringFormat() {
        return "전공" + (this.essential ? "필수" : "선택");
    }

    @Override
    public String toString() {
        return this.name + "<" +
                "학년=" + this.getGradeWithStringFormat() + ", " +
                "학기=" + this.semester + "학기" + ", " +
                "이수구분=" + this.getEssentialWithStringFormat() + ", " +
                "과목코드=" + this.code + ", " +
                "교과목명=" + this.name + ", " +
                "학점=" + this.credit.toString()
                + ">";
    }
}
