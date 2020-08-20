/* Create a class 'Student' with three data members which are name, age and address. 
The constructor of the class assigns default values name as "unknown", age as '0' and
 address as "not available". It has two members with the same name 'setInfo'. 
 First method has two parameters for name and age and assigns the same 
 whereas the second method takes has three parameters which are assigned to name, age and address respectively. 
 Print the name, age and address of 10 students.
Hint - Use array of objects */

package src.Task_Methods;


public class Method_4 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setInfo(names, Age);
        obj.setInfo(names, Age, Address);
    }
}
class Student{
    String names[] = { "Rajesh", "Suresh", "Ramesh", "Kamlesh", "Vignesh" };
    int Age[] = { 15, 18, 23, 27, 23 };
    String Address[] = { "bangalore","Hyderabad","bangalore","Vizag","Chennai"};
    Student(){
        String names = "un known";
        String Address = "not available";
        System.out.println("name: "+names+"\n age: "+Age+"\nadress: "+Address);
    }
    public static void setInfo(String names, int Age){
        for(int i = 0; i < 5; i++)
        {
            System.out.println( names[i] +  " Age " +  Age[i] );
        }  
} 
    public static void setInfo(String names, int Age ,String Address){  
        for(int i = 0; i < 5; i++)
        {
            System.out.println( names[i] + " Address " + Address[i] + " Age " +  Age[i] );
        } 
    }   
}