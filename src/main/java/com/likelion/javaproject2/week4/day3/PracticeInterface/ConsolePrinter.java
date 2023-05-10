package com.likelion.javaproject2.week4.day3.PracticeInterface;

import com.likelion.javaproject2.week4.day3.PracticeInterface.Printer;

import java.io.IOException;

public class ConsolePrinter implements Printer {

    @Override
    public void print(String[] lines) throws IOException {
        for (int i = 0; i < lines.length; i++) {
            System.out.print(lines[i]);
        }
    }
}
