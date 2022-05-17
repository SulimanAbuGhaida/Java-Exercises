package com.übungen;

public class University {

    private String name="";
    private String adress ="";
    private Student [] myStudent;
    private int  studentNumber=0;

    public University(String name, int s){
        this.name =name;
        myStudent = new Student[s];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Student[] getMyStudent() {
        return myStudent;
    }

    public void setMyStudent(Student[] myStudent) {
        this.myStudent = myStudent;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    void addStudent(Student s){
        myStudent[studentNumber]= s;
        studentNumber +=1;
    }
    public void allStudent(){
        for (int i=0; i<studentNumber; i++){
            Student s = myStudent[i];
            System.out.println(s.getName() + " "+ s.getNachname() +" "+ s.getStudentNr());
        }
    }
}
