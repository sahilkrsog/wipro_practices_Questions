import java.util.Scanner;



class CheckMul{
    public static void main(String[] args) {
        int a = 10;
        int b =3 ;
        Scanner scan = new Scanner(System.in);

        int input1 = scan.nextInt();
        int input2 = scan.nextInt();


        if(input1==0 ||input2==0){
            System.out.println(3);

        }
        else if (input1%input2==0){
            System.out.println(2);
        }
        else{
            System.out.println(1);
        }
    }
}
