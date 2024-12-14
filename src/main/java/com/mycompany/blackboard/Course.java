package com.mycompany.blackboard;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author murooj
 */
public class Course {

    private Teacher teacher = new Teacher();//teacher 
    private int courseID;//course id
    private String courseName;//course name

    /**
     * Default constructor for the Course class.
     */
    public Course() {
    }

    /**
     * Constructs a Course object with the specified teacher, courseID,
     * courseName.
     *
     * @param teacher:the teacher of the course.
     * @param courseID:the ID number of the course.
     * @param courseName:the name of the course.
     */
    public Course(Teacher teacher, int courseID, String courseName) {
        this.teacher = teacher;
        this.courseID = courseID;
        this.courseName = courseName;
    }

    /**
     * to get teacher information
     *
     * @return teacher information
     */
    public Teacher getTeacher() {
        return teacher;
    }

    /**
     * to modify teacher information
     *
     * @param teacher:enter new teacher information
     */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    /**
     * to get course ID number
     *
     * @return course ID number
     */
    public int getCourseID() {
        return courseID;
    }

    /**
     * to modify course ID number
     *
     * @param courseID :enter new course ID number
     */
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    /**
     * to get course name
     *
     * @return course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * to modify course name
     *
     * @param courseName :enter new course name
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * to add a new course
     */
    public void addCours() {

        Scanner in = new Scanner(System.in);
        System.out.println("[ Your making new course ] 👇🏼 \n> Please enter the Name of the Course : ");
        String courseName = in.next();
        this.courseName = courseName;
        System.out.println("> Enter the course ID number :");
        int courseID = in.nextInt();
        this.courseID = courseID;
        System.out.println("----------------------------------------");
        System.out.println(" ");

    }

    /**
     * to turn course information into a string
     *
     * @return all course information as a string
     */
    @Override
    public String toString() {
        return "\n[ TEACHER ] : " + teacher + "\n- COURSE:\n• Course name: " + courseName + "\n• Course ID: " + courseID;
    }

}
