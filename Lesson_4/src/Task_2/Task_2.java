package Task_2;

public class Task_2 {
    public static void main(String[] args) {
        String[] strArray = {"task", "Task_2", "task3"};
        Integer[] intArray = {1, 2, 3};
        Double[] doubleArray = {2.3, 4.4};
        PrintArray print = new PrintArray();
        print.printArray(strArray);
        print.printArray(intArray);
        print.printArray(doubleArray);
    }
}
