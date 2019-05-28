package com.example.GymClasses;

import java.util.ArrayList;
import java.util.UUID;

public class Gym {
    private String id;
    private String name;
    private String adress;
    private String openingHours;
    private String phonenumber;
    private String mail;

    public ArrayList<Member>membersInGym = new ArrayList<>();
    public ArrayList<Classes>classesAvailable = new ArrayList<>();


    public Gym(String id,String name, String adress, String openingHours,
               String phonenumber, String mail) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.openingHours = openingHours;
        this.phonenumber = phonenumber;
        this.mail = mail;

    }

    public ArrayList<Classes> getClassesAvailable() {
        return classesAvailable;
    }

    public void setClassesAvailable(ArrayList<Classes> classesAvailable) {
        this.classesAvailable = classesAvailable;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public ArrayList<Member> getMembersInGym() {
        return membersInGym;
    }

    public void setMembersInGym(ArrayList<Member> membersInGym) {
        this.membersInGym = membersInGym;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getMail() {
        return mail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
