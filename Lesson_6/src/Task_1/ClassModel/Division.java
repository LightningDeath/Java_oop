package Task_1.ClassModel;

import Task_1.InterfaceModel.i_CalcOperation;

/**
 * @Division реализует принцип одной зоны ответственности
 * и принцип подстановки Лисков, т.к. если создать потомка данного класса и подставить в основной блок,
 *  * то он наследует все методы родителя и будет иметь свои, благодаря чему основной блок
 *  * программы продолжит работать корректно, при этом расширив функционал
 */
public class Division implements i_CalcOperation {
    @Override
    public double calcOperation(double x, double y) {
        return x / y;
    }
}
