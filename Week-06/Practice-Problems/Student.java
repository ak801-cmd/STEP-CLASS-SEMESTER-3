class CollegeStudent
{
    String name;
    double attendance;

    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    CollegeStudent(String name, double attendance)
    {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    static void printCollegeInfo()
    {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}

public class Student
{
    public static void main(String[] args)
    {
        CollegeStudent s1 = new CollegeStudent("Ravi", 90.5);
        CollegeStudent s2 = new CollegeStudent("Anitha", 92.0);

        CollegeStudent.printCollegeInfo();
    }
}