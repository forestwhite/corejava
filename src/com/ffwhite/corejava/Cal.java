/**
 * The corejava package contains simple, useful core Java classes I am likely to
 * use again
 */
package com.ffwhite.corejava;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.TextStyle;
import java.util.Locale;
import java.lang.Math;

/**
 * Cal reproduces the UNIX Cal command with some style changes
 *
 * @author forest white
 */
public class Cal {

    LocalDate date;
    boolean now = false;

    /**
     * Cal constructor with no arguments
     */
    public Cal() {
        this.date = LocalDate.of(LocalDate.now().getYear(),
                LocalDate.now().getMonth(),
                1);
        this.now = true;
    }

    /**
     * Cal constructor for a specific year
     * @param year
     */
    public Cal(int year) {
        this.date = LocalDate.of(year, Month.JANUARY, 1);
        this.now = false;
    }

    /**
     * Prints calendar output to the console
     */
    public void printCal() {
        if (now) {
            int padding;
            padding = 28-(23
                - date.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH)
                        .length())/ 2;
            String monthYear;
            monthYear = PadString.padLeft(
                    date.getMonth() + " " + date.getYear(), padding);
            System.out.println(monthYear);
            System.out.println("  Su  Mo  Tu  We  Th  Fr  Sa");
            int weekday = date.getDayOfWeek().getValue()%7;
            for(int i = 0; i < weekday; i++)
                System.out.print("    ");
            while (date.getMonthValue() == LocalDate.now().getMonthValue()){
                System.out.printf("%4d", date.getDayOfMonth());
                date = date.plusDays(1);
                if (date.getDayOfWeek().getValue()%7 == 0)
                    System.out.println();
            }
            System.out.println();
        } else {
            System.out.println("Not implemented");
            //TODO: Implement full year and month-year output
        }
    }
}
