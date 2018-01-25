import java.util.Scanner
public class Star
{
public static void main(String[] args)
{
int n,i,j;
System.out.println("Enter the value of n");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<n;i++)
{
for(j=1;j<n;j++)
{
if(i==j||j==(n-i-1))
{System.out.println("*");}
else
{System.out.println(" ");
}
}}}}