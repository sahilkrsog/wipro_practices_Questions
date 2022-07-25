public class Array {
    
    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,4};
        int i =1;
        int length =0;
        int output1 =0;
        int output2 =0;

        
        while(i<arr.length){
            int j =i;
            int count =0;
            length =0;
            while(arr[j-1]>arr[j]&&i<arr.length){
                length++;
                j++;
                count =1;
            }
            i=j+1;
            output1 +=count;
        if(output1<length){
            output2 = length ;
             }
        i++;
        
    }
    System.out.println(output1+" "+output2);

    }
}
