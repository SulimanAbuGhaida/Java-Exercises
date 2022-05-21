package com.übungen;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {
    //The Question is from this link:
//https://mulham.github.io/%D8%A3%D9%85%D8%AB%D9%84%D8%A9-%D9%81%D9%8A-%D9%84%D8%BA%D8%A9-%D8%AC%D8%A7%D9%81%D8%A7/#%D8%A7%D9%84%D8%A3%D8%B3%D8%A6%D9%84%D8%A9

    public static void main(String[] args) {

        University uni = new University("DHBW", 1000);

        var operation = 0;
        Scanner r = new Scanner(System.in);

        while (operation != 6) {

            System.out.println("What Operation do you want to do?");
            System.out.println("1- add Student");
            System.out.println("2- view Students");
            System.out.println("3- search Student");
            System.out.println("4- edit Student info");
            System.out.println("5- delete Student");


            try {
                operation = r.nextInt();
                while (operation != 1 && operation != 2 && operation != 3 && operation != 4 && operation != 5 && operation != 6) {
                    System.out.println(" please enter only number from 1 to 6");
                    operation = r.nextInt();
                }


                try {
                    switch (operation) {


                        case 1:
                            System.out.println("Enter the name of Student");
                            String a = r.next();
                            System.out.println("Enter the Surname of Student");
                            String b = r.next();
                            System.out.println("Enter the Student Number");
                            int c = r.nextInt();

                            Student s = new Student(a, b, c);
                            uni.addStudent(s);
                            break;
                        case 2:
                            uni.allStudent();
                            break;
                        case 3:
                            System.out.println("Enter the name of Student");
                            String d = r.nextLine();
                            uni.searchStudent(d);
                        case 4:
                            System.out.println("Enter the name of Student");
                            String e = r.nextLine();
                            uni.editStudent(e);
                        case 5:
                            System.out.println("Enter the name of Student");
                            String w = r.next();
                            uni.deleteStudent(w);
                        default:
                            System.out.println("put number from 1 to 5");
                    }
                } catch (Exception e) {
                    System.out.println("put number from 1 to 5");
                    r = null;
                }
            } catch (Exception e) {
                System.out.println("please enter only numbers");
                operation = 0;
                r = new Scanner(System.in);
                System.out.println("--------  ________   _________ ---------");
            }
        }


    }
}