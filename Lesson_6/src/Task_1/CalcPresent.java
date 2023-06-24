package Task_1;
/**
 * @CalcPresent реализует принцип открытости-закрытости и, в том числе, принцип подстановки Лисков
 */
public class CalcPresent {
    public void CalRun(){
        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        view.viewChoice();
        String operator = view.operator();
        double number1 = view.Number1();
        double number2 = view.Number2();
        switch (operator) {
            case "+" -> model.addition(number1, number2);
            case "-" -> model.subtraction(number1, number2);
            case "*" -> model.multi(number1, number2);
            case "/" -> model.division(number1, number2);
        }
        view.displayResult(model.getResult());
        CalRun();
    }
}
