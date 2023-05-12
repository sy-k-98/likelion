package com.likelion.javaproject2.week4.day5;

public class Address {
    private String fullAddress;
    private String sido;
    private String sigungu;

    public Address(String fullAddress, String sido, String sigungu) {
        this.fullAddress = fullAddress;
        this.sido = sido;
        this.sigungu = sigungu;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public String getSido() {
        return sido;
    }

    public String getSigungu() {
        return sigungu;
    }
}
