import java.util.Scanner;

// 10,10,10,20,30
class Merchant {
    int sockMerchant(int n, int[] ar) {
        int[] arr = new int[100];

        for (int i = 0; i < n; i++) {
            if (arr[ar[i]] == 0) {
                for (int j = 0; j < n; j++) {
                    if (ar[i] == ar[j]) {
                        arr[ar[i]] += 1;

                    }
                }

            }
        }
        int add = 0;
        for (int i = 1; i < arr.length; i++) {

            add += arr[i] / 2;
        }
        return add;
    }
}

class Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        int[] arr = new int[n];
        while (i < n) {
            arr[i] = scan.nextInt();
            i++;
        }
        if (checkConstraints(n, arr, i)) {

            Merchant mer = new Merchant();
            System.out.println(mer.sockMerchant(n, arr));

        } else {
            System.out.println("Not match Constraints.");
        }

    }

    static boolean checkConstraints(int n, int[] arr, int i) {
        while (i < n) {
            if (arr[i] <= 1 && (arr[i] >= 100) && !(1 <= n && n <= 100)) {
                return false;
            }
        }
        return true;

    }

}
