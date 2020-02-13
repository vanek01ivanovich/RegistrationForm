package model.entity;

public class NoteBook {
    private String name;
    private String surname;
    private String surnameName;
    private String nickname;
    private String phoneNumber;
    private String homePhoneNumber;
    private String email;
    private String index;
    private String cshf;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }
    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getIndex() {
        return index;
    }
    public void setIndex(String index) {
        this.index = index;
    }

    public String getCshf() {
        return cshf;
    }
    public void setCshf(String index) {
        this.cshf = cshf;
    }

    public String getSurnameName() {
        return surnameName;
    }
    public void setSurnameName() {
        this.surnameName = surname + " " + name.charAt(0) + ".";
    }
}
