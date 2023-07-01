package ClassModel;

import InterfaceModel.i_Result;

/**
 * @Result реализует принцип одной зоны ответственности
 * и принцип подстановки Лисков, т.к. если создать потомка данного класса и подставить в основной блок,
 * то он наследует все методы родителя и будет иметь свои, благодаря чему основной блок
 * программы продолжит работать корректно, при этом расширив функционал
 */
public class Result implements i_Result {

    @Override
    public String getResult(double[] res){
        String result;
        if (res[1] > 0) {
            result = res[0] + "+" + res[1] + "i";
        } else if (res[1] < 0) {
            result = res[0] + String.valueOf(res[1]) + "i";
        } else {
            result = String.valueOf(res[0]);
        }
        return result;
    }
}
