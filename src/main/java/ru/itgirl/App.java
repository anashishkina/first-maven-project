package ru.itgirl;


import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        System.out.println("Введите день недели на английском ");
        Scanner dayOfWeek = new Scanner(System.in);
        String dayEng = dayOfWeek.next();
        DayOfWeek.DayOfWeekEnum day = DayOfWeek.DayOfWeekEnum.valueOf(dayEng);
        System.out.println(dayEng + " на русском будет");
        System.out.println( day.getRussianName());
    }
}
