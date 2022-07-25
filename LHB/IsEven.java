
class IsEven {
    static int  isEven(int n){
        boolean zero = n==0;
        if(zero){
            return 0;
        }
        else{

        
        boolean even = n%2==0;
        if(even){
            return 2;
        }
        else{
            return 1;
        }
    }
    }
    static int isOdd(int n){
        boolean odd = n%2!=0;
        if(odd){
            return 2;
        }
        else{
            return 1;
        }
    }
    

    
    public static void main(String[] args) {
    int n = 4;
        System.out.println(isEven(0));
        System.out.println(isOdd(n)); 
    }
    
}
