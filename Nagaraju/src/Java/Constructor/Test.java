package Constructor;
class Car  
{  
    public int gear; 
    public int speed; 
    public Car(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
    } 
    public void applyBrake(int decrement) 
    { 
        speed -= decrement; 
    }    
    public void speedUp(int increment) 
    { 
        speed += increment; 
    } 
    public String toString()  
    { 
        return("No of gears are "+gear  +"\n"+ "speed of Car is "+speed); 
    }  
} 
  
class MountainCar extends Car  
{ 
    public int groundClearance;  
    public MountainCar(int gear,int speed,int startClearance) 
    { 
        super(gear, speed); 
        groundClearance = startClearance; 
    }  
    public void groundClearance(int newValue) 
    { 
        groundClearance = newValue; 
    }  

    @Override
    public String toString()  
    { 
        return (super.toString()+"\n Ground Clearance is "+groundClearance); 
    } 
      
} 

public class Test  
{ 
    public static void main(String args[])  
    { 
        Car mc2 = new MountainCar(4, 200, 40); 
        MountainCar mc1 = new MountainCar(3, 100, 25); 
          
        System.out.println("Ground Clearance of first Car is " + mc1.groundClearance); 
        System.out.println(mc1.toString()); 
        System.out.println(mc2.toString()); 
  
    } 
}