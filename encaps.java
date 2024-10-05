public class encaps {
    private string name;
    private int Age;
}
//getter method for name
public string getName(){
    retur name;
}
//setter method for name
public void setName(string name){
    if(name!=null && name.isEmpty()){
        this.name = name;
    }else{
        System.out.println ("Invalid name:"+ name);
    }
}
public int getAge(){
    return Age;
}
public void setAge(int age){
    if(Age >0){
        this.Age=age;
        else{
            System.out.println("Invalid age:"+age);
        }
    }
}
public class Encapsulation{
    public static void main(String[] args){
        person person=new person();
        person.setName (name:"tarun");
        person.setAge(age:20);
        System.out.println("Name:" + person.getName());
        System.out.println("Age:" + person.getAge());
        person.setAge(-5);
        
        
    }
}
