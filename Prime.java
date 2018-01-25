import java.util.*;
public class Prime
{
public static void main(String[] args)
{
double n,i,r;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
n=s.nextDouble();
for(i=2;i<n/2;i++)
{
r=n%i;
if(r==0)
System.out.println("The number is not a PRIME number");
else
System.out.println("The number is prime number");
}
}
}