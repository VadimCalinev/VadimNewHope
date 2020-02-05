package Leson1;

import java.util.ArrayList;
import java.util.Random;
public class ArrayDates {
    public static void main(String[] args) {
        final int MAX_YEAR = 2019;
        final int MIN_YEAR = 1900;
        final int MIN_YEAR_50 = 50;
        final int MIN_YEAR_YOUNG = 30;
        Random number = new Random();

        ArrayList<Integer> dates = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            dates.add(number.nextInt((MAX_YEAR - MIN_YEAR) + 1) + MIN_YEAR);
            System.out.print("Номер ячейки в массиве " + i);
            System.out.println(" Содержание ячейки массива - " + dates.get(i));

        }
        ArrayList<Integer> young_dates = new ArrayList<>();

        for (int i : dates) {
            System.out.println("Часть массива " + i);
            if (MAX_YEAR - i < MIN_YEAR_50) {
                System.out.println(i + " моложе чем " + MIN_YEAR_50 + " лет");
                if (MAX_YEAR - i < MIN_YEAR_YOUNG)
                    young_dates.add(i);
            }
        }
        while (young_dates.size() > 0) {
            System.out.println(young_dates.remove(0) + " моложе " + MIN_YEAR_YOUNG + " лет");
        }
    }
}
