class Drived {
    //sum two  number 
    int sum(int a , int b){
        return a+b;

    }
    int sum(int a, int b,int c){
        return a+b+c;
    }
}
class Overloading{
    public static void main(String[] args) {
        Drived su = new Drived();
        System.out.println(su.sum(10, 20));
        System.out.println(su.sum(10, 20, 30));

    }
}

