package com.übungen;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name="";
    private String adress ="";
    private List<Student> myStudent;
    private int  studentNumber=0;


    public University(String name, int s){
        this.name =name;
        myStudent = new ArrayList<>(s);
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

    public List<Student> getMyStudent() {
        return myStudent;
    }

    public void setMyStudent(Student m) {
        myStudent.add(m);
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {

        this.studentNumber = studentNumber;
    }
    void addStudent(Student s){
        myStudent.add(s);
        studentNumber +=1;
    }

    public String searchStudent(String n){
        for(int i=0; i<studentNumber; i++){
            if (myStudent.get(i).getName().equals(n) ){
                System.out.println("We have this name. Her/His Number is: " + myStudent.get(i).getStudentNr());
                break;
            }
        }return ("We found it");
    }
    public void editStudent(String n){

        String[] first = n.split(",",2 );
        String actuellName = first[0];
        String newName = first[1];

        for(int i=0; i<studentNumber; i++){
            if (myStudent.get(i).getName().equals(actuellName) ){

                myStudent.get(i).setName(newName);
                System.out.println("We have this name and changed to " + myStudent.get(i).getName());
                break;
            }
        }
    }

    public String deleteStudent(String n){
        for(int i=0; i<studentNumber; i++){
            if (myStudent.get(i).getName().equals(n) ){
                myStudent.remove(i);
                System.out.println("We have this name already. input another name ");
                break;
            }
        }return ("We found it");
    }

    public void allStudent(){
        for (int i=0; i<studentNumber; i++){
            Student s = myStudent.get(i);
            System.out.println(s.getName() + " "+ s.getNachname() +" "+ s.getStudentNr());
        }
    }
}
