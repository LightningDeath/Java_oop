package ClassModel;

import InterfaceModel.i_CalcOperation;

/**
 * @Multiplication реализует принцип одной зоны ответственности
 * и принцип подстановки Лисков, т.к. если создать потомка данного класса и подставить в основной блок,
 * то он наследует все методы родителя и будет иметь свои, благодаря чему основной блок
 * программы продолжит работать корректно, при этом расширив функционал
 */
public class Multiplication implements i_CalcOperation {
    double[] complex, complex2;
    double real, image;

    public Multiplication(double[] complex) {
        this.complex = complex;
        this.complex2 = new double[2];
    }

    @Override
    public double[] calcOperation() {
        this.real = complex[0] * complex[2] - complex[1] * complex[3];
        this.image = complex[1] * complex[2] + complex[0] * complex[3];
        complex2[0] = this.real;
        complex2[1] = this.image;
        return complex2;
    }
}

