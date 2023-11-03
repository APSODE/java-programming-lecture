package Assignment4.D.subjects;


public class SubjectCredit {
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
