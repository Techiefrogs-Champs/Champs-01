package javaconcepts;

public class pro22 {
       public static void main(String []args){
           for(int i=1;i<=5;i++){
               for(int j=8;j>=i;j--){
                   System.out.print(' ');
               }
           for(int k=1;k<=i;k++){
               System.out.print('*');
            }
           for(int l=2;l<=i;l++){
               System.out.println('*');
           }
         System.out.println();
        }
          for(int i=1;i<=5;i++){
            for(int j=8;j>=i;j--){
                System.out.print('*');
            }
        for(int k=2;k<=i;k++){
            System.out.print('*');
         }
        for(int l=1;l<=i;l++){
            System.out.print(' ');
        }
         System.out.println();
       }
    }  
}