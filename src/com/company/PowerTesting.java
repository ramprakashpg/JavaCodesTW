package com.company;

import org.junit.Test;

public class PowerTesting {
    @Test
    public void OnePowerOne() {
        assert PowerFinder.Power(1,1) == 1;
    }

    @Test
    public void TwoPowerOne() {
        assert PowerFinder.Power(2,1) == 2;
    }

    @Test
    public void TwoPowerTwo() {
        assert PowerFinder.Power(2, 2) == 4;
    }

    @Test
    public void ThreePowerTwo() {
        assert PowerFinder.Power(3, 2) == 3*3;
    }
}
