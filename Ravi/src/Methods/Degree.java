

class Degree1 {

    public void getDegree(){
        System.out.println("I got a degree");
    }
}
    class Undergraduate extends Degree1{

        public void getDegree(){
            System.out.println("I am an Undergraduate");
    
        }
    
    }
    
    class Postgraduate extends Degree1{
    
        public void getDegree(){
            System.out.println("I am a Postgraduate");
    
        }
    
    }


public class Degree{  
    public static void main(String args[]) {
        Undergraduate obj1=new Undergraduate();
        Postgraduate obj2=new Postgraduate();
        obj1.getDegree();
        obj2.getDegree();
        Degree1 obj3=new Degree1();
        obj3.getDegree();
       
        


    }
    
}

