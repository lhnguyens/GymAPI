package com.example.GymClasses;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Training {

    private List<Gym> listOfGyms;


    public Training() {
        this.listOfGyms = new ArrayList<>();
        mockData();
    }



    private void mockData() {

        Gym  gym1 = new Gym(
                "01",
                "Fitness24",
                "Spolegatan 22, 132 23, Malmö",
                "06:00-22:00",
                "0724492286",
                "Fitness24@fitness.com");
        Gym gym2 =  new Gym("02",
                "SATS",
                "Tulegatan 32, 152 21, Stockholm",
                "06:00-22:00",
                "0724322286",
                "SATS@fitness.com");


        listOfGyms.add(gym1);
        listOfGyms.add(gym2);

    }

    public List<Gym> getAllGyms () {
        return listOfGyms;
    }
    public  void addNewGym(Gym gym) {
        listOfGyms.add(gym);
    }



    public void addMemberByID (String id, Member member) {
        for (Gym gym: listOfGyms){
            if (gym.getId().equals(id))
                gym.membersInGym.add(member);
        }
    }

    public void addClassesByID (String id, Classes newClass) {
        for (Gym gym: listOfGyms){
            if (gym.getId().equals(id))
                gym.classesAvailable.add(newClass);

        }
    }
    public List<Member> returnAllMembersInGym(String id) {
        ArrayList<Member> memberList = new ArrayList<>();
            for(Gym gym: listOfGyms){
                if  (gym.getId().equals(id))
                    for (Member member: gym.getMembersInGym()) {
                        memberList.add(member);
                    }
        }
            return  memberList;
    }

    public List<Classes> returnAllClassesInGym(String classID) {
        ArrayList<Classes> classesList = new ArrayList<>();
            for(Gym gym: listOfGyms) {
                if(gym.getId().equals(classID))
                    for(Classes classes:gym.getClassesAvailable()) {
                        classesList.add(classes);
                    }
            }
            return  classesList;
    }


    public void deleteClassById(String gymID, String classID) {
        for(Gym gym : listOfGyms){
            if (gym.getId().equals(gymID))
                for (Classes classes: gym.getClassesAvailable()) {
                    if(classes.getId().equals(classID))
                        gym.getClassesAvailable().remove(classes);
                }
        }
    }

    public void deleteMembersById(String gymId, String membersID) {
        for (Gym gym: listOfGyms){
            if (gym.getId().equals(gymId))
                for (Member members: gym.getMembersInGym()) {
                    if(members.getId().equals(membersID))
                        gym.getMembersInGym().remove(members);

                }
        }
    }
}

