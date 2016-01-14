

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SchoolTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SchoolTest
{
    private School school;
    private Group group5A;
    private Group group5B;
    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;
    
    

    /**
     * Default constructor for test class SchoolTest
     */
    public SchoolTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        school = new School();
        group5A = new Group("MMVAOO5A");
        group5B = new Group("MMVAOO5B");
        student1 = new Student("Ferhat", new Date(10, 6, 1999), "M", group5A);
        student2 = new Student("Rifati", new Date(18, 7, 1995), "M", group5A);
        student3 = new Student("Yuliya", new Date(20, 3, 1997), "V", group5B);
        student4 = new Student("Soufyane", new Date(17, 8, 1999), "M", group5B);
        
        school.addGroup(group5A);
        school.addGroup(group5B);
        school.addStudent(student1, group5A);
        school.addStudent(student2, group5A);
        school.addStudent(student3, group5B);
        school.addStudent(student4, group5B);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
