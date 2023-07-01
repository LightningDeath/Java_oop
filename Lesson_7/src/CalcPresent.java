import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @CalcPresent реализует принцип открытости-закрытости и, в том числе, принцип подстановки Лисков
 */
public class CalcPresent {
    CalcView view;
    CalcModel model;
    Logger log;


    public CalcPresent(Logger log) {
        this.view = new CalcView();
        this.model = new CalcModel();
        this.log = log;
    }

    public void CalRun() throws URISyntaxException {
        this.view.viewChoice();
        String operator = this.view.operator();
        if(operator.equals("+")){
            model.addition(this.view.number());
            log.log(Level.INFO, model.getResult());//логирование результата
            model.setHistory(model.getResult(), operator);//сохранение чисел, результата и типа операции в файл истории
            this.view.displayResult(model.getResult());
            CalRun();
        }else if(operator.equals("-")){
            model.subtraction(this.view.number());
            log.log(Level.INFO, model.getResult());//логирование результата
            model.setHistory(model.getResult(), operator);//сохранение чисел, результата и типа операции в файл истории
            this.view.displayResult(model.getResult());
            CalRun();
        } else if(operator.equals("*")){
            model.multi(this.view.number());
            log.log(Level.INFO, model.getResult());//логирование результата
            model.setHistory(model.getResult(), operator);//сохранение чисел, результата и типа операции в файл истории
            this.view.displayResult(model.getResult());
            CalRun();
        }else if(operator.equals("/")){
            model.division(this.view.number());
            log.log(Level.INFO, model.getResult());//логирование результата
            model.setHistory(model.getResult(), operator);//сохранение чисел, результата и типа операции в файл истории
            this.view.displayResult(model.getResult());
            CalRun();
        }else if (operator.equalsIgnoreCase("h")){
            model.getHistory();//получение истории из сохраненного файла
            CalRun();
        }else if (operator.equalsIgnoreCase("c")){
            model.clearHistory();//очистка файла истории
            CalRun();
        }

    }
}
