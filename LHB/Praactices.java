public class Praactices {

    public static void main(String[] args) {
        String str = "12345";
        String str2 = "1234";
        String str1 =str;

        int i =str1.length()-1;
        
        int add =0;
        int j=str2.length()-1;
        int total =0;
        String str3 = "";
        int once =0;
        
        int tens =0;
        String strOnes = "";

        while(i>=0){
            add=0;
            while(0<=j){

                add = Integer.parseInt(str2.substring(j,j+1)) ;
                j--;

            }
            total =  add +  Integer.parseInt(str1.substring(i,i+1)) + tens;
            if(total>=10){
               once = getRem(total);
               tens = getTens(total);
               strOnes = Integer.toString(once);



            }
            str3= strOnes + str3;
 
            System.out.println(i+1);
            

            i--;
        }
        System.out.println(add);
        System.out.println(str3+"str3");
    }
    static int getRem(int rem ){
        return rem%10;
    }
    static int getTens(int i){
        return i/10;
    }
    
}
