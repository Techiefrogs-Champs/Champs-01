package patterns;

public class pattern5 {
    public static void main(String[] args) {
        int lines1=8;  
        int i2,j2;  
        for(i2=1; i2<lines1; i2++){
        for(j2=1; j2<=lines1/2; j2++){ 
            if(i2==j2){  
                System.out.print(j2);  
            }  
            else if(i2>4 && j2==lines1-i2){  
                System.out.print(j2);  
            }  
            else{  
               System.out.print(" ");  
            }  
        } 

        j2=j2-2;  
        while(j2>0){
            if(i2==j2){  
            System.out.print(j2);  
            }  
            else if(i2>4 && j2==lines1-i2){  
                System.out.print(j2);  
            }  
            else{  
                System.out.print(" ");  
            }  
  
            j2--;  
        }  
        System.out.println("");  
    }  

}
}
