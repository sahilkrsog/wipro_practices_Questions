class Box{
    double height;
    double weidth;
    double depth;
    double volume (){
        return height*weidth*depth;

    }
}

class BReturnMethod {
    public static void main(String[] args) {
       Box mybox = new Box();
       mybox.height = 10;
       mybox.weidth = 20;
       mybox.depth = 30;
       System.out.println(mybox.volume()); 
    }
    
}
