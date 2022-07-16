package com.übungen;



public class Student {

    public Student myStudent;
    private String name ="";
    private String nachname ="";
    private int studentNr ;

    public Student(int studentNr, String name, String nachname) {
        this.name = name;
        this.nachname = nachname;
        this.studentNr = studentNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getStudentNr() {
        return studentNr;
    }

    public void setStudentNr(int studentNr) {
        this.studentNr = studentNr;
    }
}
