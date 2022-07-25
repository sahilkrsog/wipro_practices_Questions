public class Countxx {
    public static void main(String[] args) {
        Countxx cout = new Countxx();
        System.out.println(cout.countXX("abcxxx"));
    }
    

int countXX(String str) {
    int i=0;
    int count =0;
    
    while(i<str.length()-1){
       char c = str.charAt(i); 
       char d = str.charAt(i+1);
      if(c == 'x' && d =='x'){
        // System.out.println(count);
            
        count++;
    }
    
    
    else if(count>=1 && str.charAt(i)=='x'){
        count++;
    }
    else{
        count = count +0;
    }
    i++;
      }
      return count ;
      
      
      
    
  }
}
  
