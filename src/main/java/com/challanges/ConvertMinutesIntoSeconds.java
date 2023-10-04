package com.challanges;

public class ConvertMinutesIntoSeconds {
    public static void main(String[] args) {
        ConvertMinutesIntoSeconds.convert(5);
        ConvertMinutesIntoSeconds.convert(3);
        ConvertMinutesIntoSeconds.convert(2);
    }

    public static int convert(int minutes){
        int seconds;
        seconds = minutes * 60;
        System.out.println(minutes + " Minutes equals to " + seconds + " Seconds.");
        return seconds;

    }
}
