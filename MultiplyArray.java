import java.util.*;
public class MultiplyArray
{
public static void main(String[] args)
{
int n,i,j,k;
int [][] a=new int [3][3];
int [][] b=new int[3][3];
int [][] c=new int[3][3];

Scanner s=new Scanner(System.in);
System.out.println("Enter total rows and coloums");
n=s.nextInt();

System.out.println("Enter elements in 1st martrix");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("Enter elements in 2nd martrix");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
b[i][j]=s.nextInt();
}
}

System.out.println("Multiplication of martrix is\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
for(k=0;k<3;k++)
{
c[i][j]=c[i][j]+a[i][k]*b[k][j];
}
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.println(c[i][j]+" ");
}
}
System.out.println();
}
}

