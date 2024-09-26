package com.pluralsight;

public class Demo1 {
    public static void main(String[] args){
        System.out.println("Hello" + " " + "Werlda");

        String name = "Christian";
        String greeting = "Hello " + name;
        System.out.println(greeting);

        int numberOfDaysWatchingTV = 5;
        int minutesPerDayWatchingTV = 70;
        int minutesPerWeekWatchingTV = numberOfDaysWatchingTV * minutesPerDayWatchingTV;
        int minutesPerYearWatchingTV = minutesPerWeekWatchingTV * 52;
        int hoursPerYearWatchingTV = minutesPerYearWatchingTV/60;
        int hoursInWorkWeek = 35;
        int workWeeksPerYearWatchingTV = hoursPerYearWatchingTV / hoursInWorkWeek;

        System.out.println(name + ", you spend " + workWeeksPerYearWatchingTV + " hours per week watching TV... watch more!");
    }
}
