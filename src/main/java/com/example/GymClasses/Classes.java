package com.example.GymClasses;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Classes {
    private String id;
    private String name;
    private String instructor;
    private String description;
    private String duration;
    private String availableSpot;

    public Classes(String id,
                   String name,
                   String instructor,
                   String description,
                   String duration,
                   String availableSpot)
    {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.description = description;
        this.duration = duration;
        this.availableSpot = availableSpot;


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvailableSpot() {
        return availableSpot;
    }

    public void setAvailableSpot(String availableSpot) {
        this.availableSpot = availableSpot;
    }



    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getDescription() {
        return description;
    }

    public String getDuration() {
        return duration;
    }

    public String getAvailablespot() {
        return availableSpot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setAvailablespot(String availablespot) {
        this.availableSpot = availablespot;
    }
}
