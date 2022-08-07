import java.io.File;
import java.io.IOException;
class CreateFile{
    public static void main(String[] args) {
        try{

            File newFile = new File("HelloFile.txt");
            File newFile2 = new File("CreateWrite.java");
            
            // File newFile2 = new File("HelloFile");
            if(newFile2.createNewFile()){
                System.out.println("File is created"+ newFile.getName());
            
        }


        }catch(IOException e){System.out.println(" An error occurred");
            e.printStackTrace();
    }
        
    }
}