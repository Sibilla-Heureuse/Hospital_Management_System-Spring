package com.hospital.model;

public class Doctor {

    private String firstName;
    private String lastName;
    private String specialty;
    private String email;

    public Doctor(String firstName,String lastName,String specialty,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.email = email;
    }

    public String getFirstName(){ return firstName; }
    public String getLastName(){ return lastName; }
    public String getSpecialty(){ return specialty; }
    public String getEmail(){ return email; }
}
