package com.hospital.model;

public class Patient {

    private String firstName;
    private String lastName;
    private String gender;
    private String email;

    public Patient(String firstName,String lastName,String gender,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
    }

    public String getFirstName(){ return firstName; }
    public String getLastName(){ return lastName; }
    public String getGender(){ return gender; }
    public String getEmail(){ return email; }
}
