
public class addAlpha {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String s = "hel lo";
        
        s= s.toUpperCase();
        int[]  arr = new int[27] ;
        addAscii(arr);
        int i = 0;
        int count =0;
        while (i < s.length()-1) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != 0) {
                count ++;
                System.out.println(count);
                }
            i++;

        }
        int sub =0;
        if(count>=1){
            String[] str = s.split(" ");
            
            for (int j = 0; j < str.length; j++) {
                String str1 = str[j];
                int last = str1.length()-1;
                int add =0;
                int k=0;
                while(str1.length()>k){
                    if(k>=last){
                        sub = getAscii(arr, str1.charAt(k));
                    }
                    else{

                        sub = Math.abs(getAscii(arr,str1.charAt(k))- getAscii(arr, str1.charAt(last)));
                        System.out.println("sub of "+str1.charAt(k)+""+str1.charAt(last)+""+sub);
                    }
                    last--;
                    add = add==0?sub:Math.abs(add+sub);
                    System.out.println(add);
                    
                    k++;
                }
                }
        }
    }
    static int[]  addAscii(int [] arr){
        int i =0;
        int j=65;
        while(i<arr.length){
            arr[i]=j;
            i++;
            j++;
        }
        return arr;

    }
    static int getAscii(int[] arr,char c){
        int a = c;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]==a){
                return i;
            }
            
        }
        return 0;

    }

}
