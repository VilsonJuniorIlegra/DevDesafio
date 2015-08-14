package hello.horas.utils.test;

import hello.horas.utils.HourInvalidException;
import hello.horas.utils.LancamentoDeHoras;
import org.junit.Before;
import org.junit.Test;

public class LançamentoHorasTest {
    LancamentoDeHoras lancamentoDeHoras;

    @Before
    public void setUp() {
        lancamentoDeHoras = new LancamentoDeHoras();
    }
    @Test(expected = HourInvalidException.class)
    public void lancarHoraInicialTestUnHappyWayMinute(){
        lancamentoDeHoras.setHoraInicial(14, 88);
    }

    @Test(expected = HourInvalidException.class)
    public void lancarHoraInicialTestUnHappyWayMinuteNegative(){
        lancamentoDeHoras.setHoraInicial(14,-10);
    }
}
