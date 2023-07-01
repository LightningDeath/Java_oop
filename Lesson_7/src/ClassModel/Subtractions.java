package ClassModel;

import InterfaceModel.i_CalcOperation;

/**
 * @Subtractions реализует принцип одной зоны ответственности
 * и принцип подстановки Лисков, т.к. если создать потомка данного класса и подставить в основной блок,
 * то он наследует все методы родителя и будет иметь свои, благодаря чему основной блок
 * программы продолжит работать корректно, при этом расширив функционал
 */
public class Subtractions implements i_CalcOperation {
    double[] complex, complex2;
    double real, image;

    public Subtractions(double[] complex) {
        this.complex = complex;
        this.complex2 = new double[2];
    }

    @Override
    public double[] calcOperation() {
        this.real = complex[0] - complex[2];
        this.image = complex[1] - complex[3];
        complex2[0] = this.real;
        complex2[1] = this.image;
        return complex2;
    }
}

