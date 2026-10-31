class EmployeeInfo
{
    String empName;
    double salary;

    static String companyName =
            "Bright Horizon Technologies";

    static int employeeCount = 0;

    EmployeeInfo(String empName, double salary)
    {
        this.empName = empName;
        this.salary = salary;

        employeeCount++;
    }

    static void printCompanyInfo()
    {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class CompanyEmployee
{
    public static void main(String[] args)
    {
        EmployeeInfo e1 =
                new EmployeeInfo("Rahul", 50000);

        EmployeeInfo e2 =
                new EmployeeInfo("Priya", 60000);

        EmployeeInfo e3 =
                new EmployeeInfo("Amit", 55000);

        EmployeeInfo.printCompanyInfo();
    }
}