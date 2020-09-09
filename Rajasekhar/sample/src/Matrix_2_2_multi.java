public class Matrix_2_2_multi {
    public static void main(String[] args){
    int i,j,k,sum;
    int a[][]={{2,2,3}, {3,3,4},{3,5,4}};
    int b[][]={{1,0,2}, {0,1,4},{1,3,4}};
    int [][] c=new int[3][3];
   
    System.out.println("muliplication of two arrays is");
    /*
    c[0][0]=a[0][0]*b[0][0]+a[0][1]*b[1][0];
    c[0][1]=a[0][0]*b[0][1]+a[0][1]*b[1][1];
    c[1][0]=a[1][0]*b[0][0]+a[1][1]*b[1][0];
    c[1][1]=a[1][0]*b[0][1]+a[1][1]*b[1][1];
    
    System.out.print(c[0][0] +" "+c[0][1]+"\n"+   c[1][0]+" "+c[1][1]); */
    
   
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            sum=0;
            for(k=0;k<3;k++)
                sum=sum+a[i][k]*b[k][j];
                c[i][j]=sum;
            
        }
    }
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            System.out.print(c[i][j]+" ");
        }
        System.out.println();
    } 
   
    } 
}