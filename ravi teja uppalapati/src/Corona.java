public class Corona {
    public static void main(String[] arg) {
        int immunity=60;
        if(immunity<60)
        {
            System.err.println("covid positive");
        }
        if(immunity>=60){
            System.out.println("pending");
        
        }
        if(immunity>60){
            System.out.println("covid negative");
        }

        
    }
    
}