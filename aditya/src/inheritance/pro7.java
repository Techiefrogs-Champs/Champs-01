package inheritance;

 class Y {
    int i;
    int j;
    Y(int i,int j){
        this.i=i;
        this.j=j;
        
    }
    void show(int i,int j){
        System.out.println("the value is=" +i +j);
    }
}
    class Z extends Y{
        int k;
        void show(int k){
            
            
            System.out.println("the value of k is =" +k);
        }
    }
    class pro7{
        public static void main(String []args){
            Z obj=new Z();
            obj.show(6);
        }
    }
