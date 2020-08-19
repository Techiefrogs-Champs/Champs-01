class School{
void activities(){System.out.println("activities");}
}
 class Student extends School{
void read(){System.out.println("read");}
    }
 class Teacher extends Student {
    void teach(){System.out.println("teach");}

public static void main(String[] args) {
    Teacher obj=new Teacher();
    obj.activities();
    obj.read();
    obj.teach();
}

    
}