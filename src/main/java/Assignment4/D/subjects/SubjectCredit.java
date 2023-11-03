package Assignment4.D.subjects;


public class SubjectCredit {
    // SubjectCredit 객체는 처음 객체가 생성될때 과목의 학점 정보가 담기고
    // 그 이후에 객체의 데이터를 수정할 이유가 없으므로 해당 객체는 immutable 객체이다.
    // 따라서 모든 필드 변수의 getter만 제작하고, setter는 제작하지 않았다.
    // 또 해당 객체의 total 필드는 Builder에 의해 생성될때 자동으로 계산식에 따라 계산되어 설정된다.

    private final int total;
    private final int theory;
    private final int design;
    private final int experiment;

    protected SubjectCredit(int total, int theory, int design, int experiment) {
        this.total = total;
        this.theory = theory;
        this.design = design;
        this.experiment = experiment;
    }

    public int getTotal() {
        return total;
    }

    public int getTheory() {
        return theory;
    }

    public int getDesign() {
        return design;
    }

    public int getExperiment() {
        return experiment;
    }

    @Override
    public String toString() {
        return this.total + "-" + this.theory + "-" + this.design + "-" + this.experiment;
    }
}
