package com.pureintentions.hospital.Prescription;

public class PrescriptionModel {

    public static   String age;
    public  static   int days;
    public static  String height,weight;
    public  static String bp,name,patient_name;
    public static  boolean afternoon,empty,evening,morning;
    public static  String medicine_1,quantity_1,medicine_time1;
    public static  String medicine_2,quantity_2,medicine_time2;
    public static  String medicine_3,quantity_3,medicine_time3;

    public static String getMedicine_time1() {
        return medicine_time1;
    }

    public static void setMedicine_time1(String medicine_time1) {
        PrescriptionModel.medicine_time1 = medicine_time1;
    }

    public static String getMedicine_2() {
        return medicine_2;
    }

    public static void setMedicine_2(String medicine_2) {
        PrescriptionModel.medicine_2 = medicine_2;
    }

    public static String getQuantity_2() {
        return quantity_2;
    }

    public static void setQuantity_2(String quantity_2) {
        PrescriptionModel.quantity_2 = quantity_2;
    }

    public static String getMedicine_time2() {
        return medicine_time2;
    }

    public static void setMedicine_time2(String medicine_time2) {
        PrescriptionModel.medicine_time2 = medicine_time2;
    }

    public static String getMedicine_3() {
        return medicine_3;
    }

    public static void setMedicine_3(String medicine_3) {
        PrescriptionModel.medicine_3 = medicine_3;
    }

    public static String getQuantity_3() {
        return quantity_3;
    }

    public static void setQuantity_3(String quantity_3) {
        PrescriptionModel.quantity_3 = quantity_3;
    }

    public static String getMedicine_time3() {
        return medicine_time3;
    }

    public static void setMedicine_time3(String medicine_time3) {
        PrescriptionModel.medicine_time3 = medicine_time3;
    }

    public PrescriptionModel(
            String age, int days, String height, String weight, String bp, String name, String patient_name, boolean afternoon, boolean empty, boolean evening, boolean morning,
            String medicine_time1, String medicine_1, String quantity_1,
            String medicine_time2, String medicine_2, String quantity_2,
            String medicine_time3, String medicine_3, String quantity_3
    ) {
        this.age = age;
        this.days = days;
        this.height = height;
        this.weight = weight;
        this.bp = bp;
        this.name = name;
        this.patient_name = patient_name;
        this.afternoon = afternoon;
        this.empty = empty;
        this.evening = evening;
        this.morning = morning;
        this.medicine_1 = medicine_1;
        this.quantity_1 = quantity_1;
        this.medicine_time1=medicine_time1;

        this.medicine_2 = medicine_2;
        this.quantity_2 = quantity_2;
        this.medicine_time2=medicine_time2;

        this.medicine_3 = medicine_3;
        this.quantity_3 = quantity_3;
        this.medicine_time3=medicine_time3;
    }

    public static String getMedicine_1() {
        return medicine_1;
    }

    public static void setMedicine_1(String medicine_1) {
        PrescriptionModel.medicine_1 = medicine_1;
    }

    public static String getQuantity_1() {
        return quantity_1;
    }

    public static void setQuantity_1(String quantity_1) {
        PrescriptionModel.quantity_1 = quantity_1;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public boolean isAfternoon() {
        return afternoon;
    }

    public void setAfternoon(boolean afternoon) {
        this.afternoon = afternoon;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isEvening() {
        return evening;
    }

    public void setEvening(boolean evening) {
        this.evening = evening;
    }

    public boolean isMorning() {
        return morning;
    }

    public void setMorning(boolean morning) {
        this.morning = morning;
    }
}

