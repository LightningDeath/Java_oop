package ClassModel;

import InterfaceModel.i_GetHistory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Objects;


public class GetHistory implements i_GetHistory {

    @Override
    public void getHistory() {
        File file = new File(Paths.get("History.txt").toUri());
        try {
            BufferedReader fin = new BufferedReader(new FileReader(file));
            if (fin.readLine() == null) {
                System.out.println("\nNo story yet! Perform at least one operation.\n");
            } else {
                String line;
                System.out.println();
                while ((line = fin.readLine()) != null)
                    System.out.println(line);
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("\nError! File does not exist yet!\n");
        }
    }
}
