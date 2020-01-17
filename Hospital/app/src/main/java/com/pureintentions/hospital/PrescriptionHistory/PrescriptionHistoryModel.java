package com.pureintentions.hospital.PrescriptionHistory;

public class PrescriptionHistoryModel {

    private static String Date;

    public PrescriptionHistoryModel(String date) {
        Date = date;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
