import java.util.*;
 public class Big
{
public static void main(String[] args)
{
int l,b,c;
Scanner s=new Scanner(System.in);
System.out.println("Enter two numbers");
l=s.nextInt();
b=s.nextInt();
if (l>b)
System.out.println("Here "+l+" is greater than "+b);
else
System.out.println("HEre" +b+" is greater than"+l );
}
}