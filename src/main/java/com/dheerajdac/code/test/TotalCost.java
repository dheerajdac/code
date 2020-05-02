package com.dheerajdac.code.test;

public class TotalCost {


    public static long totalCost(String a, String b){

        int firstHour = Integer.parseInt(a.split(":")[0]);
        int firstMin = Integer.parseInt(a.split(":")[1]);
        int secondHour = Integer.parseInt(b.split(":")[0]);
        int secondMin = Integer.parseInt(b.split(":")[1]);

        int totalHoursCost = 2 + 3 + (4 * (secondHour - firstHour -1));

        if(firstMin < secondMin){
            totalHoursCost = totalHoursCost + 4;
        }

        return totalHoursCost;
    }

    public static void main(String args[]){
        System.out.println(totalCost("10:00", "13:22"));
        System.out.println(totalCost("09:45", "09:47"));
        System.out.println(totalCost("09:42", "11:43"));
        System.out.println(totalCost("09:22", "11:42"));
    }
}
