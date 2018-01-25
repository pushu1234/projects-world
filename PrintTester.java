public class PrintTester
{
public static void main(String[] args)
{
PrintTest t=new PrintTest();
t.setA(5);
t.setB(6.5);
t.setC("Boss");

System.out.println("a="+t.getA() +"b="+t.getB()+ "c="+t.getC());
}
}