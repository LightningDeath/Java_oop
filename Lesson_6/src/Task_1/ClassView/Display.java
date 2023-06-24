package Task_1.ClassView;

import Task_1.InterfaceView.i_Display;
/**
 * @Display реализует принцип одной зоны ответственности
 * и принцип подстановки Лисков, т.к. если создать потомка данного класса и подставить в основной блок,
 * то он наследует все методы родителя и будет иметь свои, благодаря чему основной блок
 * программы продолжит работать корректно, при этом расширив функционал
 */
public class Display implements i_Display {
    @Override
    public void display(double result) {
        System.out.println("Result: " + result);
        System.out.println();
    }
}
