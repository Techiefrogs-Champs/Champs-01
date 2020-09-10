class Degree{
public void getDegree(){
    System.out.println("I got a degree");
  }
}

class Undergraduate extends Degree{
  public void getDegree(){
    System.out.println("I am an Undergraduate ");
  }
}

class Postgraduate extends Degree{
  public void getDegree(){
    System.out.println("I am a Postgraduate");
  }
}

class Program_5{
  public static void main(String[] args){
      Degree d= new Degree();
    Undergraduate a = new Undergraduate();
    Postgraduate b = new Postgraduate();
    d.getDegree();
    a.getDegree();
    b.getDegree();
  }
}