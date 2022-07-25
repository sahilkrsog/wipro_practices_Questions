class A {
    String name = "Rohit";
    
}
class B extends A{
    int roll = 21;

}

class Inherit{
    public static void main(String[] args) {
        B entry = new B();
        System.out.println(entry.name);
        System.out.println(entry.roll);
    }
}
