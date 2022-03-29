package pcalendar;

import java.io.FileNotFoundException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Operate {

    /**
     * ustawienine stałych przypisanych do klas sterujących
     */
    private int choose;
    private java.lang.String string;
    private Date date;
    private BasicData basicData;
    private Control control;
    private Scanner scanner;

    /**
     * konstruktor dla klasy
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
    public void operate() throws FileNotFoundException, InterruptedException {
        date = new Date();
        basicData = new BasicData();
        control = new Control();
        scanner = new Scanner(System.in);
        System.out.println(control.WelcomeMessage);
        Thread.sleep(2000);
        chooser();
        mainOperator();
        System.out.println(control.GoodbyeMessage);
    }

    /**
     * wybieranie jaka operację na kalendarzu chce się wykonać
     * @return
     */
    public boolean chooser() {
        System.out.println(control.dateDisplayMessage);
        while (true) {
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    date.setOperator(choose);
                    return false;
                case 2:
                    date.setOperator(choose);
                    return false;
                case 3:
                    date.setOperator(choose);
                    return false;
                case 4:
                    date.setOperator(choose);
                    return false;
                default:
                    date.setOperator(10);
                    return false;
            }
        }
    }

    /**
     * wykonywanie operacji na kalendarzu
     * @return
     * @throws FileNotFoundException
     */
    public boolean mainOperator() throws FileNotFoundException {
        System.out.println(control.MainMessage);
        date.datePrinter();
        while (true) {
            string = scanner.nextLine();
            switch (string) {
                case "f":
                    date.moveWeek();
                    continue;
                case "b":
                    date.removeWeek();
                    continue;
                case "Test":
                    sampleDataPrinter();
                    continue;
                case "q":
                    return false;
                case "s":
                    date.datePrinter();
                    continue;
                case "ch":
                    System.out.println("*** Type date in format: day.month.year ****");
                    //Date parsedata = Date.parse(scanner.nextLine());
                    //parsedata.datePrinter();
                    continue;
                case "dp":
                    chooser();
                    continue;
            }
        }
    }

    /**
     *   metody pozwalaące sprawdzić poprawność wykonywanego programu
     * @throws FileNotFoundException
     */
    private static void sampleDataPrinter() throws FileNotFoundException {
        List<Date> dateList = Resources.getSampleDateList();
        printDateList(dateList);
        Date[] dateArray = Resources.getSampleDateArray();
        printDateArray(dateArray);
        Collections.sort(dateList);
        printDateList(dateList);
        Arrays.sort(dateArray);
        printDateArray(dateArray);
    }

    /**
     * wyświetlenie daty z listy
     * @param dateList
     */

    private static void printDateList(List<Date> dateList) {
        System.out.println("\n\nLIST");
        for (Date date : dateList) {
            System.out.println(date.dateFormator());
        }
    }

    /**
     * wyswietla tablice z datą
     * @param dateArray
     */
    private static void printDateArray(Date[] dateArray) {
        System.out.println("\n\nARRAY");
        for (Date date : dateArray) {
            System.out.println(date.dateFormator());
        }
    }
}

