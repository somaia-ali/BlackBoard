package com.mycompany.blackboard;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Muroojfkksta
 */
public class BlackBoard{

    public final static String BrightBlue = "\u001b[34;1m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("     ~~Welcome To~~");
        System.out.println(BrightBlue + "      BLACKBOARD");

        System.out.println("     -------------");
        System.out.println("     |" + "   START   " + "|");
        System.out.println("     -------------");

        Scanner scnr = new Scanner(System.in);
        String start = scnr.nextLine();
        System.out.println(" ");
        System.out.println("----------------------------------------");

        Scanner in = new Scanner(System.in);

        String register;
        ArrayList<Course> CourseMenu = new ArrayList<Course>();
        ArrayList<Student> StudentMenu = new ArrayList<Student>();
        ArrayList<Teacher> TeachertMenu = new ArrayList<Teacher>();
        do {
            System.out.println("> Enter 1 for Teacher or 2 for Student:-");
            int choice = in.nextInt();
            if (choice == 1) {

                System.out.println("> Are you a new user ? (YES/NO)");
                String user = in.next();

                System.out.println(" ");
                System.out.println("----------------------------------------");

                System.out.println("- Teacher Information -");
                System.out.println("• Enter Teacher Name :");
                String teacherName = in.next();
                System.out.println("• Enter Teacher Id :");
                int teacherId = in.nextInt();
                System.out.println("• Enter Teacher Email :");
                String teacherEmail = in.next();
                System.out.println("• Enter Teacher Department :");
                String teacherDepartment = in.next();
                Teacher teacher = new Teacher(teacherId, teacherName, teacherEmail, teacherDepartment);

                for (int x = 0; x < TeachertMenu.size(); x++) {
                    if (TeachertMenu.get(x).equals(teacher)) {
                        System.out.println(" ");
                        System.out.println("[ You are already registered ] \nWELCOME BACK 👋🏼 " + TeachertMenu.get(x).getName());
                        System.out.println("> Do you want to change student Messages and Grade ? (YES/NO)");
                        String input = in.next();
                        if (input.equalsIgnoreCase("yes")) {
                            System.out.println("• Enter student ID to change its messages and grade :");
                            int sId = in.nextInt();
                            for (int d = 0; d < StudentMenu.size(); d++) {
                                if (StudentMenu.get(d).getID() == sId) {
                                    for (int q = 0; q < StudentMenu.get(d).getCourses().size(); q++) {
                                        if (StudentMenu.get(d).getCourses().get(q).getTeacher().equals(TeachertMenu.get(x))) {
                                            StudentMenu.get(d).getCourses().get(q).getTeacher().showMenu();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (user.equalsIgnoreCase("yes")) {
                    Course course = new Course();
                    course.addCours();
                    course.setTeacher(teacher);
                    TeachertMenu.add(teacher);
                    CourseMenu.add(course);
                }
            } else if (choice == 2) {
                System.out.println("> Are you a new user ? (YES/NO)");
                String user = in.next();

                System.out.println(" ");
                System.out.println("----------------------------------------");

                System.out.println("- Student details -");
                System.out.println("• Enter Student Name :");
                String studentName = in.next();
                System.out.println("• Enter student Id :");
                int studentId = in.nextInt();
                System.out.println("• Enter Student Email :");
                String studentEmail = in.next();
                System.out.println("• Enter student Department :");
                String studentDepartment = in.next();
                Student student = new Student(studentId, studentName, studentEmail, studentDepartment);

                for (int w = 0; w < StudentMenu.size(); w++) {
                    if (StudentMenu.get(w).equals(student)) {
                        System.out.println(" ");
                        System.out.println("[ You are already registered ] \nWELCOMEBACK 👋🏼 " + StudentMenu.get(w).getName());
                        StudentMenu.get(w).showMenu();
                    }
                }
                if (user.equalsIgnoreCase("yes")) {
                    student.selectedCourses(CourseMenu);
                    StudentMenu.add(student);

                }
            }
            System.out.println("> Do you want to register again?  (YES / NO)");
            register = in.next();
        } while (register.equalsIgnoreCase("yes"));
        String studentAsString = "";
        for (int n = 0; n < StudentMenu.size(); n++) {
            studentAsString += StudentMenu.get(n).toString() + "\n";
        }
        try {

            File write_file = new File("C:\\Users\\Somai\\Documents\\NetBeansProjects\\BlackBoard\\Student_info.txt\\");

            PrintWriter ListOfStudent = new PrintWriter(write_file);
            ListOfStudent.println(studentAsString);
            ListOfStudent.close();

        } catch (IOException ex) {
            System.out.println("File not exsist");
        }
        try {
            File read_file = new File("C:\\Users\\Somai\\Documents\\NetBeansProjects\\BlackBoard\\Authors.txt\\");
            Scanner inputFile = new Scanner(read_file);
            while (inputFile.hasNext()) {
                String aName = inputFile.next();
                String lName = inputFile.next();
                String sName = inputFile.next();
                String rName = inputFile.next();
                String mName = inputFile.next();
                System.out.println(" ♡ MADE BY : " + aName + ", " + lName + ", " + sName + ", " + rName + ", " + mName +" ♡");
                System.out.println(" ");
                System.out.println("☆ ･｡°*. With all the love and respect we want a bonus ･｡°*. ‏ ☆ ﾟ");
            }
            inputFile.close();
        } catch (IOException ex) {
            System.out.println("File not exsist");
        }
    }
}
