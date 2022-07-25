import java.util.Scanner;

class AvidHiker {
    int countingValleys(int n, String str) {
        int i = 0;
        int countValley = 0;
        
        int countMount = 0;
        while (i < n) {
            if (str.charAt(i)== 'U') {
                countValley--;
                countMount++;
            } else {
                countValley++;
                countMount--;
            }
            i++;
        }
        if (countValley < 0) {

            return 0;
        }
       
        return countValley;
    }

}

class Hiker {
    public static void main(String[] args) {
        AvidHiker gray = new AvidHiker();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        String str = scan.next();
        if(str.contains("U") || str.contains("D")){

            System.out.println(gray.countingValleys(n, str.toUpperCase()));
        }
        else{
            System.out.println("Unacceptable character");
        }

    }

}
