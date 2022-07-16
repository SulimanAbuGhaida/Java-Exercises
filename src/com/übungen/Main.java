package com.übungen;

import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.Thread.sleep;

public class Main {
    //The Question is from this link:
//https://mulham.github.io/%D8%A3%D9%85%D8%AB%D9%84%D8%A9-%D9%81%D9%8A-%D9%84%D8%BA%D8%A9-%D8%AC%D8%A7%D9%81%D8%A7/#%D8%A7%D9%84%D8%A3%D8%B3%D8%A6%D9%84%D8%A9

    public static void main(String[] args) {
        Student allStudent = null;
        University university = new University("DHBW", 1000);
        Scanner readinput = new Scanner(System.in);
        boolean door = false;

        var operation = 0;
        Scanner scanner = new Scanner(System.in);
        boolean theFirstDoorForEnter = true;
        while(theFirstDoorForEnter == true){
            System.out.println("Welcome to your University. Please press Enter to start the programm");

            String enterkey = readinput.nextLine();
            if(enterkey == ""){
                theFirstDoorForEnter = false;
            }else{
                System.out.println("Press only Enter please! :)");
            }
        }
        while (true) {
                try {int enterForContinue = 1;
                    if(enterForContinue ==2){
                        System.out.println( "press enter to continue or exit to stop the program ;)" );
                    String input = readinput.nextLine();
                    if (input == "") {

                        System.out.println("you can continue now :) ");

                        //here the else if does not work. I didn't find out why!?
                    } else if (input == "exit") {
                        System.out.println("exit");
                        exit(1);
                    }}
                } catch (Exception e) {
                    System.out.println("only enter or exit");
                }


            System.out.println("What Operation do you want to do?");
            System.out.println("1- add Student");
            System.out.println("2- view Students");
            System.out.println("3- search Student");
            System.out.println("4- edit Student info");
            System.out.println("5- delete Student");
            System.out.println("6- exit");


            try {

                operation = scanner.nextInt();
                while (operation != 1 && operation != 2 && operation != 3 && operation != 4 && operation != 5 && operation != 6) {
                    System.out.println(" please enter only number from 1 to 6");
                    operation = scanner.nextInt();
                }


                try {

                    switch (operation) {


                        case 1:
                            System.out.println("Enter the name of " +
                                    "Student");
                            String test = scanner.nextLine();
                                String    firstName =  scanner.nextLine();
                            System.out.println("Enter the Surname of Student");
                            String lastName = scanner.nextLine();
                            System.out.println("Enter the Student Number");
                            int idNumber = scanner.nextInt();

                            Student student = new Student(idNumber, firstName, lastName);
                            university.addStudent(student);
                            break;
                        case 2:
                            university.allStudent();
                            break;
                        case 3:
                            System.out.println("Enter the name of Student");
                            String searchedPerson = scanner.next();
                            university.searchStudent(searchedPerson);
                            sleep(4000);
                            break;
                        case 4:
                            String e;
                            System.out.println("Enter the name of actuell Student with the new Name in between with komma (,)");
                            e = scanner.nextLine();
                            while (!e.contains(",")) {
                                System.out.println("Please enter (,) between the tow names");
                                e = scanner.next();
                            }
                            university.editStudent(e);
                            sleep(4000);
                            break;
                        case 5:
                            System.out.println("Enter the name of Student");
                            String w = scanner.next();
                            university.deleteStudent(w);
                            sleep(4000);
                            break;
                        case 6:
                            System.out.println("Do you really wanna leave us? if yes, please write YES");
                            String leaveConfermation = "YES";
                            String leaveClient = scanner.nextLine();
                            leaveClient = scanner.nextLine();
                            if(leaveClient.equals(leaveConfermation)){
                                System.out.println("Thank you and Good bey :)");
                                exit(1);
                            }else{
                                System.out.println("That means continue :)");

                            }



                        default:
                            System.out.println("put number from 1 to 6");
                            sleep(4000);
                    }
                } catch (Exception e) {
                    System.out.println("put number from 1 to 5");
                    scanner = null;
                }
            } catch (Exception e) {
                System.out.println("please enter only numbers");
                operation = 0;
                scanner = new Scanner(System.in);
                System.out.println("--------  ________   _________ ---------");
            }
        }


    }
}