import java.io.Serializable;

class Employee implements Serializable{
    int id;
    String name ;
    Employee(int id ,String name){
        this.id =id ;
        this.name = name;
    }
    void display(){
        System.out.println(id+","+name);
    }
}
public class Serializable1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Sahil");
        emp1.display();
        
    }
    
}
