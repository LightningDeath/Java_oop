package ClassModel;

import InterfaceModel.i_ClearHistory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ClearHistory implements i_ClearHistory {
    @Override
    public void clearHistory() {
        File fl = new File("History.txt");
        try {
            if (fl.length() == 0) {
                System.out.println("\nHistory is already empty. Perform the operation.\n");
            } else {
                FileWriter fr = new FileWriter(fl);
                fr.close();
                System.out.println("\nHistory cleared!\n");
            }
        } catch (IOException e) {
            System.out.println("\nError! File does not exist yet!\n");
        }
    }
}
