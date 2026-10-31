class PlacementStudent
{
    String studentName;
    String company;
    double packageLpa;

    PlacementStudent(String studentName, String company, double packageLpa)
    {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    void printRecord()
    {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }
}

public class PlacementRecord
{
    public static void main(String[] args)
    {
        PlacementStudent s1 = new PlacementStudent("Ravi", "TCS", 4.5);
        PlacementStudent s2 = new PlacementStudent("Anitha", "Zoho", 6.2);
        PlacementStudent s3 = new PlacementStudent("Karthik", "Infosys", 4.0);

        PlacementStudent[] records = {s1, s2, s3};

        for (PlacementStudent record : records)
        {
            record.printRecord();
        }
    }
}