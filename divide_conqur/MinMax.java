class Max {
    static int  DAC_Max(int arr[],int index, int l ){
        // if only two element are present 
        int max;
        if(index >= l-2){
            if(arr[index]>arr[index+1]){
                return  arr[index];
            }
            else{
                return arr[index+1];
            }
        }
            // checking for right elements 
            // recursively call the function for the rigth side elsements 
            max = DAC_Max(arr,index+1,l);
            if(arr[index]<max){
                return max;
            }
            else{
                return arr[index];
            }
         }
    }


class Min {
    static int DAC_Min(int[] arr, int index, int l) {
        // if i have only two elements are ;
        int min;
        if (index >= l - 2) {

            if (arr[index] < arr[index + 1]) {
                return arr[index];
            }

            else {
                return arr[index + 1];

            }
        }
        //call the fulnction recursively 
        min=DAC_Min(arr, index+1, l);
        if(arr[index]>min){
            return min;
        }
        else{
            return arr[index];

        }
    }

}

public class MinMax {
    public static void main(String[] args) {
        Max ma = new Max();
        Min mi = new Min();
        int[] arr = {10,30,20,1,2};
        System.out.println(mi.DAC_Min(arr, 0, arr.length));
        System.out.println(ma.DAC_Max(arr,0,arr.length));
        
    }

}
