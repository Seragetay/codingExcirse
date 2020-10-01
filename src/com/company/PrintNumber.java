package com.company;

public class PrintNumber {
    private int trayCount;
    private int pageCount;
    private int printedPages;

    public PrintNumber(int trayCount, int pageCount, int printedPages) {
        this.trayCount = trayCount;
        this.pageCount = pageCount;
        if (printedPages > 0){
            this.printedPages = printedPages;
        }

    };

    public void pagesCount(){
        if (this.pageCount <= 0){
            System.out.println("No paper in tray(s)!!");
        }else{
            this.pageCount = this.pageCount - this.printedPages;
            System.out.print("Remaining pages = " + this.pageCount);
        }
    };
    public void switchTrays(){
        int load = 100 * this.trayCount;
        if (pageCount >= 100){
            System.out.println("Pulling from tray 2");
        }
    }

    public int getTrayCount() {
        return trayCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getPrintedPages() {
        return printedPages;
    }
}
