package com.company;

import java.util.Scanner;

public class Header {
    private String subject;
    private String date;

    public Header(String subject, String date) {
        this.subject = subject;
        this.date = date;
    }
    public void theSubject(){
        Scanner scanner = new Scanner(System.in);
        this.subject = scanner.nextLine();
    }

    public String getSubject() {
        return subject;
    }

    public String getDate() {
        return date;
    }
}
