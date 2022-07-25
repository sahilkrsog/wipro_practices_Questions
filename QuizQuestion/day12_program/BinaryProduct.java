import java.util.Scanner;
class Question{

    String b1;
    String b2;
    Question(String b1,String b2){
        this.b1=b1;
        this.b2 = b2;
    }
    
    long getMultiply(){
        return Long.parseLong(b1)* Long.parseLong(b2);

    }
    long convertToLong(){
        return Long.parseLong(b1);


    }

}

class BinaryProduct{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String b1 = scan.nextLine();
        String b2 = scan.nextLine();

        Question ques = new Question(b1,b2);
        System.out.println(ques.getMultiply());


        

    }

}
