public class AlternateNumMul2 {
    public static void main(String[] args) {
        int N = 100;
        int i =1;
        while(i<=N){
            boolean alt = i%2==0;
            if(alt){
                System.out.println(i+"\t");
            }
            i++;
        }
    }
    
}
