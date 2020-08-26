public class End3 {
    
   public static void main(String[] args) {
       
    int a[]=new int[]{1,5,8,4,1,8,5,0,4};
    int b[]=new int[a.length];
    
     int v=-1;
      for(int i=0;i<a.length;i++){
       int count=1;
       for(int j=i+1;j<a.length;j++){
        if (a[i]==a[j]){

           count++;
           b[j]=v;
        }

       } 
 
     if(b[i]!=v)
      b[i]=count;

      } 

    System.out.println("elements|frequency");

    for(int i=0;i<b.length;i++){

       if(b[i]!=v) 

       System.out.println(" "+a[i]+" |  "+b[i]);
    }

    
   }








}