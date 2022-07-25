import java.sql.Wrapper;

class WrapperClass {
    Integer i ;
    Character c ;
    Boolean b;
    
    WrapperClass(int val){
        i=val;
        System.out.println(i);


    }
    WrapperClass(char val){
        c = val;
        System.out.println(c);

    }
    WrapperClass(boolean val){
        b=val;
        System.out.println(b);
    }




    void getWra(int a){
        Integer i = a;
        System.out.println(i);
    }

    public static void main(String[] args) {
        //autoboxing 
       WrapperClass wrap = new WrapperClass('a');
       

    }
    
}
