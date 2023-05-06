package weekSix;

public class Student {
    String name;
    String id;
    String major;
    double gpa;

    // constructor
    public Student(String name, String id, String major, double gpa)
    {
        // variables are assigned the values of each instance of a Student
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = gpa;
    }

    void getStudentInfo()
    {
        System.out.printf("Name: %s%nID: %s%nMajor: %s%nGPA: %.1f",
                name, id, major, gpa);
    }
}
}
