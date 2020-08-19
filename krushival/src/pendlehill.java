public class pendlehill {
    private int street;
    public int getstreet(){
        return street;}
        public void setstreet(int street){
            this.street = street;}                      Encapsulation     sample 1
            public void display(){
                System.out.println("Streetno:"+street);
            }

    public static void main(String args[]){
        pendlehill obj = new pendlehill();
        obj.setstreet(12);
        System.out.println("pendlehill street:"+obj.getstreet());
    }
}











    
