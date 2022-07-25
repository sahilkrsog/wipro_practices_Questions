// import java.util.*;
class Skipping2NobacWard{
    static String skipped(int n){
        if(n<=0){
            return ""+0;

        }
        else{
            return n +" "+ skipped(n-3);
     
        }
    }
    public static void main(String[] args) {
    int lNum =0;
    int fNum = 100;
    System.out.println(skipped(fNum));


}

}
