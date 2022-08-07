import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class DeleteFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        System.out.println("How much file do you want to delete ?");
        try {

            int i = scan.nextInt();
            int j = 0;
            while (i > 0) {
                System.out.println("Give the absolute path of file :" + (++j));
                String str = scan.next();
                list.add(str);
                i--;
            }

            i = 0;
            j = 0;
            while (i < list.size()) {
                File file = new File(list.get(i));
                if (file.exists()) {
                    String str = file.delete()
                            ? ++j + ". File Name:" + list.get(i) + "\t" + ": Successfully deleted."
                            : "System error";

                    System.out.println(str);

                } else {
                    System.out.println("File not found : " + list.get(i));
                }
                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
