class DemonstrateStatic {
    static int a ; //static variable 
    static int b ; // static variable 

    static{ // declearing static block
        a = 20;
        b=20;
    }
    public static void main(String[] args) {
      
        System.out.println(a);
        System.out.println(b);
    }
    
}
