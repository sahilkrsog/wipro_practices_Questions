import java.util.Scanner;
import java.util.Scanner;
import java.io.File;


import java.io.FileNotFoundException;
public class LongestWord {
    public static void main(String[] args) throws FileNotFoundException{
        String longestWord = "";
        String currentWord ;
        Scanner scan = new Scanner(new File("/media/sahil/Local Disk/wiproCoding/day11_programs/checkLongest.txt"));
        while(scan.hasNext()){
            currentWord =scan.next();
            if(currentWord.length()>longestWord.length()){
                longestWord =currentWord;
                System.out.println("Current element :"+ currentWord );

            }
            
        }
        System.out.println("Longest Word :"+longestWord);


        
        
    }

    
}
