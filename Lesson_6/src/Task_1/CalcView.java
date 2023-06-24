package Task_1;

import Task_1.ClassView.*;
/**
 * @CalcView реализует принцип открытости-закрытости и, в том числе, принцип подстановки Лисков
 */
public class CalcView {

    double Number1(){
        Number_1 num = new Number_1();
        return num.getNumber();
    }

    double Number2(){
        Number_2 num2 = new Number_2();
        return num2.getNumber();
    }
    void viewChoice() {
        Choice ch = new Choice();
        ch.choice();
    }

    String operator() {
        Operator opera = new Operator();
        return opera.getOperator();
    }

    void displayResult(double result) {
        Display dis = new Display();
        dis.display(result);
    }
}
