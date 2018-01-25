public class FacultyTest
{
public static void main(String[] args)
{
ContractFaculty f=new ContractFaculty();

f.setName("darbar");
f.setSubject("java");
f.setSalary(50000);

f.setS(500);
f.setP(2);

System.out.println("Name of faculty is  "+f.getName()+"\n Subject teached is   "+f.getSubject()+"\n Salary per month is   "+f.getSalary()+"\n Salary per lecture is  "+f.getS()+"\n and Time to teach each day in hours is  "+f.getP());
}
}