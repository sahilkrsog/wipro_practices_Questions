class Check{

    void even(){
        System.out.println("Even");

    }
    void odd (){
        System.out.println("Odd");
    }
}
class SumEvenOdd{
    public static void main(String[] args) {
        Check chk = new Check();
        int a = 1;
        int b = 1;
        int c = a+b;
        boolean eve = c%2 ==0;
        if(eve){
            chk.even();
        }
        else{
            chk.odd();
        }

    }
}