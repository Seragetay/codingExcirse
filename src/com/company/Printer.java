package com.company;

public class Printer {
    private TonnerLevel tonnerLevel;
    private PrintNumber printNumber;
    private boolean doublePrint = false;

    public Printer(TonnerLevel tonnerLevel, PrintNumber printNumber, boolean doublePrint) {
        this.tonnerLevel = tonnerLevel;
        this.printNumber = printNumber;
        this.doublePrint = doublePrint;
    }

    public TonnerLevel getTonnerLevel() {
        return tonnerLevel;
    }

    public PrintNumber getPrintNumber() {
        return printNumber;
    }

    public boolean isDoublePrint() {
        return doublePrint;
    }
}
