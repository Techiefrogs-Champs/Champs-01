package MethodsExc;

class Student {
    String name;
    int age;
    String address;
public Student(){
    name="unknown";
    age=0;
    address="not availiable";
}
public void setInfo(String n,int a){
    this.name=n;
    this.age=a;
    System.out.println("Name of student :"+n);
    System.out.println("Age of Student :"+a);
}
}