package ExceptionHandlling;
import java.io.IOException;

public class UsingThrows {
    void a() throws IOException{
        throw new IOException("device error");
    }
    void b() throws IOException{
        a();
    }
    void c(){
        try{
            b();
        }catch(Exception e){
            System.out.println("exception handled");
        }
    }
    public static void main(String[] args) {
        UsingThrows eh=new UsingThrows();
        eh.c();
        System.out.println("run remaining code");
    }

        }