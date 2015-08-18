package hello.horas.utils.test;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class DiasUteisTest {

    @Test
    public void validarDiasUteis(){
        LocalDate date = LocalDate.now();
        int ano = date.getYear();
        int mes = date.getMonthValue();

        YearMonth anoMes = YearMonth.of(ano, mes);
        List<LocalDate> listaDiasUteis = new ArrayList<>();

        for (int dia = 1; dia <= anoMes.lengthOfMonth();dia++){
            date = anoMes.atDay(dia);
            if (!date.getDayOfWeek().equals(DayOfWeek.SATURDAY)&& !date.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
                listaDiasUteis.add(date);
            }
        }
        System.out.println(listaDiasUteis.size());
    }
}
