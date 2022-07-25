/*Create a class named ‘Animal’ which includes methods like eat() and sleep(). 
Create a child class of Animal named ‘Bird’ and override the parent class methods. 
Add a new method named fly().
 Create an instance of Animal class and invoke the eat and sleep methods using this object.
Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.
*/
import java.lang.*;;
class Animal{
    void eat(){ 
        System.out.println("Eating");
    }
    void sleep(){
        System.out.println("Sleeping");
    }
}
class Bird extends Animal{
    void eat(){
        System.out.println("Bird is eating");
    }
    void sleep(){
        System.out.println("Bird is sleeping");
    }
    void fly(){
        System.out.println("flying");

        

    }
}
class Main{
    public static void main(String[] args) {
        
        Animal dog = new Animal();
        dog.eat();
        dog.sleep();
        Animal crow = new Animal();
        crow.eat();
        crow.sleep();


    }
}
