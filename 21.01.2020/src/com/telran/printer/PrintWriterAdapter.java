package com.telran.printer;

import java.io.PrintWriter;

//löschen 23-24, 50-54

public class PrintWriterAdapter implements PrintAdapter {
    private PrintWriter pw;

    public PrintWriterAdapter(PrintWriter pw) {
        this.pw = pw;
    }

    public void println(String line) {
        pw.println(line);
    }

    public void close() {
        pw.close();
    }
}