package Assignment6_1.Practice8;

class TemperatureException extends Exception {
    private int temperature;

    TemperatureException() { super("제어 불가"); }
    TemperatureException(String msg) { super(msg); }

    void setTemperature(int t) { temperature = t; }
    int getTemperature() { return temperature; }
}

public class ReactionFurnaceObserver {
    static int currentFurnaceTemp = 10000;

    public static void main(String[] args) {
        try {
            observeReactionFurnace();
            return;
        } catch (TemperatureException e) {
            System.out.println();
            System.out.println(e.getMessage() + ": " + e.getTemperature());
        } finally {
            System.out.println("원자로 셧다운");
        }
    } //main()

    static int change() {
        int amount;
        amount = (int)(Math.random() * 1000);
        return amount;
    }

    static int control( ) {
        int temp=0;
        switch ((int)(Math.random() * 3)) {
            case 0: temp = -500; break;
            case 1: temp = 0; break;
            case 2: temp = 500;	break;
        }
        return temp;
    }

    static void observeReactionFurnace() throws TemperatureException {
        while (true) {
            if (currentFurnaceTemp > 15000) {
                TemperatureException e1 = new TemperatureException(); //제어 불가
                e1.setTemperature(currentFurnaceTemp);
                throw e1;
            } else if (currentFurnaceTemp > 12000) {
                currentFurnaceTemp += control();
                System.out.println("경고: " + currentFurnaceTemp);
            } else {
                System.out.println();
                System.out.println("정상: " + currentFurnaceTemp);
                currentFurnaceTemp += change();
            }
        }
    }
}