package pcalendar;

import java.io.FileNotFoundException;

public class Main {
    /**
     * main wywołuje operate, czyli klase obsługującą cały program
     * @param args
     * @throws FileNotFoundException
     * @throws InterruptedException
     */

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Operate start = new Operate();
        start.operate();
    }
}
