import java.io.FileOutputStream;  
public class FileWrite {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("/home/sahil/Documents/file.txt");    
             fout.write(70);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  