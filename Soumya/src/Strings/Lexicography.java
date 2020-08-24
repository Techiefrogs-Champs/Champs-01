package Strings;

public class Lexicography {
    public static void main(String[] args) {
        String[] elements = {"Dog","Apple","Gun","Zebra"};
        for(int i=0;i<3;++i){
            for(int j=i+1;j<4;++j){
                if(elements[i].compareTo(elements[j])>0){
                    String temp=elements[i];
                    elements[i]=elements[j];
                    elements[j]=temp;
                }
            }
        }
        System.out.println("In lexicographycal order :");
        for(int i=0;i<4;i++){
            System.out.println(elements[i]);
        }
    }
}