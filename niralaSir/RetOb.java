import java.lang.*;
class Test{
    int a ;
    Test(int a){
        this.a =a;
        
    }
    Test incr(){
        Test temp = new Test(a+10);
        return temp;
    }
}
class RetOb {
    public static void main(String[] args) {
        Test obj1 = new Test(2);
        Test obj2;
        obj2 = obj1.incr();
        System.out.println("obj1.a:" +obj1.a);
        System.out.println("obj2.a:" + obj2.a);
        obj2 = obj2.incr();
        
    
        System.out.println("Obj2 After second increment:"+ obj2.a);
        
        
    }

    
}
