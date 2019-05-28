package com.example.GymClasses;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GymController {

    private Training gyms = new Training();

    @RequestMapping(value = "/gym", method = RequestMethod.GET)
    private List<Gym> getGyms() {
        return gyms.getAllGyms();
    }
    @RequestMapping(value = "/gym", method = RequestMethod.POST)
    public Gym postGym (@RequestBody Gym gym) {
        gyms.addNewGym(gym);
        return  gym;
    }
    @RequestMapping(value = "/gym/{id}/members", method = RequestMethod.POST)
    public Member addMember (@PathVariable("id") String membersId, @RequestBody Member member) {
        gyms.addMemberByID(membersId, member);
        return member;
    }
    @RequestMapping(value = "/gym/{id}/members", method = RequestMethod.GET)
    public List<Member> getAllMembers (@PathVariable("id") String membersId) {
       return gyms.returnAllMembersInGym(membersId);
    }

    @RequestMapping(value = "/gym/{id}/classes", method = RequestMethod.POST)
    public Classes addClass(@PathVariable("id") String classId, @RequestBody Classes newClass) {
        gyms.addClassesByID(classId, newClass);
        return newClass;
    }
    @RequestMapping(value = "/gym/{id}/classes", method = RequestMethod.GET)
    public List<Classes> getAllClasses(@PathVariable("id") String classID ) {
        return gyms.returnAllClassesInGym(classID);
    }

    @RequestMapping(value =  "/gym/{gymID}/classes/{classID}", method = RequestMethod.DELETE)
    public void deleteClassByID(@PathVariable("gymID") String gymID, @PathVariable("classID") String classID) {
        gyms.deleteClassById(gymID, classID);
    }

    @RequestMapping(value = "/gym/{gymId}/members/{membersID}", method = RequestMethod.DELETE)
    public void deleteMembersByID(@PathVariable("gymId") String gymId, @PathVariable("membersID") String membersID) {

        gyms.deleteMembersById(gymId, membersID);

    }



}
