public class CalcPresent {
    public void CalRun() {
        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        System.out.println("""
                Make your choice:
                    '+' - addition;
                    '-' - subtraction;
                    '*' - multiplication;
                    '/' - division;
                    'exit' - exit;
                """);
        String operator = view.getOperator();
        double number1 = view.getNumber1();
        double number2 = view.getNumber2();
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
