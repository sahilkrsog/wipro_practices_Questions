import java.io.File;
import java.io.IOException;
import java.util.*;
class FileCreate{
    public static void main(String[] args) {
        try{
            File file = new File("new1File.txt");
            if(file.exists()){
                System.out.println("file is presents");


            }
            else{
                System.out.println("File is Not present");


            }
            System.out.println(file.length());
            

        }catch(Exception e){System.out.println(e); }
    }    
}