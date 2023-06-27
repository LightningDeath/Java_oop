package Task_1.ClassView;

import Task_1.InterfaceView.i_Operator;
import java.util.Scanner;
import static java.lang.System.exit;
/**
 * @Operator реализует принцип одной зоны ответственности
 * и принцип подстановки Лисков, т.к. если создать потомка данного класса и подставить в основной блок,
 * то он наследует все методы родителя и будет иметь свои, благодаря чему основной блок
 * программы продолжит работать корректно, при этом расширив функционал
 */
public class Operator implements i_Operator {
    @Override
    public String getOperator() {
        Scanner in =  new Scanner(System.in);
        try {
            System.out.print("Enter operator: ");
            String c = in.nextLine();
            if (c.equals("*") || c.equals("/") || c.equals("-") || c.equals("+")) {
                in.reset();
                return c;
            } else if (c.equalsIgnoreCase("Exit")) {
                in.reset();
                exit(0);
                return "";
            } else {
                System.out.println("Error! Use only '*', '/', '+', '-'.");
                in.reset();
                return getOperator();
            }
        } catch (Exception e) {
            System.out.println("Error! Use only '*', '/', '+', '-'.");
            in.reset();
            return getOperator();
        }
    }
}
