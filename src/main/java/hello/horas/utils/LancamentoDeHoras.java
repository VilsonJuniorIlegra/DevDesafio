package hello.horas.utils;

import java.time.LocalTime;

public class LancamentoDeHoras {
    public LocalTime setHoraInicial(int horaInicial, int minutoInicial){
        if(minutoInicial > 59) throw new HourInvalidException("Minuto inválido limite 59");
        if(minutoInicial < 0) throw new HourInvalidException("Minuto inválido mínimo 0");
        return LocalTime.of(horaInicial, minutoInicial);
    }
}