import java.io.*;

import javax.swing.plaf.FontUIResource;

class SerializeDemo {
    public static void main(String[] args) {
        try{
            Employee emp2 = new Employee(2, "Rohit");
            FileOutputStream fOut = new FileOutputStream("/media/sahil/Local Disk/wiproCoding/day11_programs/checkLongest.txt");
            ObjectOutputStream out = new ObjectOutputStream(fOut);
            out.writeObject(emp2);
          out.flush();
          System.out.println("Successfully executed");

        }catch(Exception e){System.out.println(e);}
    }
}
