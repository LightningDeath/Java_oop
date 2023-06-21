public class CalcModel {
    double result = 0;

    void division(double x, double y) {
        result = x / y;
    }

    void multi(double x, double y) {
        result = x * y;
    }

    void subtraction(double x, double y) {
        result = x - y;
    }

    void addition(double x, double y) {
        result = x + y;
    }

    double getResult() {
        return result;
    }
}
