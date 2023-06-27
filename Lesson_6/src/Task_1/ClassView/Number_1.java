package Task_1.ClassView;

import Task_1.InterfaceView.i_Number;

import java.util.Scanner;
/**
 * @Number_1 реализует принцип одной зоны ответственности
 * и принцип подстановки Лисков, т.к. если создать потомка данного класса и подставить в основной блок,
 * то он наследует все методы родителя и будет иметь свои, благодаря чему основной блок
 * программы продолжит работать корректно, при этом расширив функционал
 */
public class Number_1 implements i_Number {
    @Override//переопределяем метод, что дает на гибкость
    public double getNumber(){
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter number: ");
            in.reset();
            return in.nextDouble();
        } catch (Exception e) {
            System.out.println("Error! Use only numbers!");
            in.reset();
            return getNumber();
        }
    }
}
