package ExceptionHandlling;

public class ArgsWhileThrohException {
    public static void main(String[] args) {
        try{
            throw new Exception("throwing new exception");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}