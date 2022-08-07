import java.io.File;
class SimpleFile{
    public static void main(String[] args) {
        File myobj = new File("newFile.txt");
        boolean check = myobj.canRead();
        long len = myobj.length();
        if( check){
            System.out.println("Readable");
            System.out.println(len);
    
        }
        else{
            System.out.println("UnReadble");
        }        
    }
}