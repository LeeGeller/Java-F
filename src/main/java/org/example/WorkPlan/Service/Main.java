package org.example.WorkPlan.Service;

public class Main {
    public static void main(String[] args) {
        WorkingPlan service = new WorkingPlan();

        int calc = service.calc(10_000, 3_000, 20_000);
        System.out.println(calc);


    }
}