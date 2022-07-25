
class Solution{
    int findSumOfPrime(int[] input1,int input2){
        int j=0;
        int count=0;
        int add = 0;
        int last =0;
        int i =0;
        while(i<input2){
            j=1;
            count =0;
            while(j<=input1[i]){
                
                    if(input1[i]%j==0){
                        
                        count++;
                         }
                         
                j++;
                
            }
            if(count==2){
                
                add+=input1[i];
                last=input1[i];
            }
            
            i++;
            
            
            
        }
        return add-last;
        }
} 


class IsPrime{
    public static void main(String[] args) {
        
    
    Solution fd = new Solution();
    int[] arr = {10,41,18,50,43,31,29,25,59,96,67};
    int input2 = 11;

    System.out.println(fd.findSumOfPrime(arr,input2));
}
}