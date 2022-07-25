import java.io.File;
class Program1{
    public static void main(String[] args) {
        File file = new File("/media/sahil/Local Disk/wiproCoding/LHB");
        String[] fileList = file.list();
        
        for(String name : fileList){
            System.out.print(name+" ,");


        }
    }
}