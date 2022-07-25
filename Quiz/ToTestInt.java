interface Test{
    double square(int n);
}
class Arithmetic implements Test{

    public double square(int n){
        return Math.sqrt(n);
    }

}
class TotestInt{
    public static void main(String[] args) {
        Test sqt = new Arithmetic();
        System.out.println(sqt.square(10));    
}


}