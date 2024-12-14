package com.mycompany.blackboard;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {

    private ArrayList<Course> courses = new ArrayList<>();

    /**
     * Default constructor for the Student class.
     */
    public Student() {
    }

    /**
     * Constructs a Student object with the specified ID, name, email,
     * department, and courses.
     *
     *
     * @param ID The ID of the student.
     * @param name The name of the student.
     * @param email The email of the student.
     * @param department The department of the student.
     * @param courses The list of courses the student is enrolled in.
     */
    public Student(int ID, String name, String email, String department, ArrayList<Course> courses) {
        super(ID, name, email, department);
        this.courses = courses;
    }

    /**
     * Constructs a Student object with the specified ID, name, email,
     * department.
     *
     * @param ID The ID of the student.
     * @param name The name of the student.
     * @param email The email of the student.
     * @param department The department of the student.
     */
    public Student(int ID, String name, String email, String department) {
        super(ID, name, email, department);
    }

    /**
     * Displays a message from the student's teacher, if available.
     */
    @Override
    public void massage() {
        for (int l = 0; l < courses.size(); l++) {
            if (courses.get(l).getTeacher().getMassage().isEmpty()) {
                System.out.println("- Course :" + courses.get(l).getCourseName() + "\n[ Sorry NO MASSAGES was enterd ] :(");
            } else {
                System.out.println("- Course " + courses.get(l).getCourseName() + "\n- Massage :" + courses.get(l).getTeacher().getMassage());
            }
        }
    }

    /**
     * Displays a Grade information from the student's teacher, if available.
     */
    @Override
    public void grade() {
        for (int l = 0; l < courses.size(); l++) {
            if (courses.get(l).getTeacher().getGrade().getTotal() == 0) {
                System.out.println("- Course :" + courses.get(l).getCourseName() + "\n[ Sorry NO GRADE was enterd ] :(");
            } else {
                System.out.println("- Course :" + courses.get(l).getCourseName() + "\n• Grade:" + courses.get(l).getTeacher().getGrade().toString());
            }
        }
    }

    /**
     * To view the services provided by the platform
     *
     */
    @Override
    public void showMenu() {
        Scanner in = new Scanner(System.in);
        String choice;
        System.out.println(" ");
        System.out.println("- Welcome To Student Show Menu 👋🏼 -");

        do {
            System.out.println("> If you want to view your Massages enter number 1 \n> If you want to view your Grades enter number 2 \n> If you want to view your Information enter number 3");
            int input = in.nextInt();
            if (input == 1) {
                this.massage();
            } else if (input == 2) {
                this.grade();
            } else if (input == 3) {
                System.out.println(this.toString());
            }
            System.out.println("> Do you want another Service ? (YES / NO)");
            choice = in.next();
        } while (choice.equalsIgnoreCase("yes"));
    }

    /**
     * to let the student choose courses from the courses menu and put it in its
     * courses menu
     *
     * @param coursesMenu
     */
    public void selectedCourses(ArrayList<Course> coursesMenu) {

        System.out.println(" ");
        System.out.println("----------------------------------------");

        System.out.println("      -------------");
        System.out.println("     |" + " Course menu " + "|");
        System.out.println("      -------------");

        Scanner in = new Scanner(System.in);
        for (int y = 0; y < coursesMenu.size(); y++) {
            System.out.println(y + 1 + "- " + coursesMenu.get(y).toString());
        }
        String choice;
        System.out.println("> Do you want to add a new course ? (YES/NO)");
        String input = in.next();
        if (input.equalsIgnoreCase("yes")) {
            do {
                System.out.println(" ");
                System.out.println("- Choose the courses thats you want by its number on the menu 👇🏼");
                int choise = in.nextInt();
                courses.add(coursesMenu.get(choise - 1));
                System.out.println("> Do you want to add another course ? (YES / NO)");

                choice = in.next();
            } while (choice.equalsIgnoreCase("yes"));

        }
    }

    /**
     * Returns the list of courses the student is enrolled in.
     *
     * @return The courses the student is enrolled in.
     */
    public ArrayList<Course> getCourses() {
        return courses;
    }

    /**
     * Sets the list of courses the student is enrolled in.
     *
     * @param courses The courses to be set for the student.
     */
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    /**
     * Returns a string representation of the Student object. The string
     * includes the student's ID, name, email, department, and a list of
     * courses.
     *
     * @return A string representation of the Student object.
     */
    @Override
    public String toString() {
        String info = super.toString() + " \n- Courses:";

        for (int o = 0; o < courses.size(); o++) {
            info += courses.get(o);
        }
        return info;
    }

}
