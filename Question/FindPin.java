class Solution{
   int  generatedPin(int input1,int input2,int input3,int input4){
    if(range(input1)&& range(input2)&& range(input3)){
        return (getSmallestNo(input1)+getGreatestNo(input2)+getSmallestNo(input3))-input4;
    }
    return 0;

   }
   int getGreatestNo(int i){
    int rem = 0;
    int g =0;
    while(i!=0){
        rem = i%10;
        if(g<=rem){
            g=rem;

        }
        i=i/10;
    }
    return g;
}
   int getSmallestNo(int i){
    int rem=0;
    int small=i%10;
    while(i!=0){
        rem= i%10;
        if(small>=rem){
            small=rem;
        }
        i=i/10;
     }
    return small;
   }
   boolean range (int input){
     if(input>=1000&& input<=9999){
        return true ;
     }
     return false;
   }

}

class FindPin {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.generatedPin(3521, 2452, 1352, 38));

    }

    
}

