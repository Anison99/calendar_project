package pcalendar;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class Resources {

    public static List<Date> getSampleDateList() throws FileNotFoundException {
        List<Date> dateList = new ArrayList<>();
        /**
         * dodanie przykładowych dat do listy wyświetlanych przy uruchomieniu programu
         */
        dateList.add(new Date(31,1,2022));
        dateList.add(new Date(10,1,2000));
        dateList.add(new Date(1,9,1945));
        dateList.add(new Date(31,8,1975));
        dateList.add(new Date(24,12,2020));
        dateList.add(new Date(13,2,1999));
        return dateList;
    }

    /**
     * dodanie przykładowych dat do tablicy wyświetlanych przy uruchomieniu programu
     * @return
     */
    public static Date[] getSampleDateArray(){
        return new Date[]{
                new Date(12,12,2005),
                new Date(23,11,2012),
                new Date(12,12,2006),
                new Date(5,8,1955),
                new Date(12,2,1989),

        };
    }

}
