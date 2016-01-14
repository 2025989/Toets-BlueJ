import java.util.ArrayList;

/**
 * A School where you can add and remove Students.
 */
public class School {
    
    private ArrayList<Group> groupList;
    
    /**
     * Constructor for objects of class School.
     */
    public School() {
        groupList = new ArrayList<Group>();
    }
    
    /**
     * Add a Group object to the School object.
     * @param group Group object to add.
     */
    public void addGroup(Group group) {
        groupList.add(group);
    }
    
    /**
     * Remove a Group object from the School object.
     * @param group Group object to remove.
     */
    public void removeGroup(Group group) {
        groupList.remove(group);
    }
    
    /**
     * Add a Student object to the School object.
     * @param student Student object to add.
     */
    public void addStudent(Student student, Group group) {
        group.getStudentList().add(student);
    }
    
    /**
     * Remove a Student object from the School object.
     * @param student Student object to remove.
     */
    public void removeStudent(Student student, Group group) {
        group.getStudentList().add(student);
    }
    
    /**
     * Count Student objects by age.
     * @param age age of the Student objects.
     * @return The amount of Student objects with a specific age.
     */
    public int countAge(int age) {
        int count = 0;
        for (Group group : groupList) {
            for (Student student : group.getStudentList()) {
                if (student.getAge() == age) {
                    count++;
                }
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
        for (Group group : groupList) {
            for (Student student : group.getStudentList()) {
                if (student.getGender() == gender) {
                    count++;
                }
            }
        }
        return count;
    }
    
    /**
     * Print a list of all the Student objects in this School object.
     */
    public void print() {
        System.out.println("----------------------------------");
        for (Group group : groupList) {
            for (Student student : group.getStudentList()) {
                System.out.printf(
                    " %-15s | %s | %s | %s%n",
                    student.getName(),
                    student.getGender(),
                    student.getDateBirth(),
                    student.getGroup()
                );
            }
        }
    }
    
    /**
     * Get the groupList of the School object.
     * @return The groupList of the School object.
     */
    public ArrayList<Group> getGroupList() {
        return groupList;
    }
    
}