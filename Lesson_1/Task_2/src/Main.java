import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void choice() {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                \nВыбирете:\s
                1 - создать прямоугольник по умолчанию;
                2 - создать произвольный прямоугольник;
                3 - выход.""");
        System.out.print("Ваш выбор: ");
        try {
            int ch = in.nextInt();
            if (ch == 1) {
                Rectangle r = new Rectangle();
                choiceOperation(r);
            } else if (ch == 2) {
                System.out.println("Введите ширину: ");
                double wh = in.nextDouble();
                System.out.println("Введите высоту: ");
                double hg = in.nextDouble();
                Rectangle r = new Rectangle(wh, hg);
                choiceOperation(r);
            }else if (ch == 3) {
                System.out.println("До встречи!");
                in.close();
                exit(0);
            }else {
                System.out.println("Нет такого параметра! Попробуйте еще раз!\n");
                choice();
            }
        } catch (Exception e) {
            System.out.println("Введено не верное значение! попробуйте еще раз!\n");
            choice();
        }
    }
    public static void choiceOperation(Rectangle rec){
        Scanner in = new Scanner(System.in);
        System.out.println("""
                \nВыбирете:\s
                1 - Вывести на экран параметры прямоугольника;
                2 - Вычислить площадь прямоугольника;
                3 - Вычислить периметр прямоугольника;
                4 - Вывод на экран параметры прямоугольника и выход.""");
        try {
            int ch = in.nextInt();
            if (ch == 1) {
                System.out.printf("""
                        Параметры прямоугольника:
                        Высота = %.3f
                        Ширина = %.3f
                        """, rec.getHeight(), rec.getWidth());
            } else if (ch == 2) {
                System.out.printf("Площадь прямоугольника = %.2f", rec.calculateArea());
            } else if (ch == 3) {
                System.out.printf("Периметр прямоугольника = %.2f", rec.calculatePerimeter());
            } else if (ch == 4) {
                System.out.printf("""
                        Параметры прямоугольника:
                        Высота = %.3f
                        Ширина = %.3f
                        """, rec.getHeight(), rec.getWidth());
                in.close();
                System.out.println("\nДо встречи!");
                exit(0);
            }else {

                System.out.println("Нет такого параметра! Попробуйте еще раз!");
                choice();
            }
        } catch (Exception e) {
            System.out.println("Введено не верное значение! Попробуйте еще раз!");
            choice();
        }
        System.out.println("\nЖелаете выбрать другие параметры?(да(yes)/нет(no))");
        if (repeat()){
            choiceOperation(rec);
        } else {
            System.out.println("\nВозможно Вы хотите создать новый прямоугольник?(да(yes)/нет(no)");
            if (repeat()){
                choice();
            }else{
                System.out.println("До встречи!");
                in.close();
                exit(0);
            }
        }
    }
    public static boolean repeat(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваш выбор: ");
        String yn = in.nextLine();
        if (yn.equalsIgnoreCase("да") || yn.equalsIgnoreCase("yes")) {
            return true;
        } else if (yn.equalsIgnoreCase("нет") || yn.equalsIgnoreCase("no")) {
            return false;
        } else {
            System.out.println("Нет такого ответа! Либо 'да', либо 'нет'!");
            repeat();
        }
        return false;
    }

    public static void main(String[] args) {
        choice();
    }
}