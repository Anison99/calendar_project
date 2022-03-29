package pcalendar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BasicData {

    private int basicDay, basicMonth, basicYear, dayNumber;
    File file = new File("C:/Users/anita/Desktop/STUDIA/JAVA/kalendarz_az/kalendarzFront/src/main/java/pcalendar/BasicData.txt");

    /**
     * @throws FileNotFoundException
     */
    public BasicData() throws FileNotFoundException {
        File file = new File("C:/Users/anita/Desktop/STUDIA/JAVA/kalendarz_az/kalendarzFront/src/main/java/pcalendar/BasicData.txt");
        Scanner scanner = new Scanner(file);
        this.basicDay = scanner.nextInt();
        this.basicMonth = scanner.nextInt();
        this.basicYear = scanner.nextInt();
        this.dayNumber = scanner.nextInt();
    }
    /**
     *
     * @param day
     * @param month
     * @param year
     * @param dayId
     * @throws FileNotFoundException
     */
    public void newBasicData(int day, int month, int year, int dayId) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(file);
        writer.println(day);
        writer.println(month);
        writer.println(year);
        writer.println(dayId);
        writer.close();
        this.basicDay = day;
        this.basicMonth = month;
        this.basicYear = year;
        this.dayNumber = dayId;
    }

    /**
     * gettery do wszystkich powyższych metod
     */
    public int getBasicDay() {
        return basicDay;
    }

    public int getBasicMonth() {
        return basicMonth;
    }

    public int getBasicYear() {
        return basicYear;
    }

    public int getDayNumber() {
        return dayNumber;
    }
}
