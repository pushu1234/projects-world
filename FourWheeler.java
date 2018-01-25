import java.util.*;
public class FourWheeler extends Vehicle
{
private int capacity;
private String type;


public int getCapacity()
{return capacity;}
public String getType()
{ return type;}
public FourWheeler(int m,String n,String o,int capacity,String type)

{ super(m,n,o);
capacity=capacity;
type=type;
 
 
}
public String toString()

{return capacity+"type";
}
}