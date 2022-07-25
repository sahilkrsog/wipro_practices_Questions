abstract class Bank {
    abstract void getBalance();
    }
class BankA extends Bank{
    void getBalance(){
        System.out.println("$100");
     }
}
class BankB extends Bank{
    void getBalance(){
        System.out.println("$150");
    }
}
class BankC extends Bank{
    void getBalance(){
        System.out.println("$200");
    }
}
class TestBank{
    public static void main(String[] args) {
        Bank obj1 = new BankA();
        Bank obj2 = new BankB();
        Bank obj3 = new BankC();
        obj1.getBalance();
        obj2.getBalance();
        obj3.getBalance();

    }
}
