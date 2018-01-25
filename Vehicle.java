public class Vehicle
{
public int price;
public String name,color;

public Vehicle( int x,String y,String z)

{ price=x ; color=y;name=z; }

public int getprice()
{ return price;}
public String getcolor()
{ return color;}
public String getname()
{ return name;}
public String toString()
{ return "Name of vehicle is"+name+"Color is"+color+"and Price of vehicle is"+price;}
}
