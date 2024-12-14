package com.mycompany.blackboard;

/**
 *
 * @author murooj
 */
public class Grade {

    private int midterm;
    private int Final;
    private int assignment;
    private int quiz;
    private int project;
    private int total = midterm + Final + assignment + quiz + project;
    private String grade = this.getGrade();

    /**
     * Default constructor for the Grade class.
     */
    public Grade() {
    }

    /**
     * Constructs a Course object with the specified midterm mark, Final mark,
     * assignment mark, quiz mark ,project mark.
     *
     * @param midterm:to enter midterm mark
     * @param Final:to enter Final mark
     * @param assignment:to enter assignment mark
     * @param quiz:to enter quiz mark
     * @param project:to enter project mark
     */
    public Grade(int midterm, int Final, int assignment, int quiz, int project) {
        this.midterm = midterm;
        this.Final = Final;
        this.assignment = assignment;
        this.quiz = quiz;
        this.project = project;

    }

    /**
     * to get midterm mark
     *
     * @return midterm mark
     */
    public double getMidterm() {
        return midterm;
    }

    /**
     * to modify midterm mark
     *
     * @param midterm:enter new midterm mark
     */
    public void setMidterm(int midterm) {
        this.midterm = midterm;
    }

    /**
     * to get Final mark
     *
     * @return Final mark
     */
    public double getFinal() {
        return Final;
    }

    /**
     * to modify Final mark
     *
     * @param Final:enter new Final mark
     */
    public void setFinal(int Final) {
        this.Final = Final;
    }

    /**
     * to get assignment mark
     *
     * @return assignment mark
     */
    public double getAssignment() {
        return assignment;
    }

    /**
     * to modify assignment mark
     *
     * @param assignment:enter new assignment mark
     */
    public void setAssignment(int assignment) {
        this.assignment = assignment;
    }

    /**
     * to get quiz mark
     *
     * @return quiz mark
     */
    public int getQuiz() {
        return quiz;
    }

    /**
     * to modify quiz mark
     *
     * @param quiz:enter new quiz mark
     */
    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    /**
     * to get project mark
     *
     * @return project mark
     */
    public int getProject() {
        return project;
    }

    /**
     * to modify project mark
     *
     * @param project:enter new project mark
     */
    public void setProject(int project) {
        this.project = project;
    }

    /**
     * to get total mark
     *
     * @return total mark
     */
    public int getTotal() {
        return total;
    }

    /**
     * to modify total mark
     *
     * @param total:enter new total mark
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * to get grade
     *
     * @return grade
     */
    public String getGrade() {
        if (100 >= total && total >= 95) {
            grade = "A+";
            return grade;
        }
        if (94 >= total && total >= 90) {
            grade = "A";
            return grade;
        }
        if (89 >= total && total >= 85) {
            grade = "B+";
            return grade;
        }
        if (84 >= total && total >= 80) {
            grade = "B";
            return grade;
        }
        if (79 >= total && total >= 75) {
            grade = "C+";
            return grade;
        }
        if (74 >= total && total >= 70) {
            grade = "C";
            return grade;
        }
        if (69 >= total && total >= 65) {
            grade = "D+";
            return grade;
        }
        if (64 >= total && total >= 60) {
            grade = "D";
            return grade;
        }
        return "[ You did not pass the course ] :( ";
    }

    /**
     * to modify grade
     *
     * @param grade:enter new grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * to turn grade information into a string
     *
     * @return all grade information as a string
     */
    @Override
    public String toString() {
        return "\n- GRADE: \n• Midterm=" + midterm + "\n• Final=" + Final + "\n• Assignment=" + assignment + "\n• Quiz=" + quiz + "\n• Project=" + project + "\n>> Total=" + total + "\n>> Grade=" + grade;

    }

}
