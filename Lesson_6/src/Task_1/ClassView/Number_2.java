package Task_1.ClassView;

import Task_1.InterfaceView.i_Number;

import java.util.Scanner;
/**
 * @Number_2 реализует принцип одной зоны ответственности
 * и принцип подстановки Лисков, т.к. если создать потомка данного класса и подставить в основной блок,
 * то он наследует все методы родителя и будет иметь свои, благодаря чему основной блок
 * программы продолжит работать корректно, при этом расширив функционал
 */
public class Number_2 implements i_Number {
    @Override
    public double getNumber() {
        Scanner in =  new Scanner(System.in);
        try {
            System.out.print("Enter number: ");
            double a = in.nextDouble();
            if (a == 0) {
                System.out.println("Error! Division by zero! Use another number.");
                in.reset();
                return getNumber();
            } else {
                in.reset();
                return a;
            }
        } catch (Exception e) {
            System.out.println("Error! Use only numbers!");
            in.reset();
            return getNumber();
        }
    }
}
