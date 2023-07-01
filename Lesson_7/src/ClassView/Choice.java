package ClassView;

import InterfaceView.i_Choice;

/**
 * @Choice реализует принцип одной зоны ответственности
 * и принцип подстановки Лисков, т.к. если создать потомка данного класса и подставить в основной блок,
 * то он наследует все методы родителя и будет иметь свои, благодаря чему основной блок
 * программы продолжит работать корректно, при этом расширив функционал
 */
public class Choice implements i_Choice {
    @Override
    public void choice() {
        System.out.println("""
                Make your choice:
                    '+' - addition;
                    '*' - multiplication;
                    '/' - division;
                    '-' - subtraction;
                    'H' - show history;
                    'C' - clear history;
                    'exit' - exit;
                """);
    }
}
