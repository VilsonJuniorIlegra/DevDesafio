package hello.horas.utils;

public class HourInvalidException extends RuntimeException{

    public HourInvalidException(){
        super("Hora inválida");
    }

    public HourInvalidException(String message){
        super(message);
    }
}
