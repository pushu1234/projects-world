public class TwoWheeler extends Vehicle
{
private int mileage;
private int torque;

public void setMileage(int f)
{ mileage=f;}
public void setTorque(int g)
{ torque=g;}

public int getMileage()
{ return mileage;}
public int getTorque()
{ return torque;}

public TwoWheeler(int m,String n,String o,int f,int g)
{ super(m,n,o);
 mileage=mileage;
 torque=torque;
}
}