package com.likelion.javaproject2.week4.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {

    Charset charset;

    public ReadFileEx(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        try (
                BufferedReader br = new BufferedReader(new FileReader(fileName, charset))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lines;
    }

    public Hospital parse(String str) {
        String[] info = str.split(",");

        Address address = new Address(info[10], info[5], info[7]);
        Hospital hospital = new Hospital(info[1], info[11], address);

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rf = new ReadFileEx(Charset.forName("EUC-KR")); // EUC-KR, UTF-8
//        List<String> strLines = rf.getLines("hospital_info10.csv");
        List<String> strLines = rf.getLines("/Users/kimsy/Downloads/건강보험심사평가원_전국 병의원 및 약국 현황 2022.9/1.병원정보서비스 2022.10..csv");

        List<Hospital> parsedHospital = rf.getHospitals(strLines);

        for (int i = 0; i < parsedHospital.size(); i++) {
            Hospital hospital = parsedHospital.get(i);
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getAddress().getFullAddress(), hospital.getWebsiteAddr());
        }
    }
}
