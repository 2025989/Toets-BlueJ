import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;

/**
 * Panel to show objects in the application.
 */
public class SchoolApplet extends Applet implements ActionListener {
    
    private School school;
    private Group group5A;
    private Group group5B;
    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;
    
    private Button printStudents;
    
    /**
     * Constructor for objects of class SchoolPanel.
     */
    public void init() {
        setSize(600, 600);
        setFont(new Font("Courier New", Font.PLAIN, 18));
        school = new School();
        printStudents = new Button("Print");
        printStudents.addActionListener(this);
        add(printStudents);
        
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
     * Paint things in the application window
     * @param g Graphics object used to draw things.
     */
    public void paint(Graphics g) {
        int index = 0;
        for (Group group : school.getGroupList()) {
            for (Student student : group.getStudentList()) {
                index++;
                g.drawString(student.getStudentInfo(), 20, 100+20*index);
            }
        }
    }
    
    /**
     * ActionListener for events of SchoolPanel object.
     * @param e ActionEvent object used to perform actions.
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == printStudents) {
            for (Group group : school.getGroupList()) {
                for (Student student : group.getStudentList()) {
                    student.setStudentInfo(student.toString());
                }
            }
            repaint();
        }
    }
    
}