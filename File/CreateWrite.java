import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
class CreateWrite{
    public static void main(String[] args) {
        try{
            File myFile = new File("fileWriterFile.txt");
            boolean exists = myFile.exists();
            String strE = (
                exists ? 
                "File exists":
                "No such file or Directory"
            );
            System.out.println(strE);

            boolean create = myFile.createNewFile();
            String str = (
                create ? 
                "File is created":
                "File Already present"
                );
            
            System.out.println(str);  
            String str3 = "fileWriterFile.txt";
            FileWriter fileWrite = new FileWriter(str3);
            
            fileWrite.write("added String on file with java Program");
            long len = myFile.length();
            System.out.println(len);
            fileWrite.close();
            System.out.println("SuccessFully added string to "+myFile.getName());


        }catch(IOException e){System.out.println(e);}
    }
}


             