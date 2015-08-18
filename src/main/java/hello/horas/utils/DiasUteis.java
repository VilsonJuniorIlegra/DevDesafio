package hello.horas.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class DiasUteis {

    public int quantidadeDiasUteis(int year, int month){
        LocalDate date;
        YearMonth yearMonth = YearMonth.of(year, month);
        List<LocalDate> listWorkingDays = new ArrayList<>();
        for (int day = 1; day <= yearMonth.lengthOfMonth(); day++){
            date = yearMonth.atDay(day);
            if (!date.getDayOfWeek().equals(DayOfWeek.SATURDAY) && !date.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
                listWorkingDays.add(date);
            }
        }
        return listWorkingDays.size();
    }




}
