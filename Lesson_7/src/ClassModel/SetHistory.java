package ClassModel;

import InterfaceModel.i_SetHistory;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SetHistory implements i_SetHistory {
    @Override
    public void setHistory(double[] hs, String res, String oper) {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        File file = new File("History.txt");
        String result, result1;
        if (hs[1] > 0) {
            result = hs[0] + "+" + hs[1] + "i";
        } else if (hs[1] < 0) {
            result = hs[0] + String.valueOf(hs[1]) + "i";
        } else {
            result = String.valueOf(hs[0]);
        }
        if (hs[3] > 0) {
            result1 = hs[2] + "+" + hs[3] + "i";
        } else if (hs[3] < 0) {
            result1 = hs[2] + String.valueOf(hs[3]) + "i";
        } else {
            result1 = String.valueOf(hs[2]);
        }
        try {
            if (file.exists()) {
                FileWriter fw = new FileWriter(file, true);
                fw.write(LocalDateTime.now().format(dt) + "\n");
                fw.write("Complex number 1: " + result + "\n");
                fw.write("Complex number 2: " + result1 + "\n");
                fw.write("Operator: " + oper + "\n");
                fw.write("Result: " + res + "\n");
                fw.write("----------------------------------\n");
                fw.close();
            } else {
                FileWriter fw = new FileWriter(file);
                fw.write(LocalDateTime.now().format(dt) + "\n");
                fw.write("Complex number 1: " + result + "\n");
                fw.write("Complex number 2: " + result1 + "\n");
                fw.write("Operator: " + oper + "\n");
                fw.write("Result: " + res + "\n");
                fw.write("----------------------------------\n");
                fw.close();
            }
        } catch (Exception e) {
            System.out.println("\nError! Can't write history\n");
        }
    }
}
