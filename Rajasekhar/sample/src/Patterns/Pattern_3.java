package Patterns;

class Pattern_3 {
    public static void main(String [] args){
        char i;
        char j;
        for(i='A'; i<='E'; i++){
            for(j='A'; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
/*
A
BB
CCC
DDDD
EEEEE */