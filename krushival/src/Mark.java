abstract class Mark {
    abstract int getpercentage();}
    class C extends Mark {
        int result;
        C(int a, int b, int c){
            result=(a+b+c)/3;
        }
        int getpercentage(){            abstract sample 3
            return result; }
        }
    
    class D extends Mark {
        int result;
        D(int a, int b, int c, int d){
            result=(a+b+c+d)/4;
        }
        int getpercentage(){
            return result;
        }
     
    
        public static void main(String[] args){
            Mark obj_1=new C(25, 45, 65);
            System.out.println(obj_1.getpercentage());
            Mark obj_2=new D(20,30,40,50);
            System.out.println(obj_2.getpercentage());
        }
    }
            
        
    


    
