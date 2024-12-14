package com.mycompany.blackboard;

import java.util.Scanner;

/**
 *
 * @author Murooj
 */
public class Teacher extends Person {

    private String massage = "";
    private Grade grade = new Grade();

    /**
     * Default constructor for the teacher class.
     */
    public Teacher() {
    }

    /**
     * Constructs a Teacher object with the specified ID, name, email,
     * department
     *
     * @param ID The ID of the Teacher.
     * @param name The name of the Teacher.
     * @param email The email of the Teacher.
     * @param department The department of the Teacher.
     */
    public Teacher(int ID, String name, String email, String department) {
        super(ID, name, email, department);
    }

    /**
     * to get course message that been entered by teacher
     *
     * @return Teacher message
     */
    public String getMassage() {
        return massage;
    }

    /**
     * to get course grade that been entered by teacher
     *
     * @return course grade
     */
    public Grade getGrade() {
        return grade;
    }

    /**
     * send a message that had been wrriten by the course teacher to the
     * student.
     */
    @Override
    public void massage() {
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("- Enter your massage : ");
        String m = in.nextLine();
        this.massage += m + "\n";
    }

    /**
     * enter course grade information by teacher and send it to student.
     */
    @Override
    public void grade() {
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("• Enter the student assignment mark :");
        int assignment = in.nextInt();
        grade.setAssignment(assignment);
        System.out.println("• Enter the student Final mark :");
        int Final = in.nextInt();
        grade.setFinal(Final);
        System.out.println("• Enter the student Midterm mark :");
        int Midterm = in.nextInt();
        grade.setMidterm(Midterm);
        System.out.println("• Enter the student Quiz mark :");
        int Quiz = in.nextInt();
        grade.setQuiz(Quiz);
        System.out.println("• Enter the student project mark :");
        int project = in.nextInt();
        grade.setProject(project);
        int total = assignment + Final + Midterm + Quiz + project;
        grade.setTotal(total);
        grade.setGrade(grade.getGrade());
    }

    /**
     * To add some of the services provided by the platform.
     *
     * @param t
     */
    @Override
    public void showMenu() {
        Scanner in = new Scanner(System.in);
        String choice;
        System.out.println(" ");
        System.out.println("- Welcome To Teacher Show Menu 👋🏼 -");
        do {
            System.out.println("> If you want to add a new massage enter number 1 \n> If you want to enter Student grades enter number 2 \n> If you want to view your Information enter number 3");
            int input = in.nextInt();
            switch (input) {
                case 1:
                    this.massage();
                    break;
                case 2:
                    this.grade();
                    break;
                case 3:
                    System.out.println(this.toString());
                    break;
                default:
                    break;
            }

            System.out.println("> Do you want another service ? (YES / NO) ");
            choice = in.next();
        } while (choice.equalsIgnoreCase("yes"));

    }

    /**
     * to turn teacher information into a string
     *
     * @return all teacher information as a string
     */
    @Override
    public String toString() {
        String info = super.toString() + grade.toString() + "\n- MASSAGE: " + massage;
        return info;
    }
}
