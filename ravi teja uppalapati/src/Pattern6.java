public class Pattern6 {
      public static void main(String[] args) {
          int i,j;
       
          for(i=1;i<=6;i++){
              for(j=1;j<=9;j++)
              {
                  if((i%9==0)&&(j%6==0)){
                    if(i+j==0){
                          System.out.print("*");
                      }
                       else{
                           System.out.println(" ");
                       }              
                    }
                          System.out.println();
                }
          }
          
          
      }  
    }
    
