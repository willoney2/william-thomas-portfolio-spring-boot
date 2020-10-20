package com.IntegratedProject.SpringIntegrated.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


@Entity
public class User {

    @Id
    @GeneratedValue()
    @JsonProperty("id")
    private int userId;
    @JsonProperty("firstName")
    private String userFirstName;
    @JsonProperty("lastName")
    private String userLastName;
    @JsonProperty("division")
    private String userDivision;
    @JsonProperty("score")
    private int userScore;

    public int getId() {
        return userId;
    }

    public void setId(int id) {
        this.userId = id;
    }

    public String getFirstName() {
        return userFirstName;
    }

    public void setFirstName(String firstName) {
        this.userFirstName = firstName;
    }

    public String getLastName() {
        return userLastName;
    }

    public void setLastName(String lastName) {
        this.userLastName = lastName;
    }

    public int getScore() {
        return userScore;
    }

    public void setScore(int score) {
        this.userScore = score;
    }

    public String getDivision() {
        return userDivision;
    }

    public void setDivision(String division) {
        this.userDivision = division;
    }
}
