package com.learn.springboot.through_tutorials_rest_api.bean;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private Marks englishMarks;
    private Marks mathematicsMarks;
//    private Marks physicsMarks;
//    private Marks chemistryMarks;
//    private Marks biologyMarks;


    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Marks getMathematicsMarks() {
        return mathematicsMarks;
    }

    public void setMathematicsMarks(Marks mathematicsMarks) {
        this.mathematicsMarks = mathematicsMarks;
    }

    public Marks getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(Marks englishMarks) {
        this.englishMarks = englishMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", englishMarks=" + englishMarks +
                ", mathematicsMarks=" + mathematicsMarks +
                '}';
    }
}
