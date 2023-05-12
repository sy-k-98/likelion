package com.likelion.javaproject2.week4.day5;

import java.io.*;


public class ReadFileEx2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/kimsy/Downloads/건강보험심사평가원_전국 병의원 및 약국 현황 2022.9/1.병원정보서비스 2022.10..csv"), "EUC-KR"));
        System.out.println(br.readLine());
    }
}
