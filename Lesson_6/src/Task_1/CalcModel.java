package Task_1;

import Task_1.ClassModel.*;
/**
 * @CalcModel реализует принцип открытости-закрытости и, в том числе, принцип подстановки Лисков
 */
public class CalcModel {
    double result = 0;

    public void division(double x, double y) {
        Division div = new Division();
        result = div.calcOperation(x, y);
    }

    public void multi(double x, double y) {
        Multiplication mul = new Multiplication();
        result = mul.calcOperation(x, y);
    }

    void subtraction(double x, double y) {
        Subtractions sub = new Subtractions();
        result =  sub.calcOperation(x, y);
    }

    void addition(double x, double y) {
        Addition add = new Addition();
        result = add.calcOperation(x, y);
    }

    double getResult() {
        Result res = new Result();
        return res.getResult(result);
    }

}
