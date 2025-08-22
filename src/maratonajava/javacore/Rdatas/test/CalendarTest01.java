package maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingão é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        System.out.println(c);
        System.out.println(c.getTime());

        c.add(Calendar.DAY_OF_MONTH, 2); // Adicionar dias
        c.add(Calendar.HOUR, 2); // Adicionar horas
        // c.roll para adicionar, mas se caso passe volte  a contar do mesmo dia
        Date date = c.getTime();
        System.out.println(date);
    }
}
