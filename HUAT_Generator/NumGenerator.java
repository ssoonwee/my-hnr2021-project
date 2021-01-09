import java.util.Random;

class NumGenerator {
    protected final int number;
    public NumGenerator() {
        this.number = 999;
    }
    public NumGenerator(int placeHolder) {
        this.number = placeHolder;
    }
    public NumGenerator generate() {
        Random r = new Random();
        int generatedNumber = r.nextInt(10000);
        return new NumGenerator(generatedNumber);
    }

    public String toString() {
        String s1 = new String();
        s1 = String.format("%04d", this.number);
        return s1;
    }
}
