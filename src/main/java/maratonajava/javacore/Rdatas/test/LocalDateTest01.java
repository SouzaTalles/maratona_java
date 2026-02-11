package maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        System.out.println("--------------");

        // trabalha apenas com a data
        LocalDate date = LocalDate.of(2025, Month.AUGUST, 28);
        LocalDate agora = LocalDate.now();
        // LocalDate é imutável
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonth().getValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth()); // diz quantos dias tem o mês
        System.out.println(date.isLeapYear()); // saber se é um ano bissexto
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date); // igual é salvo no banco de dados
        System.out.println(agora);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
