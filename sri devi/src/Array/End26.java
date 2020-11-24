package Array;

public class End26 {
    public static void main(String[] args) {
        int b[]={4,7,5,6,19};
        int min=b[0];
for(int i=1;i<b.length;i++){

    if(min>b[i]){
       b[i]=min;

    }
}

System.out.println("minimum value is="+min);
    }
}