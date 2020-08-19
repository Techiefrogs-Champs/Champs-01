public class Pattern2_2{  
    public static void main(String []args){  
   int matrix[][]=new int[10][10];  
   int i,j,k,l;  
   int direction=1;  
   for(i=0;i<10;i++){    
       for(j=0;j<10;j++){   
          matrix[i][j]=0;   
       }  
   }  
       System.out.print("Matrix before snake=\n");  
   for(i=0;i<10;i++){   
       for(j=0;j<10;j++){  
         System.out.print(matrix[i][j]+"\t");   
       }  
       System.out.println("");  
   }  
   for(i=1,j=0,k=0;i<=100;i++){
       matrix[j][k]=i;  
         
       switch(direction){  
           case 1:if(k+1<10){  
                       if(matrix[j][k+1]==0){  
                           k++;      
                           continue;  
                       }  
                       else{  
                             
                           j++;    
 
                           direction=2;  
                           continue;  
                       }  
                   }  
                    
                  else{  
                       j++;     
                       direction=2;  
                       continue;  
                   }              
           case 2:if(j+1<10){  
                         
                       if(matrix[j+1][k]==0){  
                           j++;    
                           continue;  
                       }  
                       else{  
                           direction=3;  
                           k--;     
                           continue;  
                       }  
                   }  
                   else{  
                           direction=3;  
                           k--;  
                           continue;  
                       }  
           case 3:if(k-1>=0){  
                       if(matrix[j][k-1]==0){  
                             
                           k--;   
                           continue;  
                       }  
                       else{  
                           direction=4;  
                           j--;   
                           continue;  
                       }  
                   }  
                   else{  
                           direction=4;  
                           j--;    
                           continue;  
                       }                     
          case 4:if(j-1>=0){  
                       if(matrix[j-1][k]==0){  
                             
                           j--;    
                           continue;  
                       }  
                       else{  
                           k++;    
                           direction=1;  
                           continue;  
                       }  
                   }  
                   else{  
                           k++;    
                           direction=1;  
                           continue;  
                       }                 
       }  
   }    
       System.out.println("Matrix after snake=\n");  
    for(i=0;i<10;i++){   
       for(j=0;j<10;j++){       
         System.out.print(matrix[i][j]+"\t");   
       }  
       System.out.println("");  
   }  
    }  
}  