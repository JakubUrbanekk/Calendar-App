package utils;

import observators.observatorInterfaces.DateObservator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomLocalDate implements DateObservator {
    private LocalDate currentDate;

    public CustomLocalDate() {
        currentDate = LocalDate.now();
    }


    @Override
    public void update(LocalDate localDate) {
        currentDate = localDate;
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public List<LocalDate> getDaysFromCurrentMonth(){
        List<LocalDate> daysFromCurrentMonth = new ArrayList<>();
        int numberOfDays = currentDate.getMonth().length(currentDate.isLeapYear());
        for (int i=0 ;i<numberOfDays; i++){
            daysFromCurrentMonth.add(currentDate);
            currentDate = currentDate.plusDays(1);
        }
       // System.out.println("Current dates " + daysFromCurrentMonth.toString());
        return daysFromCurrentMonth;
    }
}
