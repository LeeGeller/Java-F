package org.example.WorkPlan.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WorkingPlanTest {
    @Test
    public void testWorkingPlan1() {

        WorkingPlan service = new WorkingPlan();
        int actual = service.calc(10_000, 3_000, 20_000);
        int expended = 3;

        Assertions.assertEquals(expended, actual);
    }

    @Test
    public void testWorkingPlan2() {

        WorkingPlan service = new WorkingPlan();
        int actual = service.calc(100_000, 60_000, 150_000);
        int expended = 2;

        Assertions.assertEquals(expended, actual);
    }
}