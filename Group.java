import java.util.ArrayList;

/**
 * A Group where you can add and remove Students.
 */
public class Group {
    
    private ArrayList<Student> studentList;
    private String name;
    
    /**
     * Constructor for objects of class Group.
     * @param name Name of the Group object.
     */
    public Group(String name) {
        studentList = new ArrayList<Student>();
        this.name = name;
    }
    
    /**
     * Override toString() for Group class.
     */
    @Override
    public String toString() {
        return name;
    }
    
    /**
     * Add a Student object to the Group object.
     * @param student Student object to add.
     */
    public void addStudent(Student student) {
        studentList.add(student);
    }
    
    /**
     * Remove a Student object from the Group object.
     * @param student Student object to remove.
     */
    public void removeStudent(Student student) {
        studentList.remove(student);
    }
    
    /**
     * Count Student objects by age.
     * @param age age of the Student objects.
     * @return The amount of Student objects with a specific age.
     */
    public int countAge(int age) {
        int count = 0;
        for (Student student : studentList) {
            if (student.getAge() == age) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Count Student objects by gender.
     * @param gender gender of the Student objects.
     * @return The amount of Student objects with a specific gender.
     */
    public int countGender(String gender) {
        int count = 0;
        for (Student student : studentList) {
            if (student.getGender() == gender) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Print a list of all the Student objects in this Group object.
     */
    public void print() {
        System.out.println("---------------------------------------------");
        for (Student student : studentList) {
            System.out.printf(
                " %-15s | %s | %s | %s%n",
                student.getName(),
                student.getGender(),
                student.getDateBirth(),
                student.getGroup()
            );
        }
    }
    
    /**
     * Get the studentList of the Group object.
     * @return The studentList of the Group object.
     */
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    
}