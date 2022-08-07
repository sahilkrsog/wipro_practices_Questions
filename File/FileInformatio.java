import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class FileInformatio {
    public static void main(String[] args) {

        File myFile = new File("/media/sahil/Local Disk/torch.txt");
        if (myFile.exists()) {
            System.out.println("File name: " + myFile.getName());
            System.out.println("Absolute path: " + myFile.getAbsolutePath());
            System.out.println("Readable: " + myFile.canRead());
            System.out.println("Writeable: " + myFile.canWrite());
            System.out.println("File size in bytes: " + myFile.length());
        } else {

            System.out.println("File Not Found");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to Read File y/n");
        // String c = scan.nextLine();
        if (scan.nextLine().equals("y")) {

            try {
                Scanner scan1 = new Scanner(myFile);
                while (scan1.hasNextLine()) {
                    String data = scan1.nextLine();
                    System.out.println(data);
                }
                scan1.close();
                scan.close();
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }

        }
    }
}
