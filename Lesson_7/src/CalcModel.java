import ClassModel.*;

import java.net.URISyntaxException;

/**
 * @CalcModel реализует принцип открытости-закрытости и, в том числе, принцип подстановки Лисков
 */
public class CalcModel {
    private double[] result;
    private double[] complex1;

    void division(double[] complex) {
        Division div = new Division(complex);
        complex1 = complex;
        result = div.calcOperation();
    }

    void multi(double[] complex) {
        Multiplication mul = new Multiplication(complex);
        complex1 = complex;
        result = mul.calcOperation();
    }

    void subtraction(double[] complex) {
        Subtractions sub = new Subtractions(complex);
        complex1 = complex;
        result = sub.calcOperation();
    }

    void addition(double[] complex) {
        Addition add = new Addition(complex);
        complex1 = complex;
        result = add.calcOperation();
    }

    String getResult() {
        Result res = new Result();
        return res.getResult(result);
    }

    void setHistory(String res, String oper) {
        SetHistory set = new SetHistory();
        set.setHistory(complex1, res, oper);
    }

    void getHistory() {
        GetHistory history = new GetHistory();
        history.getHistory();
    }
    void clearHistory() {
        ClearHistory clr = new ClearHistory();
        clr.clearHistory();
    }
}
