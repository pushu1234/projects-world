 class First
{
public void Show()
{ System.out.println("show method of class first"); }
}
 class Second extends First
{
public void Show()
{ System.out.println("show method of class Second"); }
}
public class FirstSecond
{
public static void main(String[] args)
{
Second s=new Second();
s.Show();
}
}