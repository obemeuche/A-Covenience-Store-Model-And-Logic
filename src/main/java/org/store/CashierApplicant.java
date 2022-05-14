package org.store;

import org.storeEnum.Gender;
import org.storeEnum.Qualification;

public class CashierApplicant {
    private String name;
    private String phoneNumber;
    private Gender gender;
    private Integer age;
    private Qualification qualification;
    private Integer interviewScore;

    public CashierApplicant() {

    }

    public CashierApplicant(String name, String phoneNumber, Gender gender, Integer age, Qualification qualification, Integer interviewScore) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
        this.qualification = qualification;
        this.interviewScore = interviewScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public Integer getInterviewScore() {
        return interviewScore;
    }

    public void setInterviewScore(Integer interviewScore) {
        this.interviewScore = interviewScore;
    }
}
