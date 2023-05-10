package com.likelion.javaproject2.week4.day3.PracticeInterface;

import com.likelion.javaproject2.week4.day3.PracticeInterface.Printer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {
    @Override
    public void print(String[] lines) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.txt"));
        for (int i = 0; i < lines.length; i++) {
            bw.append(lines[i]);
            bw.flush();
        }
        bw.close();
    }
}
