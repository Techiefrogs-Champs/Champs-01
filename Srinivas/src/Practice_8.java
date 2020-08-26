class Average {
    int a,b,c;
    double avg;
    double average(int x,int y,int z){
        a=x;
        b=y;
        c=z;
        avg=(a+b+c)/3;
        return avg;
    }
}
public class Practice_8{
        
    public static void main(String args[]){
        Average s=new Average();
        s.average(10,15,20);
        System.out.println("average is  " +s.avg);
    }
}