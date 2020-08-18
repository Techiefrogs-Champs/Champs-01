package src.LoopExec;

public class console {
    public static void main(String[] args) {  

        int i1,j1,lines1=5;  
        for(i1=1; i1<=lines1;i1++){  
            for(j1=lines1;j1>=1;j1--){ 
                if(j1!=i1)  
                System.out.print(j1);  
                else  
                System.out.print("*");  
            }  
        System.out.println("");  
        } 


        
        int lines=4;  
        int i,j;  
        int s=0;  
        for(i=0;i<lines;i++){
            for(j=1;j<=s;j++){
                System.out.print(" ");  
            }  
            for(j=1;j<=lines;j++){
                if(j<=(lines-i))  
                System.out.print(j);  
                else  
                System.out.print("*");  
            }  
            j--;  
            while(j>0){
                if(j>lines-i)  
                System.out.print("*");  
                else  
                System.out.print(j);  
                j--;  
            }  
            if((lines-i)>9) 
            s=s+1;  
        System.out.println("");  
        }  


    //     int lines=4;    
    //     int i,j;    
    //     for(i=1;i<=lines;i++){  
    //       for(j=1;j<=lines;j++){ 
    //           if(i==j)    
    //              System.out.print("*");    
    //             else    
    //            System.out.print("0");    
    //       }    
    //       j--;    
    //        System.out.print("*");    
    //       while(j>=1){    
    //           if(i==j)    
    //            System.out.print("*");    
    //           else    
    //            System.out.print("0");    
    //           j--;    
    //       }    
    //     System.out.println("");    
    //   }    
        
    //     int lines1=8;  
    //     int i2,j2;  
    //     for(i2=1; i2<lines1; i2++){
    //     for(j2=1; j2<=lines1/2; j2++){ 
    //         if(i2==j2){  
    //             System.out.print(j2);  
    //         }  
    //         else if(i2>4 && j2==lines1-i2){  
    //             System.out.print(j2);  
    //         }  
    //         else{  
    //            System.out.print(" ");  
    //         }  
    //     } 

    //     j2=j2-2;  
    //     while(j2>0){
    //         if(i2==j2){  
    //         System.out.print(j2);  
    //         }  
    //         else if(i2>4 && j2==lines1-i2){  
    //             System.out.print(j2);  
    //         }  
    //         else{  
    //             System.out.print(" ");  
    //         }  
  
    //         j2--;  
    //     }  
    //     System.out.println("");  
    // }  

        // int lines=4;  
        // int i,j,k,l;  
        // int space=0;  
        // for(i=0;i<lines;i++){ 
        //     for(j=1;j<=space;j++){
        //         System.out.print(" ");  
        //     }  
        //     for(j=1;j<=lines;j++){
        //         if(j<=(lines-i))  
        //         System.out.print(j);  
        //         else  
        //         System.out.print("*");  
        //     }  
        //     j--;  
        //     while(j>0){  
        //         if(j>lines-i)  
        //         System.out.print("*");  
        //         else  
        //         System.out.print(j);  
        //         j--;  
        //     }  
        //     if((lines-i)>9) 
        //     space=space+1;  
        // System.out.println("");  
        // } 


    //     int lines=10;  
    //     int i,j;  
    //     int count;  
    //     for(i=1;i<=lines;i++){ 
    //     count=0;  
    //     for(j=1;j<lines;j++){
    //          if(count<i-1){  
    //              if(!(j<lines-i+1)){  
    //                  System.out.print(j);  
    //                  count++;  
    //              }  
    //          }  
    //      }  
    //      System.out.print("0");  
    //      count=0;  
    //     for(--j;j>=1;j--){ 
    //          if(count<i-1){  
    //          System.out.print(j);  
    //          count++;  
    //          }  
    //      }  
    //      System.out.println("");  
    // }  

    //     for (int i1 = 1; i1 <= 10; i1++)  
    //     {  
    //     for (int j1 = 1; j1 <= 10; j1++)  
    //     {  
    //         if (i1==1 || i1==10 || j1==1 || j1==10 )  
    //             System.out.print(" 1");  
    //         else  
    //             System.out.print("  ");  
    //     }  
    //     System.out.println();  
    // }  

        int n = 6;
        for (int x = 0; x < n; x++) {
            int number = 1;
            System.out.printf("%" + (n - x) * 2 + "s", "");
            for (int y = 0; y <= x; y++) {
                System.out.printf("%4d", number);
                number = number * (x - y) / (y + 1);
            }
            System.out.println();
        }       
}
}