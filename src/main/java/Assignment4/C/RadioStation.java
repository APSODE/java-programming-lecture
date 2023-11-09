package Assignment4.C;

public class RadioStation {
    private String name;
    private Program program;

    public RadioStation(String name, Program program) {
        this.name = name;
        this.program = program;
    }

    public static RadioStation createStation(String name, Program program) {
        return new RadioStation(name, program);
    }

    public String getName() {
        return name;
    }

    public Program getProgram() {
        return program;
    }
}
