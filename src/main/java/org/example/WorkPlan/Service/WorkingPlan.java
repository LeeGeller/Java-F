package org.example.WorkPlan.Service;


public class WorkingPlan {
    public int calc(int income, int expense, int threshold) {

        int money = 0;
        int count = 0;

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                money = money - expense;
                money = money / 3;
                count++;
            } else {
                money = money + income - expense;
            }
        }
        return count;

    }
}