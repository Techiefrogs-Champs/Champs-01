package encap;


class Testing {
String name;
private String gender;
protected int age;

public String getName(){
    return name;
}
public void setName(String newName){
    name = newName;
}
public String getGender(){
    return gender;
}
protected void setGender(String gender){
    this.gender = gender;
}
public int getAge(){
    return age;
}
public void setAge(int age){
    this.age = age;
}
}