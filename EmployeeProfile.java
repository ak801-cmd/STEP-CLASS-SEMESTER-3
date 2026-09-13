class EmployeeData
{
    String empId;
    String empName;
    double salary;
    boolean isIntern;

    public EmployeeData(String empId, String empName, double salary)
    {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    public EmployeeData(String empId, String empName)
    {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    public void printProfile()
    {
        System.out.println(empId + " | " + empName
                + " | Rs " + salary
                + " | Intern: " + isIntern);
    }
}

public class EmployeeProfile
{
    public static void main(String[] args)
    {
        EmployeeData permanent =
                new EmployeeData("E-101", "Divya", 65000);

        EmployeeData intern =
                new EmployeeData("E-102", "Arjun");

        permanent.printProfile();
        intern.printProfile();
    }
}