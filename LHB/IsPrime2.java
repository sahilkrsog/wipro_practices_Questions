public class IsPrime2 {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        int j = 1;
        int input = 10; // find the 10th term in prime number.
        int checkCount = 1;
        int lastTerm = 0;
        while (checkCount <= input) {
            i =1;
            count =0;
            while (i <= j) {
                if (j % i == 0) {
                    count++;
                }
                i++;
            }
            if (count == 2) {
                // System.out.println(j);
                lastTerm = j;
                checkCount ++;
            }
            j++;

        }
        System.out.println(lastTerm);
    }
}
