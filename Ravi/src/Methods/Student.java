

public class Student {
    
        public String name;
        public int age;
        public String address;

        public Student()
        {
            name = "unknown";
            age = 0;
            address = "not available";
        }
        public String StudentInfo(String name, int age)
        {
            this.name = name;
            this.age = age;
            return "name: " + name + "    age: " + age;
        }
        public String StudentInfo(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
            return "name: " + name + "   age: " + age + "    address: " + address; 
        }
    

        public static void main(String args[]) {
            Student[] std = new Student[4];
            for(int i = 0; i < std.length; i++)
            {
                std[i] = new Student();  
            }
            std[0].name = "Apple";
            std[0].age = 21;
            std[0].address = "Jammu";
            std[1].name = "Kiwi";
            std[1].age = 29;
            std[1].address = "New Zeland";
            std[2].name = "Banna";
            std[2].age = 40;
            std[2].address = "India";
            String name;
            int age;
            String address;
            for (int i = 0; i < std.length; i++)
            {
                name = std[i].name;
                age = std[i].age;
                address = std[i].address;
                System.out.println(std[i].StudentInfo(name, age, address));
             }
        }
    
}