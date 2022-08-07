import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class ReadFile{
    public static void main(String[] args) {
        try{

            File newFile = new File("CreateFile.java");
            Scanner scan = new Scanner(newFile);
            while(scan.hasNextLine()){
                String data = scan.nextLine();
                System.out.println(data);
            }
            scan.close();

        }catch(FileNotFoundException e){System.out.println(e);};

        
    }
}