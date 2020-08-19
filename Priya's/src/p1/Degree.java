package p1;

class Degree{
    public void getDegree(){
      System.out.println("I GOT A DEGREE");
    }
  }
  
  class Undergraduate extends Degree{
    public void getDegree(){
      System.out.println("I AM AN UNDERGRAGUATE");
    }
  }
  
  class Postgraduate extends Degree{
    public void getDegree(){
      System.out.println("I AM A POSTGRAGUATE");
    }
  }
  
  class Answers{
    public static void main(String[] args){
      Undergraduate a = new Undergraduate();
      Postgraduate b = new Postgraduate();
      a.getDegree();
      b.getDegree();
    }
  }
  