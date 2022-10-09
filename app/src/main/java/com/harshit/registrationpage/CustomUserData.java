package com.harshit.registrationpage;
public class CustomUserData {

    String ID, Issue,Feedback,phoneno;

    public CustomUserData() {
    }

    public CustomUserData(String ID, String Issue, String Feedback,String phoneno) {
        this.ID = ID;
        this.Issue = Issue;
        this.Feedback = Feedback;
        this.phoneno = phoneno;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIssue() {
        return Issue;
    }

    public void setIssue(String issue) {
        Issue = issue;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String feedback) {
        Feedback = feedback;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
/* public String getUsername() {
        return ID;
    }

    public void setUsername(String username) {
        this.ID = username;
    }

    public String getFullName() {
        return Issue;
    }

    public void setFullName(String fullName) {
        this.Issue = fullName;
    }

    public String getProfession() {
        return Feedback;
    }

    public void setProfession(String profession) {
        this.Feedback = profession;
    }


    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }*/

    @Override
    public String toString() {
        return "CustomUserData{" +
                "ID='" + ID + '\'' +
                ", Issue='" + Issue + '\'' +
                ", Feedback='" + Feedback + '\'' +
                ", PhoneNo='" + phoneno + '\'' +
                '}';
    }
}


