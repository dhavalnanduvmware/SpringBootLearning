package com.learn.springboot.through_tutorials_rest_api.bean;

public class Marks {

    private String subject;
    private Integer marks;

    public Marks(String subject, Integer marks) {
        this.subject = subject;
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "subject='" + subject + '\'' +
                ", marks=" + marks +
                '}';
    }
}
