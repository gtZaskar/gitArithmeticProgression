package com.company;

public class ArithmeticProgression {
    private final int initial;
    private final int step;
    private int n;

    public ArithmeticProgression(int initial, int step) throws ProgressionConfigurationException {
        this.initial = initial;
        this.step = step;
        if (step == 0) {
            throw new ProgressionConfigurationException("1");
        }
    }

    public int calculate(int n) throws ProgressionConfigurationException {
        this.n = n;
        if (n <= 0) {
            throw new ProgressionConfigurationException("2");
        }
        int num = initial + step * (n - 1);
        System.out.println("Элемент арифметической прогрессии равен: " + num);
    return num;
    }

}






