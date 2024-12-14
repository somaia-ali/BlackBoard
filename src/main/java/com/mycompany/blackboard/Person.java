package com.mycompany.blackboard;

public abstract class Person implements Servies {

    protected int ID;
    protected String name;
    protected String email;
    protected String department;

    /**
     * Default constructor for the Person abstract class.
     */
    public Person() {
    }

    /**
     * Constructs a Person object with the specified Id ,name, email,
     * ,departmentto create a new Person.
     *
     * @param ID:enter the person ID
     * @param name:enter the person name
     * @param email:enter the person email
     * @param department :enter the person department
     */
    public Person(int ID, String name, String email, String department) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    /**
     * to get person ID
     *
     * @return person ID
     */
    public int getID() {
        return ID;
    }

    /**
     * to get person name
     *
     * @return person name
     */
    public String getName() {
        return name;
    }

    /**
     * to get person email
     *
     * @return person email
     */
    public String getEmail() {
        return email;
    }

    /**
     * to get person department
     *
     * @return person department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * to modify person ID
     *
     * @param ID:enter new person ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * to modify person name
     *
     * @param name:enter new person name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * to modify person email
     *
     * @param email:enter new person email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * to modify person department
     *
     * @param department:enter new person department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * to turn Person information into a string
     *
     * @return all Person information as a string
     */
    @Override
    public String toString() {
        return "\n• Name: " + name + "\n• ID: " + ID + "\n• Email: " + email + "\n• Department: " + department;
    }

    /**
     * to compare two Person by their ID number
     *
     * @return if two Person has the same ID return true otherwise return false
     */
    @Override
    public boolean equals(Object o) {
        Person a = (Person) o;
        return (a.getID() == this.getID());
    }

}
