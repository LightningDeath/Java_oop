import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * основной блок запуска, здесь же создается логер,
 * выводится приветствие и запускается presenter
 */
public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Logger log = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("Log1.txt");
        log.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        System.out.println("\nGreetings! Your a welcome in calculator!\n");
        CalcPresent run = new CalcPresent(log);
        run.CalRun();
    }
}