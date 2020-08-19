package practices;

 class Degree {
    void getdegree(){
        System.out.println("I got a degree");
    }
}
    class undergraduate extends Degree{
        void getdegree(){
            System.out.println("Iam a undergraduate");
        }
    }   
    class postgraduate extends Degree{
        void getdegree(){
            System.out.println("Iam a postgraduate");
        }
    }
    public class four{
        public static void main(String []args){
            Degree obj=new Degree();
            undergraduate obj1=new undergraduate();
            postgraduate obj2=new postgraduate();
            obj.getdegree();
            obj1.getdegree();
            obj2.getdegree();
        }

    }