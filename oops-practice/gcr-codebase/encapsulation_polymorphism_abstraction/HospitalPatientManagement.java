package encapsulation_inheritance_polymorphism;

import java.util.ArrayList;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    abstract double calculateBill();

    Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public void getPatientDetails() {
        System.out.println("Patient Id: " + patientId);
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private ArrayList<String> records;

    InPatient(int patientId, String name, int age, double roomCharge) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
        records = new ArrayList<String>();
    }

    double calculateBill() {
        double bill;
        bill = roomCharge + 2000; // roomCharge + fixed treatment charge
        return bill;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public void viewRecords() {
        System.out.println("Medical Records:");
        for(int i = 0; i < records.size(); i++) {
            System.out.println((i+1) + ". " + records.get(i));
        }
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private ArrayList<String> records;

    OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        records = new ArrayList<String>();
    }

    double calculateBill() {
        double bill;
        bill = consultationFee + 500; // consultation + fixed test charges
        return bill;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public void viewRecords() {
        System.out.println("Medical Records:");
        for(int i = 0; i < records.size(); i++) {
            System.out.println((i+1) + ". " + records.get(i));
        }
    }
}

public class HospitalPatientManagement {

    public static void processPatients(Patient[] patients) {

        for(int i = 0; i < patients.length; i++) {
            patients[i].getPatientDetails();
            double bill = patients[i].calculateBill();
            System.out.println("Total Bill : " + bill);

            MedicalRecord mr = (MedicalRecord)patients[i];
            mr.viewRecords();

            System.out.println();
        }
    }

    public static void main(String[] args) {

        InPatient p1 = new InPatient(101, "Amit Kumar", 45, 5000);
        OutPatient p2 = new OutPatient(102, "Sonia Sharma", 30, 800);
        p1.addRecord("Diagnosed with hypertension");
        p1.addRecord("Prescribed medication A");
        p2.addRecord("Routine checkup, healthy");
        Patient[] patientList = {p1, p2};
        processPatients(patientList);
    }
}
