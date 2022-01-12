package com.company;

    public class PowerFinder {
        public static int Power(int base, int power) {
            int result = 1;
            for (int iter = 0; iter<power; iter++) {
                result *= base;
            }
            return result;
        }
    }


