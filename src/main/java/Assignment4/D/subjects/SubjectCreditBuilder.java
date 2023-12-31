package Assignment4.D.subjects;

public class SubjectCreditBuilder {
    private int total = 0;
    private int theory = 0;
    private int design = 0;
    private int experiment = 0;

    public static SubjectCreditBuilder createBuilder() {
        return new SubjectCreditBuilder();
    }

    private void calcTotal() {
        this.total = this.theory + this.design + (this.experiment / 2);
    }

    public SubjectCreditBuilder theory(int theory) {
        this.theory = theory;
        return this;
    }

    public SubjectCreditBuilder design(int design) {
        this.design = design;
        return this;
    }

    public SubjectCreditBuilder experiment(int experiment) {
        this.experiment = experiment;
        return this;
    }

    public SubjectCredit build() {
        this.calcTotal();
        return new SubjectCredit(
                this.total,
                this.theory,
                this.design,
                this.experiment
        );
    }
}
