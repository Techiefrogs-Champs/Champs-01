package METHODS;

class sum{ 
int i=5;
public void printnum(){ 

System.out.println(i);

}

}

class diff extends sum{ 
 int j=3;

  public void printnum(){ 

System.out.println(j);

  }

}

public class Numbers {
  
 public static void main(String[] args) {
diff obj=new diff();       
sum obj1=new sum();
obj.printnum();
obj1.printnum();

 }   


}