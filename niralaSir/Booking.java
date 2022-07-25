import java.util.Scanner;

class Details{
    String fName;
    String lName;
    int age;
    String email;
    String mobileNo;
    void setName(String fname,String lname){
        fName =fname;
        lName = lname;
    }
    void setOther(String em,int ag,String mNo){
        email = em;
        age = ag;
        mobileNo = mNo;
    }
    void printDetails(){
        System.out.println(
            "First Name:" + fName + "\n"+
            "Last Name:" + lName + "\n"+
            "Email: " + email +"\n"+
            "Phone Number: "+ mobileNo + "\n"+
            "Age:" + age +"\n" 

        );
    }

}
class Booking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Details person1 = new Details();
        person1.setName("Sahil", "Kumar");
        person1.setOther("sk9711092314@gmail.com",25, "9711092314");
        person1.printDetails();


    }
    
}
