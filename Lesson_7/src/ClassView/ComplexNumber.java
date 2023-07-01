package ClassView;

import InterfaceView.i_Number;

import java.util.Scanner;

/**
 * @Number_2 реализует принцип одной зоны ответственности
 * и принцип подстановки Лисков, т.к. если создать потомка данного класса и подставить в основной блок,
 * то он наследует все методы родителя и будет иметь свои, благодаря чему основной блок
 * программы продолжит работать корректно, при этом расширив функционал
 */
public class ComplexNumber implements i_Number {
    @Override
    public double getNumber(String typeNumber) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.printf("Enter %s: ", typeNumber);
            double a = in.nextDouble();
            in.reset();
            return a;
        } catch (Exception e) {
            System.out.println("\nError! Use only numbers!\n");
            in.reset();
            return getNumber(typeNumber);
        }
    }
}
