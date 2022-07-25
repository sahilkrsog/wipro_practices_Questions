public class NambiarNumberGen{
    public static String NambiarNumber( String Num,int i){
        //base condition 
        if(i>=Num.length()){
            return "";
        }
        // to get the first Number from string 
        int firstDigit = Num.charAt(i) - '0';
        
        // check digit parity (odd or even).

        int digitParity = firstDigit % 2;
        int sumNum = 0;
        while(i<Num.length()){
            sumNum += (Num.charAt(i) - '0');
            System.out.println(sumNum);
            int sumParity = sumNum % 2 ;
            
            if(sumParity!=digitParity){
                System.out.println(firstDigit);
                break;
            }
            i++;
        }
        return "" + sumNum + NambiarNumber(Num,i+1);

        
    }

    public static void main(String[] args) {
        String Num = "1";
        System.out.print(NambiarNumber(Num,0));
        

    }
}