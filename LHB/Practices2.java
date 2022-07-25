public class Practices2 {
    public static void main(String[] args) {
        String str ="12233";
        int i = str.length()-1;
        int add =0;
        while(i>=0){
            add+= Integer.parseInt(str.substring(i,i+1));
            i--;

        }
        System.out.println(add);
    }
    
}

