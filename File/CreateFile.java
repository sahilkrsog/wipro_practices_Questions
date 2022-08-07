import java.io.File;
import java.io.IOException;
    
class CreateFile {
    public static void main(String[] args) {
        try {
            File newFile = new File("HelloFile.txt");
            boolean create = newFile.createNewFile();
            String str = (create ? "File is created" + newFile.getName() : "Already present");
            System.out.println(str);
        } catch (IOException e) {
            System.out.println(" An error occurred");
            e.printStackTrace();
        }
    }
}


           

