class Sample {
    int m,n;
    void display1(){
        System.out.println("m and n are:"+m+""+n);

    }
    
}
class Sample2 extends Sample{
    int  c ;
    void display2(){
        System.out.println("c:"+ c);

    }
    void sum(){
        System.out.println("m+n+c ="+(m+n+c));

    }


}
class InheritanceDemo{
    public static void main(String[] args) {
        A s1 = new A();
        B s2 = new B();
        s1.m =10;
        s1.n=20;
        System.out.println("State of object A:");
        s1.display1();
        s2.m =7; s2.n=8; s2.c= 9;
        System.out.println("State of object B:");
        s2.display1();
        s2.display2();
        System.out.println("sum of m,n and c in obj ");
        s2.sum();


    }
}
