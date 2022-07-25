class Type {
    void Even (){
        System.out.println("Even");
    }
    void Odd(){
        System.out.println("Odd");

    }
}

class EvenOdd {
    public static void main(String[] args) {
        
    
    Type typ = new Type();
    int N = 11;
    boolean Even = N%2==0;
    
    if(Even){
        typ.Even();

    } 
    else{
        typ.Odd();
    }
}
}