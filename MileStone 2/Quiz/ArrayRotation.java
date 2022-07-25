import java.util.Scanner;
class Solution{

}


class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        Solution rotateArr = new Solution();
        int size = scan.nextInt();
        int d =scan.nextInt();;
        int i =0;
        int[] arr = new int[size];
        while(i<size){
            arr[i]=scan.nextInt();
        }
        for(int j : arr){
            System.out.print(arr[j]);

        }
        
    }
}
