public class Redfern {
    private int unit;
    public int getunit(){
        return unit;}
        public void setunit(int unit){
            this.unit = unit;}
            public void display(){                        Encapsulation sample 2
               System.out.println("unitno:"+unit);
            }
            public static void main(String args[]){
                Redfern obj = new Redfern();
                obj.setunit(18);
                System.out.println("Redfern unit:"+obj.getunit());
            }
        }





    
