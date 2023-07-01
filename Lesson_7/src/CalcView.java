import ClassView.*;

/**
 * @CalcView реализует принцип открытости-закрытости и, в том числе, принцип подстановки Лисков
 */
public class CalcView {
    private final ComplexNumber num;
    private final Choice ch;
    private final Operator opera;
    private final Display dis;

    public CalcView() {
        this.num = new ComplexNumber();
        this.ch = new Choice();
        this.opera = new Operator();
        this.dis = new Display();
    }

    double[] number() {
        double[] values = new double[4];
        int i = 0;
        String index = "first";
        while (i <= 3) {
            values[i] = this.num.getNumber(index + " complex number real");
            values[i + 1] = this.num.getNumber(index + " complex number image");
            index = "second";
            i += 2;
        }
        return values;
    }

    void viewChoice() {
        this.ch.choice();
    }

    String operator() {
        return this.opera.getOperator();
    }

    void displayResult(String result) {
        this.dis.display(result);
    }
}
