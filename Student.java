/**
 * A Student to add to or remove from a School object.
 */
public class Student {
    
    private String name;
    private Date dateBirth;
    private String gender;
    private Group group;
    private String studentInfo;
    
    /**
     * Constructor for objects of class Student.
     * @param name Name of the Student object.
     * @param dateBirth Date of the Student object.
     * @param gender Gender of the Student object.
     * @param group Group of the Student object.
     */
    public Student(String name, Date dateBirth, String gender, Group group) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.gender = gender;
        this.group = group;
        studentInfo = "";
    }
    
    /**
     * Get the age of the Student object.
     * @return The age of the Student object. Ignores day and month.
     */
    public int getAge() {
        return 2016-dateBirth.getYear();
    }
    
    /**
     * Prints the attributes of the Student object.
     */
    public void print() {
        System.out.println(name+", "+gender+", "+dateBirth);
    }
    
    /**
     * Override toString() for Student class.
     */
    @Override
    public String toString() {
        return String.format("%-15s | %s | %s | %s", name, gender, dateBirth, group);
    }
    
    
    //*** Getters and Setters ***//
    
    /**
     * Get the name of the Student object.
     * @return The name of the Student object.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Set the name of the Student object.
     * @param name The name of the Student object.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Get the dateBirth of the Student object.
     * @return The dateBirth of the Student object.
     */
    public String getDateBirth() {
        return dateBirth.toString();
    }
    
    /**
     * Set the dateBirth of the Student object.
     * @param dateBirth The dateBirth of the Student object.
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    
    /**
     * Get the gender of the Student object.
     * @return The gender of the Student object.
     */
    public String getGender() {
        return gender;
    }
    
    /**
     * Set the gender of the Student object.
     * @param gender The gender of the Student object.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    /**
     * Get the group of the Student object.
     * @return The group of the Student object.
     */
    public String getGroup() {
        return group.toString();
    }
    
    /**
     * Set the group of the Student object.
     * @param group The group of the Student object.
     */
    public void setGroup(Group group) {
        this.group = group;
    }
    
    /**
     * Get the studentInfo of the Student object.
     * @return The studentInfo of the Student object.
     */
    public String getStudentInfo() {
        return studentInfo;
    }
    
    /**
     * Set the studentInfo of the Student object.
     * @param studentInfo The studentInfo of the Student object.
     */
    public void setStudentInfo(String studentInfo) {
        this.studentInfo = studentInfo;
    }
    
}