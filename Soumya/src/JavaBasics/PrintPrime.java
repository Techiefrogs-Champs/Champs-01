package JavaBasics;

public class PrintPrime {
    public static void main(String[] args) {
        int n=0;
        int i=0;
        String primeNumbers=" ";
        for(i=1;i<=100;i++){
            int counter=0;
            for(n=i;n>=1;n--){
                if(i%n==0){
                    counter=counter+1;
                }
            }
            if(counter==2){
                primeNumbers=primeNumbers+i+" ";
            }
        }
        System.out.println("prime numbers till 100 are :"+primeNumbers);

    }
}