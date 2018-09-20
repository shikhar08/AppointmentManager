package com.example.srishtishikhar.appointmentmanager;

/**
 * Created by Srishti Shikhar on 20-Sep-18.
 */

public class Doctors {
    String name;
    String License_number;
    String Address;
    String Specialization;
    int fees;
    String qualifications;
    public Doctors(){
    }

    public String getName() {
        return name;
    }

    public String getLicense_number() {
        return License_number;
    }

    public String getAddress() {
        return Address;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public int getFees() {
        return fees;
    }

    public String getQualifications() {
        return qualifications;
    }

    public Doctors(String name, String license_number, String address, String specialization, int fees, String qualifications) {
        this.name = name;
        License_number = license_number;
        Address = address;
        Specialization = specialization;
        this.fees = fees;
        this.qualifications = qualifications;
    }
}
