import java.util.Scanner;

class Drive{
    int num;
   
    String  positive(int num ){
        return"number is positive "+(num);

    }
    String  negative(int num){
        return"Number is negative"+(num);
    }
    String  zero(int num){
        return "number is Zero "+num;
    }
    
}
class TypeNumber{
    public static void main(String[] args) {
        Drive typ = new Drive();
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        
        boolean pos = no>0;
        boolean neg = no<0;
        boolean zero = no==0;
        if(zero){
            System.out.println(typ.zero(no));


        }
        else if(neg){
            System.out.println(typ.negative(no));
        }
        else{
            System.out.println(typ.positive(no));
        }
        
    }
}