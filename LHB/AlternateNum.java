public class AlternateNum {
    public static void main(String[] args) {
        int N = 100;
        for(int i=1;i<=N;i++){
            boolean alt = i%2==0;
            if(!alt){
                System.out.print(i+"\t");
                
            }
        } 
    }
    
}
