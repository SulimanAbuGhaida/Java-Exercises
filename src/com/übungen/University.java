package com.übungen;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name = "";
    private String adress = "";
    private List<Student> myStudent;
    private int studentNumber = 4;


    public University(String name, int students) {
        this.name = name;
        myStudent = new ArrayList<>(students);
        Student s1 = new Student(1, "Mousa", "Abu Ghaida");
        Student s2 = new Student(2, "Suliman", "Abu Ghaida");
        Student s3 = new Student(3, "Mohammad", "Abu Ghaida");
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);
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

    void addStudent(Student s) {
        myStudent.add(s);
        studentNumber += 1;
    }

    public void searchStudent(String searchedStudent) {
        String resultFound = "";
        for (int i = 0; i < myStudent.size(); i++) {
            if (myStudent.get(i).getName().equals(searchedStudent)) {
                resultFound = "We have this name. Her/His Number is: " + myStudent.get(i).getStudentNr();
                break;
            } else {
                resultFound = "We didn't find the Student " + searchedStudent + ". Please try another name";
            }
        }
        System.out.println(resultFound);
    }

    public void editStudent(String n) {

        String[] first = n.split(",", 2);
        String actuellName = first[0];
        String newName = first[1];

        for (int i = 0; i < studentNumber; i++) {
            if (myStudent.get(i).getName().equals(actuellName)) {

                myStudent.get(i).setName(newName);
                System.out.println("We have this name and changed to " + myStudent.get(i).getName());
                break;
            }
        }
    }

    public void deleteStudent(String deletedStudent) {
        for (int i = 0; i < studentNumber; i++) {
            if (myStudent.get(i).getName().equals(deletedStudent)) {
                myStudent.remove(i);
                System.out.println("the name " + deletedStudent + " ist deleted :) ");
                break;
            }else{
                System.out.println("The name " + deletedStudent + " doesn#t existed. input an existed name please!");

            }
        }
    }

    public String allStudent() {
        for (int i = 0; i < myStudent.size(); i++) {
            Student s = myStudent.get(i);
            System.out.println(s.getStudentNr() + " " + s.getName() + " " + s.getNachname());
        }
        System.out.println("-----------------------------------");
        return "";

    }
 /* public List<Student> allStudent() {
      List<Student> allStudent = null;
      for (int i = 0; i < myStudent.size(); i++) {
          allStudent.add(myStudent.get(i));

      }
      return allStudent;
  }*/
}
