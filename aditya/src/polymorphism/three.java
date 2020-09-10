package polymorphism;//operator overloading with opetators

public class three {
        void  add(int a,long b){

        System.out.println(a+b);
       }
       void concate(String S , char  D){
           System.out.println(S + D);
       
        }
       static String concate(String G,char v,String H) {
            return G+v+H;
       }
        public static void main(String []args){
           three obj=new three();
           obj.add(5,8);
           obj.concate("aditya" , 'B');
           System.out.println(three.concate("adi",'C',"bottu"));
       }
    
    }